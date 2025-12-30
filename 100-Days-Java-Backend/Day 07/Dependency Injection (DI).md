## Dependency Injection (DI)

**2.1 What Dependency Injection really is**

Dependency Injection is a technique used to achieve Inversion of Control by supplying dependencies from outside.

IoC is the principle.
DI is the mechanism.

**2.2 What is the dependency here ?**

In ```OrderService```:
```
private final NotificationService notificationService;
```
This is a ***dependency*** because:

- ```OrderService``` cannot function without it
- It delegates part of its work to it

**2.3 How DI is happening in your code**

***Constructor Injection (best form of DI)***
```
public OrderService(NotificationService notificationService) {
    this.notificationService = notificationService;
}
```

This tells the world:

“I cannot exist without a ```NotificationService```”

“Give it to me when you create me”

Then in ```main()```:
```
NotificationService smsService = new SmsNotification();
OrderService orderServiceWithSMS = new OrderService(smsService);
```

Here:

- Dependency is ***created externally***
- Passed into the constructor
- Stored and used internally

This is ***pure Dependency Injection***.

**2.4 Why this matters (real impact)**

Because of DI:

- You can swap Email ↔ SMS without touching ```OrderService```
- Testing becomes trivial (mock ```NotificationService```)
- Code becomes stable under change

Without DI:

- Changes ripple through code
- Tight coupling forms
- Maintenance becomes costly
