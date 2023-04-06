package com.api.tweterooapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.tweterooapi.model.Person;

public interface UserRepository extends JpaRepository<Person, Long> {

}
