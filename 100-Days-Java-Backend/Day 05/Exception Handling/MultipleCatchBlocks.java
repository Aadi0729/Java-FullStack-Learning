package Day05;

public class MultipleCatchBlocks {
    public static void main(String[] args) {

        // With the help of multiple catch blocks, we can handle different types of exceptions

        int[] a = {1, 2, 3};
        try {
            System.out.println(a[2]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("EXCEPTION");
        } catch (ArithmeticException e) {

        } finally {
            // ALWAYS EXECUTES - No matter exception occurred or not
            System.out.println("FINALLY");
        }
        System.out.println("OUTSIDE TRY CATCH");
    }
}
