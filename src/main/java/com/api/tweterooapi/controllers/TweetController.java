package com.api.tweterooapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.tweterooapi.dto.TweetDTO;
import com.api.tweterooapi.model.Tweet;
import com.api.tweterooapi.services.TweetService;

@RestController
@RequestMapping("/api/tweets")
public class TweetController {
    @Autowired
    private TweetService service;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Tweet create(@RequestBody TweetDTO req) {
        return service.create(new Tweet(req));
    }

    @GetMapping("/")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Tweet> getAll(@RequestParam String page) {
        return service.getAll(Integer.valueOf(page));
    }

}
