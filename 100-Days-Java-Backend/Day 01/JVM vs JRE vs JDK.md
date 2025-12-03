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
