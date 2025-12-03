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

4. Open CMD and navigate to the file location:
   cd path/to/folder

5. Compile the program:
   javac Main.java

6. Run the program:
   java Main
