package com.example.autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    @Autowired /*This is doing field injection, It is used when there are alot of fields, and
                 Reduces the boilerplate code*/
    private Employee employee;

    @/*Autowired
    *//*This is doing constructor injection [As per the best practices, Constructor Injection is preferred over Field Injection]*//*
    public Manager(Employee employee) {
        this.employee = employee;
    }*/

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
