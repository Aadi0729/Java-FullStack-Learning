## 1. What you understood (and this part is correct)

**You said:**

When Spring uses autowiring byType, it looks inside the class, sees that it needs a bean of type ```Specification```. If there are two bean definitions of that type in the XML, Spring gets confused and needs only one.

✅ **This is correct in principle.**

Spring autowire-by-type *requires exactly one matching bean.*

## 2. The exact rule of ```autowire="byType"``` (important correction)

The precise rule is:

For each dependency, Spring looks for exactly one bean whose type is assignable to the required type.
If zero are found → nothing is injected.
If more than one is found → Spring fails with an exception.

So it’s not just “Spring gets confused” — Spring explicitly refuses to guess.

## 3. What Spring actually does internally (step-by-step)

Let’s assume this XML:
```
<bean id="specification" class="Specification"/>
<bean id="specification1" class="Specification"/>

<bean id="myCar" class="Car" autowire="byType"/>
```

And this class:
```
public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }
}
```

Spring’s byType algorithm:

1. Inspect Car
2. Find setter setSpecification(Specification)
3. Required type = Specification
4. Scan container for beans of type Specification
5. Finds 2 beans
6. ❌ Throws exception

Spring does not pick one.
Spring does not use XML order.
Spring does not use bean names.

It fails fast.

## 4. The actual exception (good to remember)

Spring throws:
```
NoUniqueBeanDefinitionException:
expected single matching bean but found 2
```

This is intentional and good design.

## 5. Why Spring enforces “only one bean” by default

Spring’s philosophy:
```
If the container cannot decide deterministically (without any guess), it must fail.
```

Why?

- Silent wrong injection is dangerous
- Bugs become invisible
- Production issues become harder to trace

So Spring forces explicitness when ambiguity exists.

## 6. Important refinement to your statement

You said:
```
Therefore only one bean definition must be present inside the XML file so that it works fine.
```
This is conditionally true, but not the full picture.

**More accurate version:**

For autowiring byType to work without additional configuration, there must be exactly one bean of the required type in the container.

You can still have multiple beans **if you explicitly guide Spring.**

## 7. How ambiguity is resolved (this is the next level)

Spring provides three ways to resolve this.

### 7.1 Explicit wiring (XML – safest)
```
<bean id="myCar" class="Car">
    <property name="specification" ref="specification1"/>
</bean>
```

This bypasses autowiring completely.

### 7.2 ```@Primary``` (annotation-based)
```
@Primary
@Component
public class Specification { }
```
Spring will prefer this bean even if others exist.

### 7.3 ```@Qualifier``` (most explicit and recommended)
```
@Autowired
@Qualifier("specification1")
private Specification specification;
```

This is the *annotation equivalent* of explicit XML wiring.

## 8. Why byType is safer than byName (important insight)
| Aspect             | byName      | byType               |
| ------------------ | ----------- | -------------------- |
| Based on           | Setter name | Class/interface type |
| Refactor-safe      | ❌ No        | ✅ Yes                |
| Fails on ambiguity | ❌ No        | ✅ Yes                |
| Type safety        | ❌ Weak      | ✅ Strong             |
```
The fact that byType fails loudly is actually a feature, not a drawback.
```

## 9. Final mental model (lock this in)
```
autowire="byType"
↓
Spring resolves dependency by class/interface type
↓
Exactly 1 matching bean → inject
0 matching beans → nothing injected
>1 matching beans → exception
```

## 10. Interview-ready one-liner (very strong)

In autowire-by-type, Spring resolves dependencies based on the required type and expects exactly one matching bean; if multiple beans of the same type exist, Spring throws a NoUniqueBeanDefinitionException to avoid ambiguity.

If you say this clearly, it signals solid Spring fundamentals.
