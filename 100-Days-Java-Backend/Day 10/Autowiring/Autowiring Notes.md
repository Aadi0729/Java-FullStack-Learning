## 1. What is Autowiring?

Autowiring is Spring’s capability to automatically resolve and inject dependencies between beans without explicitly specifying ```<constructor-arg>``` or ```<property>``` wiring.
**Rule:**
```
Property Name == Bean ID
```

In short:

Autowiring tells Spring how to choose the right bean for a dependency.

It does not replace:

- Interfaces
- Dependency Injection
- IoC

It only replaces manual wiring configuration.

## 2. Why Autowiring Exists (the real problem)

Without autowiring, you wrote:
```
<bean id="userManagerWithUserDataProvider"
      class="ioc.loose.coupling.UserManager">
    <constructor-arg ref="userDataProvider"/>
</bean>
```

This is:

- Explicit
- Clear
- But verbose at scale

Autowiring lets Spring infer this relationship automatically.

## 3. Where Autowiring Fits in the Big Picture
```
Abstraction (Interface)
        ↓
Dependency Injection
        ↓
Inversion of Control
        ↓
Autowiring (Convenience Mechanism)
```

Autowiring is not a design principle.
It is a container feature.

## 4. Autowiring Types (XML-based)

Spring supports 5 autowiring modes in XML.

We’ll go from obsolete → modern → recommended.

### 4.1 autowire="no" (Default)
```
<bean id="userManager"
      class="ioc.loose.coupling.UserManager"
      autowire="no"/>
```

Meaning:

- Spring will not inject anything
- You must wire dependencies manually

This is what you already used.

### 4.2 autowire="byName"

Spring matches:
```
property name == bean id
```

Example
```
public class UserManager {
    private UserDataProvider userDataProvider;

    public void setUserDataProvider(UserDataProvider provider) {
        this.userDataProvider = provider;
    }
}
```
```
<bean id="userDataProvider"
      class="ioc.loose.coupling.UserDatabaseProvider"/>

<bean id="userManager"
      class="ioc.loose.coupling.UserManager"
      autowire="byName"/>
```

Spring logic:

- Finds setter setUserDataProvider
- Looks for bean named userDataProvider
- Injects it

⚠️ Problems:

- Fragile (renaming breaks wiring)
- Setter-only
- Rarely used today

### 4.3 autowire="byType"

Spring matches:
```
property type == bean type
```
```
<bean id="userManager"
      class="ioc.loose.coupling.UserManager"
      autowire="byType"/>
```

Spring logic:

- Finds dependency of type UserDataProvider
- Looks for exactly one bean of that type
- Injects it

⚠️ Problem:

- Fails if multiple implementations exist
- Your example has 3 implementations, so Spring throws:
```NoUniqueBeanDefinitionException```

### 4.4 autowire="constructor" (IMPORTANT)

Spring matches constructor arguments by type.
```
<bean id="userManager"
      class="ioc.loose.coupling.UserManager"
      autowire="constructor"/>
```

Spring logic:

1. Finds constructor with UserDataProvider
2. Looks for a matching bean
3. Injects it

This is:

- Cleaner
- Type-safe
- Constructor-based DI

⚠️ Still fails with multiple implementations unless clarified.

### 4.5 autowire="autodetect" (Deprecated)

Spring decides:

- Constructor if possible
- Else setter

This is removed in modern Spring and should be ignored.

## 5. Autowiring with Annotations (Modern & Preferred)

This is what Spring applications use today.

**5.1 ```@Autowired```**
```
@Service
public class UserManager {

    private final UserDataProvider userDataProvider;

    @Autowired
    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }
}
```

Spring:

- Finds the constructor
- Resolves dependency by type
- Injects automatically

Constructor injection is implicitly autowired in modern Spring.

**5.2 Resolving multiple implementations**

You must tell Spring which one to use.

*Option 1: ```@Primary```*
```
@Primary
@Component
public class UserDatabaseProvider implements UserDataProvider {}
```

Spring will prefer this bean.

*Option 2: ```@Qualifier``` (Most explicit)*
```
@Autowired
public UserManager(@Qualifier("webServiceProvider") 
                   UserDataProvider userDataProvider) {
    this.userDataProvider = userDataProvider;
}
```

This maps exactly to:
```
<constructor-arg ref="webServiceProvider"/>
```

## 6. Why Autowiring Is Safe Only With Good Design

Autowiring works well because:

- You used interfaces
- You used constructor injection
- You avoided field injection

Without abstraction:

- Autowiring creates hidden coupling
- Debugging becomes painful

## 7. Common Autowiring Pitfalls (Interview Gold)

- Multiple beans of same type without qualifier
- Field injection hiding dependencies
- Overusing byName
- Confusing autowiring with IoC
- Assuming Spring “guesses correctly” always

Spring never guesses.
It follows strict resolution rules.

## 8. Autowiring vs Explicit Wiring (When to use what)
| Scenario                 | Recommendation                     |
| ------------------------ | ---------------------------------- |
| Learning / clarity       | Explicit wiring (XML / @Qualifier) |
| Production apps          | Autowiring + constructor           |
| Multiple implementations | @Qualifier                         |
| Optional dependency      | @Autowired(required = false)       |

## 9. One-line Interview Answer (Memorize)
```
Autowiring is a Spring feature that automatically injects dependencies by resolving beans based on name, type, or constructor, 
reducing explicit configuration while still following IoC and DI principles.
```

## 10. Final Mental Model (Lock This In)

- IoC → Who controls object creation
- DI → How dependencies are supplied
- Autowiring → How Spring chooses the dependency
- Beans → Objects managed by Spring
