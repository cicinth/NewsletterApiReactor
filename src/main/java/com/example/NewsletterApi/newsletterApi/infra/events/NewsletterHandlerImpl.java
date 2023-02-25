package com.example.NewsletterApi.newsletterApi.infra.events;

import com.example.NewsletterApi.newsletterApi.infra.email.SendEmail;
import com.example.NewsletterApi.newsletterApi.web.controller.dto.response.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.scheduler.Schedulers;

@Component
public class NewsletterHandlerImpl implements NewsletterHandler {
    @Autowired
    NewsletterPublisher newsletterPublisher;

    @Autowired
    SendEmail sendEmail;

    public NewsletterHandlerImpl(NewsletterPublisher newsletterPublisher){
        newsletterPublisher.getNewsFlux().subscribeOn(Schedulers.newSingle("new thred")).subscribe(
                news -> sendEmail.send(news),
                            error -> System.out.println("error " + error)
        );
    }

    @Override
    public void sendEvent(NewsResponse newsResponse) {
        newsletterPublisher.publish(newsResponse);
    }
}
