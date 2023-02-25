package org.example;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
