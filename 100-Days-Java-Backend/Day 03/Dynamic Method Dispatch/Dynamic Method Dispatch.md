## Introduction

- Dynamic Method Dispatch, also known as **Runtime Polymorphism**, is one of the most powerful concepts in Java's object-oriented programming.
- It allows Java to determine which method to invoke at runtime rather than compile time.
- This feature is fundamental in achieving **method overriding ** and is widely used in real-world applications.

## Understanding Dynamic Method Dispatch

In Java, method calls are resolved dynamically at runtime using **Dynamic Method Dispatch**. 
This mechanism enables **a superclass reference variable to refer to a subclass object**, and Java determines which overridden method to execute based on the actual object type.

**Key Points:**

- It enables **runtime polymorphism**.
- Method invocation is determined by the object that the reference variable refers to (not the type of reference itself).
- It allows for **flexible and maintainable** code by supporting method overriding.

****Example: Dynamic Method Dispatch****

Let's take an example to understand Dynamic Method Dispatch in action:
```
// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animals make different sounds");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class DynamicDispatchExample {
    public static void main(String[] args) {
        // Parent class reference pointing to child class object
        Animal myAnimal;

        // Assigning Dog object to Animal reference
        myAnimal = new Dog();
        myAnimal.makeSound(); // Output: Dog barks

        // Assigning Cat object to Animal reference
        myAnimal = new Cat();
        myAnimal.makeSound(); // Output: Cat meows
    }
}
```

**Explanation of the Code:**

1. The **Animal** class defines a method ```makeSound()```, which is overridden by the **Dog** and **Cat** classes.
2. The reference variable **myAnimal** is of type ```Animal```, but it holds objects of **Dog** and **Cat** at different times.
3. When ```makeSound()``` is called, **Java determines the correct method implementation at runtime**, based on the actual object type.

**Why Use Dynamic Method Dispatch?**

- *Achieves Runtime Polymorphism:* Allows the program to be more flexible and scalable.
- *Enhances Code Reusability:* A superclass reference can be used for multiple subclass objects.
- *Improves Maintainability:* Reduces dependencies between different parts of the code.

**Real-World Use Case**

Imagine you are developing a **payment system** where different payment methods (Credit Card, PayPal, UPI) should have their own processing logic. 
Using **Dynamic Method Dispatch**, you can achieve this as follows:

```
// Parent class
class Payment {
    void processPayment() {
        System.out.println("Processing generic payment");
    }
}

// Child class 1
class CreditCardPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing credit card payment");
    }
}

// Child class 2
class PayPalPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing PayPal payment");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment payment;

        // Process Credit Card Payment
        payment = new CreditCardPayment();
        payment.processPayment(); // Output: Processing credit card payment

        // Process PayPal Payment
        payment = new PayPalPayment();
        payment.processPayment(); // Output: Processing PayPal payment
    }
}
```

**Important Notes**

- Dynamic Method Dispatch only works with *method overriding*, not with method overloading.
- *Private, static, and final methods are not overridden*, so they do not participate in Dynamic Method Dispatch.
