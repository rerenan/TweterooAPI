package com.api.tweterooapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.tweterooapi.model.Person;
import com.api.tweterooapi.model.Tweet;
import com.api.tweterooapi.repository.PersonRepository;
import com.api.tweterooapi.repository.TweetRepository;

@Service
public class TweetService {
    @Autowired
    private TweetRepository tweetRepository;
    @Autowired
    private PersonRepository personRepository;

    public Tweet create(Tweet data) {
        if (!findByUsername(data.getUsername()).isEmpty()) {
            data.setAvatar(findByUsername(data.getUsername()).get(0).getAvatar());
            return tweetRepository.save(data);
        }
        return data;
    }

    public List<Person> findByUsername(String username) {
        return personRepository.findByUsername(username);
    }
}
