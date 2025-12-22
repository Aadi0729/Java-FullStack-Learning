package Day05;

// Using throw keyword helps in handling the exception by exception generating method

class LibraryDemo {
    int availableBooks = 3;

    public void borrowBook(int booksRequestedCount) {
        try {
            if (booksRequestedCount > availableBooks) {
                Exception e = new Exception("Not enough books available");
                throw e;

                // throw new Exception("Not enough books available"); // This is the combined version of above lines
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred, You requested a book that does not exist.");
        } catch (Exception e) {
            System.out.println("Not enough books available");
        } finally {
            System.out.println("Finally Block");
        }
    }
}

public class Throw {
    public static void main(String[] args) {
        LibraryDemo library = new LibraryDemo();
        library.borrowBook(4);
    }
}
