package com.example.NewsletterApi.newsletterApi.domain.utils;

import com.example.NewsletterApi.newsletterApi.repository.entity.SubscribedUsersEntity;
import com.example.NewsletterApi.newsletterApi.web.controller.dto.request.SubscribedUsersRequest;
import com.example.NewsletterApi.newsletterApi.web.controller.dto.response.SubscribedUsersResponse;

public class SubscribedUsersConvert {
    public static SubscribedUsersResponse toResponse(SubscribedUsersEntity entity) {
        SubscribedUsersResponse response = new SubscribedUsersResponse();
        response.setId(entity.getId());
        response.setEmail(entity.getEmail());
        response.setName(entity.getName());
        return response;
    }

    public static SubscribedUsersEntity toEntity(SubscribedUsersRequest subscribedUsersRequest) {
        SubscribedUsersEntity subscribedUsersEntity = new SubscribedUsersEntity();
        subscribedUsersEntity.setEmail(subscribedUsersRequest.getEmail());
        subscribedUsersEntity.setName(subscribedUsersRequest.getName());
        return subscribedUsersEntity;
    }
}
