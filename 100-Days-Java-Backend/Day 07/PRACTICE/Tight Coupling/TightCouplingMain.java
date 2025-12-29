package com.practice.tight.couplingNew;

public class TightCouplingMain {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        System.out.println(orderService.placeOrder());
    }
}
