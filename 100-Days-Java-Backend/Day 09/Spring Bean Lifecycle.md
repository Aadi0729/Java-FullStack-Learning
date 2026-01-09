## Spring Bean Lifecycle — Step by Step (Beginner, From Zero)

**First: what does “lifecycle” even mean?**

For a Spring Bean, lifecycle means:

From the moment Spring decides a bean should exist
to the moment Spring destroys it
what exactly happens, and in what order?

A bean is not just created and used.
It goes through multiple controlled steps.

**Big picture (keep this in mind)**

Every Spring Bean goes through these stages:

1. Spring learns about the bean
2. Spring creates the object
3. Spring injects dependencies
4. Spring initializes the bean
5. Bean is used by the application
6. Spring destroys the bean

Now we go one step at a time, in detail.

### STEP 0: Before anything happens (important)

At the very beginning:

- JVM starts
- main() starts running
- Spring does not exist yet
- No beans exist
- No lifecycle has started

Nothing happens until you start Spring.

### STEP 1: You start the Spring Container

This line is the trigger for everything:
```
ApplicationContext context =
    new ClassPathXmlApplicationContext("applicationBeanContext.xml");
```

What this means in plain English:

- “Spring, start yourself and manage my objects.”

From this point:

- Spring is in control
- Lifecycle management begins

### STEP 2: Spring reads configuration (NO object yet)

Spring opens ```applicationBeanContext.xml``` and reads:
```
<bean id="myBean" class="car.example.bean.MyBean">
```

At this moment:

- ❌ No MyBean object exists
- ❌ No constructor is called
- ❌ Nothing is created

Spring only understands instructions.

Internally, Spring creates something called a BeanDefinition.

**Think of it like this:**

A BeanDefinition is a recipe, not the food.

### STEP 3: Spring decides it must create the bean

Spring now asks:

- “Should I create this bean now?”

By default:

- Beans are eager
- So Spring says YES

Now the real lifecycle begins.

### STEP 4: Bean Instantiation (Object is created)

Spring now creates the object.

Internally, Spring does:
```
MyBean obj = new MyBean();
```

Important things to understand here:

- ❌ You did not call new
- ❌ main() did not call constructor
- ✅ Spring called the constructor
- ✅ This is Inversion of Control

At this point:

- Object exists in memory
- Fields are still null
- Bean is not ready

### STEP 5: Dependency Injection (Wiring happens)

Spring now looks at XML:
```
<property name="message" value="I am a first bean"/>
```

Spring performs:
```
obj.setMessage("I am a first bean");
```

What just happened?

- Spring injected data into the object
- This is Dependency Injection
- Object is now wired

But still:

- ❌ Not fully initialized
- ❌ Not ready to be used

### STEP 6: Awareness callbacks (optional, advanced)

Spring now asks the bean:

- “Do you want to know anything about me (the container)?”

If your bean implements interfaces like:

- BeanNameAware
- ApplicationContextAware

Spring calls methods like:
```
setBeanName("myBean");
setApplicationContext(context);
```

For beginners:

You usually don’t implement these

But Spring still checks

This step happens automatically.

### STEP 7: Initialization phase (VERY IMPORTANT)

Now Spring says:
```
“Okay, object exists and dependencies are injected.
Final chance to prepare yourself.”
```
This is where initialization methods run.

Examples:

- ```@PostConstruct```
- ```init-method``` in XML
- ```afterPropertiesSet()```

Example:
```
@PostConstruct
public void init() {
    // validation, setup, resource allocation
}
```

This is where you:

- Validate configuration
- Open connections
- Prepare the bean

Important beginner rule:

❌ Do NOT put heavy logic in constructor
✅ Put setup logic in init phase

### STEP 8: Bean is READY (steady state)

Now the bean is:

- Fully created
- Fully wired
- Fully initialized
- Safe to use

Spring stores it internally.

Now:

- ```getBean()``` returns it
- Other beans can depend on it
- Application logic uses it

This phase lasts most of the application lifetime.

### STEP 9: Application runs normally

At this stage:

- You call methods on the bean
- Business logic runs
- Spring stays in background

Nothing lifecycle-related happens here.

### STEP 10: Application shuts down

When:

- JVM exits
- OR context.close() is called

Spring starts destruction phase.

### STEP 11: Bean Destruction (cleanup)

Spring now calls destroy methods.

Examples:

- @PreDestroy
- destroy-method in XML
- DisposableBean

Example:
```
@PreDestroy
public void cleanup() {
    // close connections, release resources
}
```

This is where you:

- Close DB connections
- Stop threads
- Release resources

After this:

- Bean is gone
- Lifecycle ends

### COMPLETE lifecycle flow (beginner-friendly)
```
Spring starts
↓
Reads configuration (no object)
↓
Creates object (constructor)
↓
Injects dependencies
↓
Runs init methods
↓
Bean ready for use
↓
Application runs
↓
Spring shuts down
↓
Runs destroy methods
```

### One simple rule to remember (VERY IMPORTANT)

| Phase       | Purpose         |
| ----------- | --------------- |
| Constructor | Object exists   |
| Injection   | Object wired    |
| Init        | Object prepared |
| Use         | Business logic  |
| Destroy     | Cleanup         |

```
Spring controls when an object is created, how it is configured, when it is ready, and when it is destroyed.

That control is the Spring Bean Lifecycle.
```
