## Constructor Injection — Built on What You Already Know

We will answer **one core question** throughout:

How is Spring doing the *same thing* I used to do in ```main()```, but in a safer, stricter way?

#### 1. First, forget Spring for a moment (manual version)

Let’s rewrite your example without Spring, the way you would do it manually.

**Manual wiring (no Spring)**
```
public static void main(String[] args) {

    Specification spec = new Specification();
    spec.setMake("Toyota");
    spec.setModel("Corolla");

    Car car = new Car(spec);   // constructor injection
    car.displayDetails();
}
```

**What is happening here?**

- ```main()``` creates ```Specification```
- ```main()``` configures ```Specification```
- ```main()``` passes it into ```Car``` via constructor
- ```Car``` cannot exist without ```Specification```

This is:

- ✅ Loose coupling
- ✅ Safe
- ✅ Clear dependency relationship

**Constructor Injection already exists without Spring.**

Spring did not invent it.

**2. What problem Spring is solving here**

Now ask:

What if I have 50 such objects?

What if ```Specification``` changes?

What if I forget to pass it?

What if another developer wires it incorrectly?

Spring’s job is to:

- Take this wiring logic out of ```main()```
- Enforce it **consistently**
- Make it **impossible to misuse**

**3. Now let’s bring Spring back in (your App.java)**

```
ApplicationContext context =
    new ClassPathXmlApplicationContext("applicationConstructorInjection.xml");
```

This line:

Starts the Spring Container

Hands over **all object creation and wiring**

Replaces your old manual ```main()``` logic

From now on:

- You do not create objects
- You do not inject dependencies
- You do not decide order

Spring does.

**4. Understanding the XML (this is the wiring logic)**

****Specification bean****
```
<bean id="carSpecification"
      class="car.example.constructor.injection.Specification">
    <property name="make" value="Toyota"/>
    <property name="model" value="Corolla"/>
</bean>
```

Spring learns:

There is a bean called ```carSpecification```

It must:

1. Create Specification
2. Call setMake("Toyota")
3. Call setModel("Corolla")

This is **setter injection** for ```Specification```.

So far, nothing new.

**Car bean (THIS is constructor injection)**
```
<bean id="myCar"
      class="car.example.constructor.injection.Car">
    <constructor-arg ref="carSpecification"/>
</bean>
```
This line is **the heart of constructor injection**.

Spring reads it as:

“When creating ```Car```, pass the ```carSpecification``` bean into its constructor.”

**5. What Spring does internally (line-by-line, in order)**

Let’s walk the lifecycle ****exactly as it happens****.

**Step 1: Spring starts (ApplicationContext)**
```
new ClassPathXmlApplicationContext(...)
```
- XML is read
- BeanDefinitions are created
- No objects yet

**Step 2: Spring creates Specification**

Spring internally does:
```
Specification spec = new Specification();
spec.setMake("Toyota");
spec.setModel("Corolla");
```
Now:

- ```Specification``` is fully ready
- Stored inside the container
This happens first, because ```Car``` depends on it.

**Step 3: Spring creates Car (constructor injection happens)**
Spring now sees:
```
<constructor-arg ref="carSpecification"/>
```

So Spring executes internally:
```
Car car = new Car(spec);
```

⚠️ **This is the most important moment:**

- Spring calls the constructor
- Dependency is injected *at creation time*
- ```Car``` can never exist without ```Specification```

This is **stronger than setter injection**.

**6. Why this enforces loose coupling better than setter injection**
Your ```Car``` class
```
public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }
}
```

**What this guarantees**

- ```Car``` **cannot be created** without ```Specification```
- No partially initialized object
- No forgotten dependency
- No invalid state

Spring **enforces correctness** here.

**7. Compare setter vs constructor injection (important)**
****Setter Injection (can break)****
```
Car car = new Car();
car.setSpecification(null);   // ❌ possible
```
Object can exist in a **broken state**.

****Constructor Injection (cannot break)****
```
new Car(null); // ❌ prevented by design
```
Spring must supply a dependency, or startup fails.

This is why:

**Constructor Injection is preferred in Spring**

## EXPLANATION OF POINT 7

**Forget Spring for a moment (this is crucial)**

We will first understand this in plain Java, because Spring only *enforces* what Java already allows or disallows.

**Setter Injection in plain Java (why it can break)**

Your ```Car``` class with setter injection
```
public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println(specification.toString());
    }
}
```

How Java allows this object to be created
```
Car car = new Car();   // ✅ allowed
```
At this moment:

- ```specification == null```
- Object *exists*
- But object is *not usable*

Now someone can do this:
```
car.setSpecification(null);  // ❌ allowed by Java
```

Or forget to call it at all:
```
Car car = new Car();
// forgot to inject specification
car.displayDetails(); // 💥 NullPointerException
```

**❗ Key problem**

With setter injection:

- Java allows object creation **without dependencies**
- The object can exist in an **invalid or broken state**
- The compiler cannot stop this

Spring cannot **fully prevent this**, because Java itself allows it.

**Why this is dangerous in large applications**

In small code:

- You remember to call setters

In large teams:

- Someone forgets
- Someone injects ```null```
- Someone changes wiring order

Result:

- Runtime errors
- Hard-to-debug bugs

So the **problem is not Spring** —
the problem is **Java allowing incomplete objects**.

**Constructor Injection in plain Java (why it cannot break)**
Now look at your ```Car``` class:
```
public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }
}
```

**What Java now enforces**
This is *not allowed* anymore:
```
Car car = new Car();   // ❌ compilation error
```

Java says:

“You MUST provide a Specification.”

Even this is allowed syntactically:
```
new Car(null);  // ⚠️ technically allowed
```

But here is the **critical difference**.

**Why Spring prevents new Car(null)**

In Spring, you never write:
```
new Car(null);
```

Spring creates objects based on configuration metadata:
```
<constructor-arg ref="carSpecification"/>
```

This tells Spring:

- Find a bean named ```carSpecification```
- Pass it into the constructor

Now ask:

What if ```carSpecification``` does not exist?

**Spring’s behavior**

- Spring fails at startup
- Application does not start
- You get a clear configuration error

Spring will never silently pass null.

So in Spring:

- Either dependency exists
- Or application fails early

This is **fail-fast**, which is good.

**The key difference**
**Setter Injection**
| Property                            | Result   |
| ----------------------------------- | ------   |
| Object can exist without dependency | ✅      |
| Dependency can be forgotten         | ✅      |
| Null allowed silently               | ✅      |
| Errors appear at runtime            | ❌      |

**Constructor Injection**
| Property                               | Result   |
| -------------------------------------- | ------   |
| Object cannot exist without dependency | ❌      |
| Dependency mandatory                   | ✅      |
| Spring enforces injection              | ✅      |
| Errors fail at startup                 | ✅      |

**Why this matters for loose coupling**
Loose coupling does not mean “optional dependencies”.

Loose coupling means:

A class does not control how its dependencies are created,
but it clearly declares what it needs to function.

Constructor injection does this perfectly:
```
public Car(Specification specification)
```

This line literally says:

“I cannot exist without Specification.”

That is *honest design*.

Setter injection says:

“I might need Specification… maybe… later…”

That ambiguity is the problem.

**Connecting back to your main() method understanding**
Manual ```main()``` (safe)
```
Specification spec = new Specification();
Car car = new Car(spec);   // dependency guaranteed
```

You never wrote:
```
Car car = new Car();
```
Spring constructor injection is simply automating this safe pattern.

```
Constructor injection prevents broken objects by making required dependencies mandatory at creation time, and Spring enforces this by failing fast if dependencies are missing.
```

- **Constructor injection** → mandatory dependencies
- **Setter injection** → optional dependencies

This rule exists because of object validity, not fashion.

```
Constructor injection is like building a car with an engine installed at the factory, while setter injection is like adding accessories after purchase.
```

**8. Where loose coupling is enforced (very clearly)**

Loose coupling is enforced at **three exact points:**

1️⃣ **Creation control**

- ```Car``` does not create ```Specification```
- Spring creates both

2️⃣ **Dependency decision**

- ```Car``` does not choose implementation
- Configuration chooses (```carSpecification```)

3️⃣ **Lifecycle control**

- ```Car``` does not decide when it exists
- Spring decides when constructor is called

This is *the same separation you achieved in* ```main()```, but:

- Centralized
- Automatic
- Safe
- Scalable

**9. What ```getBean()``` does now**
```
Car myCar = (Car) context.getBean("myCar");
```

This:

- Does NOT create ```Car```
- Simply returns the already-created object
- Constructor injection already happened earlier

Creation ≠ retrieval (as you already learned).

**10. The final mental model (lock this in)**
****Without Spring****
```
main()
 ├─ new Specification()
 ├─ configure Specification
 ├─ new Car(spec)
 └─ use Car
```

****With Spring****
```
ApplicationContext
 ├─ read metadata
 ├─ create Specification
 ├─ configure Specification
 ├─ new Car(spec)
 └─ manage lifecycle
```

Spring **did not change the idea**.
Spring **took over the responsibility**.

```
Constructor Injection is Spring doing the same wiring you would do in main(), but enforcing that the object can never exist without its required dependencies.
```
