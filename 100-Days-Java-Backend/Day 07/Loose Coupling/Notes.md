### LOOSE COUPLING

**1.**
- Loose Coupling is a design principle that aims to reduce the dependencies between components within a system.
- It means a high - level code depends on the abstractions, NOT on concreate implementations.

**In practical terms:**

- You can change implementations
- Without changing the client code
- And without breaking existing behavior

This principle is formally known as the **Dependency Inversion Principle (DIP)**.

**2. The root problem: tight coupling**

```
class OrderService {
    private EmailNotification emailNotification = new EmailNotification();

    public void placeOrder() {
        emailNotification.send();
    }
}
```

**Why this is tightly coupled:**

- OrderService directly creates EmailNotification
- You cannot switch to SMS / WhatsApp / Push without modifying OrderService
- Hard to test (cannot mock)

*Key issue:*
High-level class depends on a concrete class.

**3. The solution: depend on abstraction (interface or abstract class)**

*Step 1: Define an abstraction*

***Option A: Interface (preferred)***
```
public interface NotificationService {
    void send();
}
```
***Option B: Abstract class***
```
public abstract class NotificationService {
    public abstract void send();
}
```
Both serve the same purpose: define a contract, not behavior (mostly).

**4. Step 2: Implement the abstraction**
```
public class EmailNotification implements NotificationService {
    @Override
    public void send() {
        System.out.println("Sending Email");
    }
}

public class SmsNotification implements NotificationService {
    @Override
    public void send() {
        System.out.println("Sending SMS");
    }
}
```

**5. Step 3: Inject the dependency (this is where loose coupling happens)**
```
class OrderService {

    private final NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void placeOrder() {
        notificationService.send();
    }
}
```

**Usage**
```
NotificationService notification = new EmailNotification();
OrderService service = new OrderService(notification);
service.placeOrder();
```

Or later:
```
NotificationService notification = new SmsNotification();
OrderService service = new OrderService(notification);
service.placeOrder();
```

**What changed?**

- OrderService does not care how notification is sent
- You can swap implementations freely
- Zero modification in OrderService

This is ***loose coupling***.

**6. Why interface works so well for loose coupling**
***Key characteristics of interfaces:***

- No state (usually)
- Pure contract
- Multiple implementations allowed
- Forces “program to interface” discipline

***Mental model:***

- Interface = What can be done
- Class = How it is done

**7. When to use abstract class instead of interface ?**

Use ***abstract class*** when:

- You want ***partial implementation***
- You want to share ***base logic***
- You need ***protected fields or methods***

**Example with abstract class**
```
public abstract class PaymentService {

    public void logTransaction() {
        System.out.println("Logging transaction");
    }

    public abstract void pay();
}
```
```
public class CreditCardPayment extends PaymentService {
    @Override
    public void pay() {
        System.out.println("Paying via credit card");
    }
}
```

Client code:
```
class CheckoutService {
    private final PaymentService paymentService;

    public CheckoutService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void checkout() {
        paymentService.logTransaction();
        paymentService.pay();
    }
}
```
Still ***loosely coupled*** because:

- Client depends on abstraction
- Implementation can change
