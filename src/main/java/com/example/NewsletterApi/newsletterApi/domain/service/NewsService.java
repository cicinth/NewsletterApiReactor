package com.example.NewsletterApi.newsletterApi.domain.service;

import com.example.NewsletterApi.newsletterApi.domain.utils.NewsConvert;
import com.example.NewsletterApi.newsletterApi.infra.events.NewsletterHandler;
import com.example.NewsletterApi.newsletterApi.infra.events.NewsletterPublisher;
import com.example.NewsletterApi.newsletterApi.repository.NewsRepository;
import com.example.NewsletterApi.newsletterApi.repository.entity.NewsEntity;
import com.example.NewsletterApi.newsletterApi.web.controller.dto.request.NewsRequest;
import com.example.NewsletterApi.newsletterApi.web.controller.dto.response.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    NewsletterHandler newsletterHandler;

    public NewsResponse createNews(NewsRequest newsRequest){
        NewsEntity newsEntity = NewsConvert.toEntity(newsRequest);
        newsRepository.save(newsEntity);
        NewsResponse newsResponse = NewsConvert.toResponse(newsEntity);
        newsletterHandler.sendEvent(newsResponse);
        return newsResponse;
    }

    public List<NewsResponse> getAllNews(){
        List<NewsEntity> newsList = newsRepository.findAll();
        return newsList.stream().map(NewsConvert::toResponse).collect(Collectors.toList());
    }

}
