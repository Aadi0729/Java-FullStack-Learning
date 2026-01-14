## 1. Key statement (anchor this)

**Constructor autowiring in Spring is type-based.**

That single sentence explains all the behavior you saw.

## 2. Why constructor autowiring behaves like byType

When Spring sees this:
```
<bean id="myCar" class="Car" autowire="constructor"/>
```

and your class:
```
public class Car {
    public Car(Specification specification) { }
}
```

Spring’s logic is:

1. Find constructor(s)
2. For each constructor parameter:
   - Determine its type
3. Search container for beans assignable to that type
4. Apply resolution rules

This is identical to ```autowire="byType"```.

## 3. Case 1: Two beans with the SAME bean id
XML example (invalid by definition)
```
<bean id="specification" class="Specification"/>
<bean id="specification" class="Specification"/>
```

**What happens**

Spring fails *before autowiring even starts*.

Reason:

- Bean IDs must be unique keys in the container
- Duplicate IDs violate container rules

Error you saw:
```
BeanDefinitionParsingException:
Bean element 'specification' is already defined
```

This has *nothing to do with autowiring*.

It is a *configuration error*.

## 4. Case 2: Two beans with DIFFERENT bean ids
```
<bean id="specification" class="Specification"/>
<bean id="specification1" class="Specification"/>
```

Constructor autowiring:
```
<bean id="myCar" class="Car" autowire="constructor"/>
```

**What Spring does**

- Finds constructor parameter type = Specification
- Searches container
- Finds 2 matching beans
- ❌ Cannot decide
- ❌ Throws exception

Error:
```
NoUniqueBeanDefinitionException:
expected single matching bean but found 2
```

This is **exactly the same as byType**.

## 5. Why Spring refuses to choose one (design reason)

Spring’s rule is:
```
If resolution is ambiguous, fail fast.
```
Spring does *not*:

- Pick the first bean
- Pick the last bean
- Pick by ID order
- Guess based on XML position

Because guessing would introduce **silent bugs**.

## 6. How constructor autowiring differs from byType (small but important)
| Aspect             | byType                 | constructor        |
| ------------------ | ---------------------- | ------------------ |
| Injection point    | Setter                 | Constructor        |
| Resolution basis   | Type                   | Type               |
| Ambiguity handling | Fail                   | Fail               |
| Object validity    | Can be partially wired | Always fully wired |

Constructor injection ensures:

- Object is never created in invalid state
- Dependency is mandatory

This is why constructor injection is *preferred*.

## 7. How to resolve ambiguity properly (production-grade)

### Option 1: Explicit constructor argument (XML)
```
<bean id="myCar" class="Car">
    <constructor-arg ref="specification1"/>
</bean>
```

This bypasses autowiring.

### Option 2: Annotation-based (```@Qualifier```)
```
@Autowired
public Car(@Qualifier("specification1") Specification specification) {
}
```

This is the modern equivalent.

## 8. One-liner mental model (lock this in)
```
constructor autowiring
↓
resolve by parameter type
↓
exactly 1 matching bean → inject
>1 matching beans → exception
```

## 9. Interview-grade one-liner (very strong)

Constructor autowiring in Spring resolves dependencies by type, and if more than one bean of the required type exists, Spring throws a 
NoUniqueBeanDefinitionException to avoid ambiguous injection.
