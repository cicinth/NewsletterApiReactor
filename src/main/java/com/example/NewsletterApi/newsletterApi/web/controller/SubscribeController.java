package com.example.NewsletterApi.newsletterApi.web.controller;

import com.example.NewsletterApi.newsletterApi.domain.service.SubscribedUsersService;
import com.example.NewsletterApi.newsletterApi.web.controller.dto.request.SubscribedUsersRequest;
import com.example.NewsletterApi.newsletterApi.web.controller.dto.response.SubscribedUsersResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/subscribes")
public class SubscribeController {

    @Autowired
    private SubscribedUsersService subscribeService;

    @PostMapping
    public ResponseEntity<SubscribedUsersResponse> createSubscribe(
            @RequestBody SubscribedUsersRequest subscribedUsersRequest
    ){
        SubscribedUsersResponse subscribedUsersResponse = subscribeService.createSubscribe(subscribedUsersRequest);
        return ResponseEntity.created(URI.create("/subscribes/"+ subscribedUsersResponse.getId())).body(subscribedUsersResponse);
    }

    @GetMapping
    public ResponseEntity<List<SubscribedUsersResponse>> getAllSubscribes(){
        List<SubscribedUsersResponse> subscribedUsersResponseList = subscribeService.getAllSubscribes();
        return ResponseEntity.ok(subscribedUsersResponseList);
    }
}
