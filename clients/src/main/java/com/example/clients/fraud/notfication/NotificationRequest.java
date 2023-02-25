package com.example.clients.fraud.notfication;

public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerName,
        String message
) {
}