package com.example.NewsletterApi.newsletterApi.domain.utils;

import com.example.NewsletterApi.newsletterApi.repository.entity.NewsEntity;
import com.example.NewsletterApi.newsletterApi.web.controller.dto.request.NewsRequest;
import com.example.NewsletterApi.newsletterApi.web.controller.dto.response.NewsResponse;

public class NewsConvert {
    public static NewsResponse toResponse(NewsEntity entity){
        NewsResponse response = new NewsResponse();
        response.setId(entity.getId());
        response.setTitle(entity.getTitle());
        response.setText(entity.getText());
        return response;
    }

    public static NewsEntity toEntity(NewsRequest newsRequest){
        NewsEntity newsEntity = new NewsEntity();
        newsEntity.setTitle(newsRequest.getTitle());
        newsEntity.setText(newsRequest.getText());
        return newsEntity;
    }
}
