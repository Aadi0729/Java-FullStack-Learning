## Beans

**1. What is a Bean (conceptually)**

A Bean is an object whose lifecycle is managed by a container.

***In Spring:***

- The container creates objects
- Injects dependencies
- Manages scope and lifecycle

**2. Am I using beans right now ?**

No.
I am using manual object creation.

***Example:***
```
NotificationService emailService = new EmailNotification();
```

This object is:

- Created by me
- Managed by me
- Destroyed by JVM

So it is ***not a Spring Bean.***

**3. How this same code looks with Beans (conceptual)**

If Spring were managing this:
```
@Component
public class EmailNotification implements NotificationService {
}
```
```
@Service
public class OrderService {

    private final NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
```

Now:

- Spring creates ```EmailNotification```
- Spring creates ```OrderService```
- Spring injects ```NotificationService```
- You don’t call ```new``` at all

These objects are ***Beans***.

**4. Key difference (very important)**
| Aspect            | Your Code | Spring    |
| ----------------- | --------- | --------- |
| Object creation   | Manual    | Automatic |
| Dependency wiring | Manual    | Automatic |
| IoC               | Yes       | Yes       |
| DI                | Yes       | Yes       |
| Beans             | No        | Yes       |
This code is Spring-ready, just not Spring-powered yet.
