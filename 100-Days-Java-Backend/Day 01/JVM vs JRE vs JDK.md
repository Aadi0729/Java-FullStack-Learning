# JVM vs JRE vs JDK

**JVM (Java Virtual Machine)**

*What it is:*
A virtual machine that runs Java bytecode.

*Why it exists:*
To make Java platform-independent — JVM runs Java code on Windows, macOS, Linux, etc.

*What it does:*

Loads .class files (bytecode)

Verifies them for safety

Uses interpreter + JIT compiler to convert bytecode into machine code

Manages memory (Heap, Stack)

Runs Garbage Collection

*Real-world meaning:*
If you deploy a Java backend app on a server → JVM is what actually executes it.

**JRE (Java Runtime Environment)**

*What it is:*
A package that contains:
  - JVM
  - Core libraries (like java.lang, java.util, etc.)
  - Runtime files

*Why it exists:*
So users can run Java applications.

*Remember:*
JRE = JVM + Libraries
Used in production when you only need to run the app.

**JDK (Java Development Kit)**

*What it is:*
A package that contains:

*JRE (inside it)*

Development tools (javac, jar, javadoc, jshell)

*Why it exists:*
So developers can write, compile, debug, and package Java programs.

*Remember:*
JDK = JRE + JVM + Development tools
Used by developers and build servers.


**IN SHORT**

## JVM (Java Virtual Machine)
- Executes Java bytecode (.class files)
- Provides platform independence
- Handles memory (Heap/Stack) and Garbage Collection
- Uses interpreter + JIT compiler

## JRE (Java Runtime Environment)
- Contains JVM + core libraries
- Used to run Java applications
- Does NOT include the compiler

## JDK (Java Development Kit)
- Contains JRE + JVM + developer tools
- Tools: javac (compiler), jar, javadoc, jshell
- Required for writing and compiling Java programs

# Real-World Example: Running a Spring Boot Backend Application

This document explains how JVM, JRE, and JDK are used in a real-world backend system, using a Spring Boot e-commerce application as a practical example. The explanation is written from a beginner’s perspective and follows the actual lifecycle used in industry.

**Scenario Overview**

Assume you are building a Java Spring Boot backend for an e-commerce platform.

This backend provides:

i) User authentication APIs

ii) Product listing APIs

iii) Order creation and management APIs

This is a standard enterprise backend use case.

## Phase 1: Development (Developer Laptop)

*What the Developer Does ?*

You write Java code such as:

```
@RestController
public class OrderController {

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return orderService.getAllOrders();
    }
}
```
*What Is Required Here ?*

At the development stage, the JDK must be installed on your system.

*Why JDK Is Required ?*

Because during development you are:
i) Writing Java source code (.java)
ii) Compiling source code into bytecode (.class)
iii) Running and debugging the application locally

*What JDK Provides ?*

i) javac → Compiles Java source code into bytecode
ii) java → Starts the JVM and runs the application
iii) Debugging and build tools

**Important hierarchy:**
- JDK includes JRE
- JRE includes JVM

So when JDK is installed, everything needed for development and execution is already present.

## Phase 2: Build Output (What You Actually Deploy)**

After development, the project is built using a command like:
```
mvn clean package
```

This produces a file such as:
```
ecommerce-app.jar
```

*What the JAR File Contains ?*

i) Compiled Java bytecode
ii) Application classes
iii) Dependency libraries

*What the JAR File Does NOT Contain ?*

- No operating-system-specific machine code
- No JVM

*This is why the same .jar file can run on Windows, Linux, or macOS.*

## Phase 3: Deployment (Production Server)

The .jar file is deployed to a production environment such as:

- AWS EC2 (Linux)
- On-premise Linux server
- Docker container

*What Is Installed on the Server ?*
Only the JRE (or sometimes just the JVM).

*Why JDK Is Not Installed on Production ?*
- No compilation is needed on the server
- No debugging tools are required
- Smaller runtime size improves security and efficiency
- Production servers are meant to run applications, not build them.

## Phase 4: Application Startup on the Server

The application is started using:
```
java -jar ecommerce-app.jar
```

This command launches the JVM, which begins executing the application.

*What the JVM Does at Runtime ?*

**Step 1 - JVM Startup**

The operating system starts the JVM process

JVM allocates memory areas:
Heap (for objects)
Stack (for method calls)

Metaspace (for class metadata)

**Step 2 - Class Loading**

The JVM loads:
Core Java classes (String, List, Map)
Spring Boot framework classes
Application classes (OrderController, services, repositories)

This is handled by the **ClassLoader subsystem**.

**Step 3 - Bytecode Verification**

Before execution, JVM verifies that the bytecode:
- Is type-safe
- Does not access illegal memory
- Does not violate stack rules

If verification fails, the application stops immediately.
This is a major reason Java is considered secure.

**Step 4 - Execution (Interpreter + JIT)**

- The Interpreter executes bytecode line by line initially
- The JIT compiler detects frequently executed code
- Hot code is compiled into native machine code
- Performance improves over time

This explains why Java applications may start slower but run very fast afterward.

**Step 5 - Memory Management and Garbage Collection**

During API requests:
- Objects such as request objects, response objects, and entities are created
- These objects are stored in the heap
- Once requests finish, many objects become unreachable
- The Garbage Collector automatically frees the memory

Developers do not manually delete memory, which prevents memory leaks and crashes.

**Real-World Value of JVM**

The JVM provides:
- Platform independence
- Automatic memory management
- High performance through JIT compilation
- Strong runtime security
- Efficient multithreading

This is why Java is widely used in:

- Banking systems
- Payment gateways
- Enterprise backends
- Large-scale distributed systems

**Clear Component Mapping**

| Stage                        | Component Used |
| ---------------------------- | -------------- |
| Writing and compiling code   | JDK            |
| Running application locally  | JRE + JVM      |
| Running on production server | JRE + JVM      |
| Executing bytecode           | JVM            |

**Final Real-World Summary**

In real systems, developers use the JDK to write and build Java applications. Production servers use the JRE to run those applications. The JVM is the core engine that executes bytecode, manages memory, performs garbage collection, and ensures performance and security at runtime. This is how JVM, JRE, and JDK work together in a real-world Spring Boot backend application.
