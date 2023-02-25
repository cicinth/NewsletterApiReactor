package com.example.NewsletterApi.newsletterApi.infra.events;

import com.example.NewsletterApi.newsletterApi.web.controller.dto.response.NewsResponse;
import org.springframework.stereotype.Component;

@Component
public interface NewsletterHandler {
    void sendEvent(NewsResponse newsResponse);
}
