package com.example.NewsletterApi.newsletterApi.domain.service;

import com.example.NewsletterApi.newsletterApi.domain.utils.SubscribedUsersConvert;
import com.example.NewsletterApi.newsletterApi.repository.SubscribedUsersRepository;
import com.example.NewsletterApi.newsletterApi.repository.entity.SubscribedUsersEntity;
import com.example.NewsletterApi.newsletterApi.web.controller.dto.request.SubscribedUsersRequest;
import com.example.NewsletterApi.newsletterApi.web.controller.dto.response.SubscribedUsersResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubscribedUsersService {

    @Autowired
    private SubscribedUsersRepository subscribedUsersRepository;


    public SubscribedUsersResponse createSubscribe(SubscribedUsersRequest subscribedUsersRequest){
        SubscribedUsersEntity subscribedUsersEntity = SubscribedUsersConvert.toEntity(subscribedUsersRequest);
        return SubscribedUsersConvert.toResponse(subscribedUsersRepository.save(subscribedUsersEntity));
    }
    public List<SubscribedUsersResponse> getAllSubscribes() {
        List<SubscribedUsersEntity> subscribedUsersEntityList =  subscribedUsersRepository.findAll();
        return subscribedUsersEntityList.stream().map(SubscribedUsersConvert::toResponse).collect(Collectors.toList());
    }
}
