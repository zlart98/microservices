package org.example.clients.notfication;

public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerName,
        String message
) {
}