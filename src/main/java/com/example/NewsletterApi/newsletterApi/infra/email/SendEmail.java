package com.example.NewsletterApi.newsletterApi.infra.email;

import com.example.NewsletterApi.newsletterApi.repository.SubscribedUsersRepository;
import com.example.NewsletterApi.newsletterApi.repository.entity.SubscribedUsersEntity;
import com.example.NewsletterApi.newsletterApi.web.controller.dto.response.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SendEmail {
    @Autowired
    SubscribedUsersRepository subscribedUsersRepository;

    public void send(NewsResponse newsResponse)  {
        List<SubscribedUsersEntity> subscribedUsersEntityList  = subscribedUsersRepository.findAll();
        subscribedUsersEntityList.forEach(user -> {
            //logica envio de email
            System.out.println("enviando email para "+ user.getEmail() + " com a noticia " + newsResponse.getTitle());
        });
    }
}
