package com.api.tweterooapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.stereotype.Service;

import com.api.tweterooapi.model.Tweet;
import com.api.tweterooapi.repository.TweetRepository;

@Service
public class TweetService {
    @Autowired
    private TweetRepository tweetRepository;
    @Autowired
    private PersonService personService;

    public Tweet create(Tweet data) {
        if (!personService.findByUsername(data.getUsername()).isEmpty()) {
            data.setAvatar(personService.findByUsername(data.getUsername()).get(0).getAvatar());
            return tweetRepository.save(data);
        }
        return data;
    }

    public List<Tweet> getAll(int page) {
        PageRequest paging = PageRequest.of(page, 5);
        Page<Tweet> pagedResult = tweetRepository.findAllByOrderByIdDesc(paging);
        return pagedResult.getContent();
    }

    public List<Tweet> getByUsername(String username) {
        return tweetRepository.findByUsername(username);
    }

}
