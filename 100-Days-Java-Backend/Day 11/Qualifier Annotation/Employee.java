package com.example.qualiferAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee") // We can provide the custom name of bean in this way
public class Employee {
    @Value("1")
    private int employeeId;

    @Value("Aditya")
    private String firstName;

    @Value("${java.home}")
    private String javaHome;

    @Value("#{5*5}")
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getLastName() {
        return javaHome;
    }

    public void setLastName(String lastName) {
        this.javaHome = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", javaHome='" + javaHome + '\'' +
                ", salary=" + salary +
                '}';
    }
}
