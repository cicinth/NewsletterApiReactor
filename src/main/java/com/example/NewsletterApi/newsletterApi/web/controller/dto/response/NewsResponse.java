package com.example.NewsletterApi.newsletterApi.web.controller.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class NewsResponse {
    private Long id;
    private String title;
    private String text;
}
