package com.example.NewsletterApi.newsletterApi.web.controller.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SubscribedUsersResponse {
    private Long id;
    private String name;
    private String email;
}
