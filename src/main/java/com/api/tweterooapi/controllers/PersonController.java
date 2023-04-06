package com.api.tweterooapi.controllers;

import com.api.tweterooapi.services.PersonService;
import com.api.tweterooapi.dto.PersonDTO;
import com.api.tweterooapi.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")

public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping("/sign-up")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Person create(@RequestBody PersonDTO req) {
        return service.create(new Person(req));
    }
}
