package com.example.NewsletterApi.newsletterApi.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @PostMapping
    public ResponseEntity<NewsResponse> createNews(@RequestBody NewsRequest newsRequest){
    }

    @GetMapping
    public ResponseEntity<List<NewsResponse>> getAllNews(){

    }
}
