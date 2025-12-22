package Day05;

public class ExceptionDemo {
    public static void main(String[] args) {
//        int result = 10 / 0;
//        System.out.println("Done");

        // catch block will not run everytime, runs only when try block contains statement which occurs exception.
        try {
            // Exception generating statements
            int result = 10 / 0; // The line where exception is occurred, all the lines after that will be skipped.
        } catch (Exception e) {
            // Exception handling statements
            System.out.println("Exception Found");
        }
        System.out.println("Done");

        // Exception object can handle any kind of exceptions
    }
}
