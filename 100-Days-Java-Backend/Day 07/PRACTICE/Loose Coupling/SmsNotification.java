package com.practice.loose.couplingNew;

public class SmsNotification implements NotificationService {

    @Override
    public String send() {
        return "SMS Sent";
    }
}
