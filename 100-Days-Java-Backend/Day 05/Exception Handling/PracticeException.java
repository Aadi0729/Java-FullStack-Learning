package Day05;

public class PracticeException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[4]);
        } catch (Exception e) {
            System.out.println("Array index out of bound exception, try accessing valid index.");
        }
    }
}
