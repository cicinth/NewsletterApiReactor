package com.example.NewsletterApi.newsletterApi.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscribes")
public class SubscribeController {

    @Autowired
    private SubscribeService subscribeService;

    @PostMapping
    public ResponseEntity<> createSubscribe(){

    }

    @GetMapping
    public ResponseEntity<List<>> getAllSubscribes(){

    }
}
