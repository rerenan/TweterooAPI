package com.api.tweterooapi.services;

import com.api.tweterooapi.model.Person;
import com.api.tweterooapi.repository.AuthRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private AuthRepository personRepository;

    public Person create(Person data) {
        return personRepository.save(data);
    }

    public List<Person> findByUsername(String username) {
        return personRepository.findByUsername(username);
    }
}
