package com.example.NewsletterApi.newsletterApi.infra.events;

import com.example.NewsletterApi.newsletterApi.web.controller.dto.response.NewsResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

@Component
public class NewsletterPublisher {
    private Sinks.Many<NewsResponse> newsSinks;

    public NewsletterPublisher(){
        this.newsSinks = Sinks.many().multicast().onBackpressureBuffer();
    }
    public void publish(NewsResponse news){
        this.newsSinks.tryEmitNext(news);
    }
    public Flux<NewsResponse> getNewsFlux() {
        return this.newsSinks.asFlux();
    }
}
