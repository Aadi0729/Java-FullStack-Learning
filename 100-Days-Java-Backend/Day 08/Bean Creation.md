# Spring Bean Creation – From Absolute Scratch (Line-by-Line)

This document explains **how a Spring Bean is created internally**, step by step, using **XML-based configuration**.

Focus:
- No Spring Boot
- No annotations
- No shortcuts
- Only **Bean creation mechanics**
- Explained at **execution level**

---

## 1. What Is a Spring Bean?

A **Spring Bean** is:

> An object that is **created, configured, and managed** by the Spring Container.

If Spring does NOT create an object:
- It is **not** a Spring Bean
- Spring does not manage its lifecycle

---

## 2. Files Involved in Bean Creation

We use **three files**:

1. `MyBean.java` → Plain Java class  
2. `applicationBeanContext.xml` → Configuration metadata  
3. `App.java` → Bootstraps Spring Container  

Spring Bean creation happens **because these three work together**.

---

## 3. Bean Class (`MyBean.java`)

```java
package car.example.bean;

public class MyBean {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showMessage() {
        System.out.println("Message: " + message);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
```

### Important observations

- This is a **POJO** (Plain Old Java Object)
- No Spring imports
- No annotations
- No ```new``` keyword used here
- Spring has no dependency on this class at compile time

Spring will later create this object **using reflection**.

## 4. XML Configuration (applicationBeanContext.xml)
```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="myBean" class="car.example.bean.MyBean">
        <property name="message" value="I am a first bean"/>
    </bean>

</beans>
```

### What this XML actually is

- This file is **NOT executed**
- It is **configuration metadata**
- It tells Spring:
  - What class to create
  - How to configure it
 
Meaning of ```<bean>``` tag
```
<bean id="myBean" class="car.example.bean.MyBean">
```
Spring understands:

- Bean ID → ```"myBean"```
- Class to instantiate → ```MyBean```

Spring internally creates a **BeanDefinition**, not the object yet.

Meaning of ```<property>```
```
<property name="message" value="I am a first bean"/>
```

This means:

After creating the object, call:
```
setMessage("I am a first bean");
```
This is **Setter Injection**.

## 5. Application Entry Point (App.java)
```
package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        MyBean myBean = (MyBean) context.getBean("myBean");
        System.out.println(myBean);
    }
}
```
This file controls when **Spring starts**.

## 6. Actual Execution Flow (Line-by-Line)

**STEP 1: JVM starts**
```
public static void main(String[] args)
```

At this point:

- No Spring Container
- No Beans
- Only JVM + your code

**STEP 2: Spring Container is created**
```
new ClassPathXmlApplicationContext("applicationBeanContext.xml");
```

This is **THE MOST IMPORTANT LINE**.

What happens internally:

1. Spring container object is created
2. XML file is located from classpath
3. XML is parsed
4. Bean metadata is read
5. BeanDefinitions are registered
6. **Eager beans are created**

Spring is now fully started.

## 7. BeanDefinition Phase (Metadata Only)

From XML, Spring internally stores something like:
```
BeanDefinition:
- id: myBean
- class: car.example.bean.MyBean
- properties:
    message = "I am a first bean"
```

At this stage:

- No object exists
- Only instructions exist

## 8. Bean Instantiation Phase (Actual Object Creation)

Since beans are eager by default, Spring immediately creates the bean.

Internally Spring executes:
```
MyBean obj = new MyBean();
```

Important:

- You did NOT write this code
- Spring called your constructor
- This is **Inversion of Control**

## 9. Dependency Injection Phase

Spring sees:
```
<property name="message" value="I am a first bean"/>
```

Spring performs:
```
obj.setMessage("I am a first bean");
```

How?

- Using Java Reflection
- Method resolved at runtime

Now:

- Object is fully configured

## 10. Bean Registration Phase

Spring stores the bean internally:
```
singletonObjects:
  "myBean" → MyBean{message="I am a first bean"}
```

From now on:

- Spring owns this object
- Lifecycle is managed by Spring

## 11. Retrieving the Bean

```
context.getBean("myBean");
```
What this does:

- Looks up ```"myBean"``` in container
- Returns existing object

Important:

- No new object created here
- Constructor is NOT called again

## 12. Bean Creation vs Bean Retrieval
| Action         | Happens When                      |
| -------------- | --------------------------------- |
| Bean creation  | ApplicationContext initialization |
| Bean retrieval | `getBean()` call                  |

Creation and usage are **decoupled**.

## 13. Constructor Control (Critical Insight)

Two constructors exist:
| Constructor                        | Called By | Purpose      |
| ---------------------------------- | --------- | ------------ |
| `ClassPathXmlApplicationContext()` | You       | Start Spring |
| `MyBean()`                         | Spring    | Create bean  |

Execution order:
```
main()
  ↓
Spring constructor
  ↓
Bean constructor
```

This is **Inversion of Control at execution level**.

## 14. Lazy vs Eager (Creation Timing)

- **Default**: Eager
  - Bean created at container startup

**Lazy**:

- Bean created only when ```getBean()``` is called

In this example:

- Bean is eager
- Created even if ```getBean()``` is removed

Spring Bean creation happens during ApplicationContext initialization, not during ```getBean()```.

## Bean Creation in One Flow
```
JVM starts
↓
Spring container constructor called
↓
XML parsed → BeanDefinition created
↓
Bean instantiated via reflection
↓
Setter injection performed
↓
Bean stored inside container
↓
getBean() returns existing object
```

Spring Bean creation is not magic.

It is:

Controlled object creation based on configuration metadata, executed by the Spring Container.
