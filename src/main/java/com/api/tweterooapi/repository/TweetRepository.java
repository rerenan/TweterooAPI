package com.api.tweterooapi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import com.api.tweterooapi.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
    Page<Tweet> findAllByOrderByIdDesc(PageRequest page);
}
