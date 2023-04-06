package com.api.tweterooapi.services;

import com.api.tweterooapi.model.Person;
import com.api.tweterooapi.repository.PersonRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person create(Person data) {
        return personRepository.save(data);
    }

    public List<Person> findByUsername(String username) {
        return personRepository.findByUsername(username);
    }
}
