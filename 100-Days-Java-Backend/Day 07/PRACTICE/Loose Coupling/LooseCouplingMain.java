package com.practice.loose.couplingNew;

public class LooseCouplingMain {
    public static void main(String[] args) {

        NotificationService emailService = new EmailNotification();
        OrderService orderServiceWithEmail = new OrderService(emailService);
        System.out.println(orderServiceWithEmail.getNotification());

        NotificationService smsService = new SmsNotification();
        OrderService orderServiceWithSMS = new OrderService(smsService);
        System.out.println(orderServiceWithSMS.getNotification());
    }
}
