package com.example.NewsletterApi.newsletterApi.repository;

import com.example.NewsletterApi.newsletterApi.repository.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<NewsEntity, Long> {
}
