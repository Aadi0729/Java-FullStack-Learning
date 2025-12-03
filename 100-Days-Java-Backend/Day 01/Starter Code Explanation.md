# Java “Hello World” Code

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

**public class Main**

- class = a container that holds your code.
- Main = the name of the class.
- Java requires the file name to match the class name → Main.java.

In simple terms:
→ You are telling Java, “This file contains a class named Main.”

**public static void main(String[] args)**

This is the entry point of every Java program.

Let’s decode it line-by-line:

✔ **public** - Means the JVM can access and run this method from anywhere.

✔ **static** - Belongs to the class itself, not to an object.

**Why ?**
Because JVM runs this method without creating an object.

✔ **void** - The function returns nothing.

✔ **main** - This exact name is required — JVM looks for this method first.

✔ **String[] args** - This holds command-line arguments (if any).

In simple terms:
→ This method is the “starting point” of your program.

**System.out.println("Hello, World!");**

Break it down:

- System → A built-in class in Java
- out → A static variable inside System representing the standard output console
- println() → A method that prints text and moves to the next line

Together:
→ Print the text "Hello, World!" to the console.


**IN SHORT**

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

- `class Main`: Java program container. File name must be Main.java.
- `public static void main(String[] args)`: Program entry point.
    - public → accessible everywhere
    - static → JVM can call it without creating an object
    - void → returns nothing
    - main → special name recognized by JVM
    - String[] args → command-line arguments
- `System.out.println()`: prints output to console.
