package com.project.DogAPIs.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * We'll use @ResponseStatus along with an HttpStatus of NOT_FOUND to return a message (or reason in code) if an invalid ID was used.
 */

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Dog not found")
public class DogNotFoundException extends RuntimeException {
    public DogNotFoundException() {
    }

    public DogNotFoundException(String message) {
        super(message);
    }
}
