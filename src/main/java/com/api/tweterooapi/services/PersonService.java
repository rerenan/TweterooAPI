package com.api.tweterooapi.services;

import com.api.tweterooapi.model.Person;
import com.api.tweterooapi.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository repository;

    public Person create(Person data) {
        return repository.save(data);
    }
}
