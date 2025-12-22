package Day05;

import java.io.FileReader;

public class CheckedUnchecked {
    public static void main(String[] args) {
        try {
            // Checked exception - compiler checks that the exception might occur
            FileReader fileReader = new FileReader("abc.txt");
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }
}
