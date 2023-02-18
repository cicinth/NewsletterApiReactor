package com.example.NewsletterApi.newsletterApi.repository;

import com.example.NewsletterApi.newsletterApi.repository.entity.SubscribedUsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscribedUsersRepository extends JpaRepository<SubscribedUsersEntity, Long> {
}
