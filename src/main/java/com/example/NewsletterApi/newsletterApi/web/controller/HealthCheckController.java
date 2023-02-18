package com.example.NewsletterApi.newsletterApi.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/health-check")
    public ResponseEntity<String> healthCheck(){
        return ResponseEntity.ok("Application running");
    }
}
