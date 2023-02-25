package com.example.NewsletterApi.newsletterApi.web.controller;

import com.example.NewsletterApi.newsletterApi.domain.service.NewsService;
import com.example.NewsletterApi.newsletterApi.web.controller.dto.request.NewsRequest;
import com.example.NewsletterApi.newsletterApi.web.controller.dto.response.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @PostMapping
    public ResponseEntity<NewsResponse> createNews(@RequestBody NewsRequest newsRequest){
       NewsResponse newsResponse =  newsService.createNews(newsRequest);
       return ResponseEntity.created(URI.create("/news/"+ newsResponse.getId())).body(newsResponse);
    }

    @GetMapping
    public ResponseEntity<List<NewsResponse>> getAllNews(){
        return ResponseEntity.ok(newsService.getAllNews());
    }
}
