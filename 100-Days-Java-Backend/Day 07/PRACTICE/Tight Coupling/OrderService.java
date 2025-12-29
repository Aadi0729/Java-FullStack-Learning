package com.practice.tight.couplingNew;

public class OrderService {
    private EmailNotification emailNotification = new EmailNotification();

    public String placeOrder() {
        return emailNotification.send();
    }
}
