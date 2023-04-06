package com.api.tweterooapi.model;

import com.api.tweterooapi.dto.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor

public class Tweet {

    public Tweet(TweetDTO data) {
        this.username = data.username();
        this.text = data.tweet();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 35, nullable = false)
    private String username;

    @Column(nullable = false)
    private String avatar;

    @Column(length = 400, nullable = false)
    private String text;
}