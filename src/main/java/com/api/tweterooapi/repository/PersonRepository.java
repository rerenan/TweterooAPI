package com.api.tweterooapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.tweterooapi.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByUsername(String username);
}
