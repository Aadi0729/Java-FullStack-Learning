package Day05;

// Using throws keyword, exception is not handled by exception generating method, rather it is handled by the
// one who called that exception generating method

class LibraryDemo1 {
    int availableBooks = 3;

    public void borrowBook(int booksRequestedCount) throws Exception {
            if(booksRequestedCount > availableBooks) {
                throw new Exception("Not enough books available");
            }
            if(booksRequestedCount < 0) {
                throw new Exception(("Request atleast 1 book"));
            }
    }
}

public class Throws {
    public static void main(String[] args) {
        LibraryDemo1 library = new LibraryDemo1();
        try {
            library.borrowBook(-4);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Exception occurred: " + e.getMessage());
//            throw new RuntimeException(e);
        }
    }
}
