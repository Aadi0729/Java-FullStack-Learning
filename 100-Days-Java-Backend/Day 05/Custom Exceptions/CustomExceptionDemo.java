package Day05;

class BookUnavailableException extends Exception {
    public BookUnavailableException(String message) {
        super(message);
    }
}

class LibraryDemo2 {
    int availableBooks = 3;

    public void borrowBook(int booksRequestedCount) throws Exception {
        if(booksRequestedCount > availableBooks) {
            throw new BookUnavailableException("Not enough books available");
        }
        if(booksRequestedCount < 0) {
            throw new Exception(("Request atleast 1 book"));
        }
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        LibraryDemo2 library = new LibraryDemo2();
        try {
            library.borrowBook(5);
        } catch (BookUnavailableException e) {
            e.printStackTrace();
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Exception occurred: " + e.getMessage());
//            throw new RuntimeException(e);
        }
    }
}
