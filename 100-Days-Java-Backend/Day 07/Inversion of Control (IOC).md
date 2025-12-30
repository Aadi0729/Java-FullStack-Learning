## Inversion of Control (IoC)

**1. What problem IoC is solving**

In traditional programming, your code controls everything:

- It decides which object to create
- It decides when to create it
- It decides how dependencies are wired

That means you are in control.

Inversion of Control flips this responsibility.

**2. What IoC actually means**

Inversion of Control means the responsibility of creating and managing dependencies is moved out of the dependent class.

In simpler terms:

- Your class does not decide what implementation it uses
- It only declares what it needs
- Something else supplies it

That “something else” can be:

- Your main() method (as in code)
- A framework (like Spring)

**3. Where IoC is happening in your code**

Your ```OrderService``` does not control its dependency
```
public class OrderService {
    private final NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
```

Important observation:

```OrderService``` never creates ```EmailNotification``` or ```SmsNotification```

It accepts a ```NotificationService```

Control of dependency selection is outside ```OrderService```

That is ***Inversion of Control***.

**4. Who has the control now ?**

Look at ```LooseCouplingMain```:
```
NotificationService emailService = new EmailNotification();
OrderService orderServiceWithEmail = new OrderService(emailService);
```

Here:

```main()``` decides which implementation

```OrderService``` just uses it

Control has moved ***away from OrderService*** → ***IoC achieved***
