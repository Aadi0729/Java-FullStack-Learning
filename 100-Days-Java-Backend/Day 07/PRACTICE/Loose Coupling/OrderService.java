package com.practice.loose.couplingNew;

public class OrderService {
    private final NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public String placeOrder() {
        return notificationService.send();
    }
}
