package org.example;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
    public void s() {
        CustomerController customerController = new CustomerController( new CustomerService());
    }
}
