package com.practice.loose.couplingNew;

public class EmailNotification implements NotificationService {

    @Override
    public String send() {
        return "Email sent";
    }
}
