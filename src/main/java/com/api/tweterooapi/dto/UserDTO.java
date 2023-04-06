package com.api.tweterooapi.dto;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotBlank;

public record userDTO(
        @NotBlank String username,
        @NotBlank @URL String avatar) {

}
