package com.example.NewsletterApi.newsletterApi.web.controller.dto.request;

import lombok.Getter;

@Getter
public class SubscribedUsersRequest {
    private String name;
    private String email;
}
