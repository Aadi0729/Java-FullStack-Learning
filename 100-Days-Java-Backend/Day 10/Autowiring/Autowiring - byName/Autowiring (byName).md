# How does Spring derive the property name ? {autowiring - byName}

Spring follows JavaBeans conventions.

setXyz(...) → property name = "xyz"
```

Examples:

- setSpecification(...) → property = "specification"
- setSpecification1(...) → property = "specification1"

Spring does NOT look at:
- Field names
- Method parameter names
- Variable names

---

## 3. Why fields are ignored

A JavaBeans property is defined by setter methods, not fields.

This is valid:

```java
public void setSpecification1(Specification s) {
    // no field required
}
```
Spring only cares about the setter.

**Example Scenario**
Beans defined in XML
```
<bean id="specification" class="Specification"/>
<bean id="specification1" class="Specification"/>

<bean id="myCar" class="Car" autowire="byName"/>
```

**Case 1: Setter name = setSpecification**
Spring injects:
```
bean id = "specification"
```

**Case 2: Setter name = setSpecification1**
Spring injects:
```
bean id = "specification1"
```
Other beans are ignored.

**Why parameter name does NOT matter**
```
public void setSpecification1(Specification abc) { }
```

Parameter names are ignored because:

- Java erases parameter names at runtime
- Spring relies on method signatures

Java still requires a parameter name to compile.

**Common Pitfalls**

- Renaming field does NOT affect autowiring
- Renaming setter silently changes dependency
- Multiple beans are ignored unless name matches
- No error is thrown if no matching bean exists

**Why byName is discouraged**
- Fragile
- Refactoring breaks wiring
- Hard to debug
- Not type-safe

Preferred alternatives:

- Constructor injection
- @Qualifier
- Explicit wiring

```
Autowire-byName depends ONLY on the setter method name, not fields or parameters.
```
