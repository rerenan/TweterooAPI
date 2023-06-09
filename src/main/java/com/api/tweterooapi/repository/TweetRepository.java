package com.api.tweterooapi.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import com.api.tweterooapi.model.Tweet;
import com.api.tweterooapi.model.TweetWithoutId;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
    Page<TweetWithoutId> findAllByOrderByIdDesc(PageRequest page);

    List<Tweet> findByUsername(String username);
}
