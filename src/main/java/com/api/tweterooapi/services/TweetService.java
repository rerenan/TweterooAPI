package com.api.tweterooapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.stereotype.Service;

import com.api.tweterooapi.model.Tweet;
import com.api.tweterooapi.model.TweetWithoutId;
import com.api.tweterooapi.repository.TweetRepository;

@Service
public class TweetService {
    @Autowired
    private TweetRepository tweetRepository;
    @Autowired
    private AuthService authService;

    public Tweet create(Tweet data) {
        if (!authService.findByUsername(data.getUsername()).isEmpty()) {
            data.setAvatar(authService.findByUsername(data.getUsername()).get(0).getAvatar());
            return tweetRepository.save(data);
        }
        return data;
    }

    public List<TweetWithoutId> getAll(int page) {

        PageRequest paging = PageRequest.of(page, 5);
        Page<TweetWithoutId> pagedResult = tweetRepository.findAllByOrderByIdDesc(paging);
        return pagedResult.getContent();
    }

    public List<Tweet> getByUsername(String username) {
        return tweetRepository.findByUsername(username);
    }

}
