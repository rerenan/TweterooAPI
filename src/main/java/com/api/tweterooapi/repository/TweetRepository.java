package com.api.tweterooapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.tweterooapi.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

}
