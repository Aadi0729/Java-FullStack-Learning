# Run Java Program Using Notepad + CMD

1. Install Java JDK and verify:
   - java --version
   - javac --version

2. Create a file in Notepad:
   File: Main.java
   Code:
   public class Main {
       public static void main(String[] args) {
           System.out.println("Hello from Notepad!");
       }
   }

3. Open CMD and navigate to the file location:
   cd path/to/folder

4. Compile the program:
   javac Main.java

5. Run the program:
   java Main
