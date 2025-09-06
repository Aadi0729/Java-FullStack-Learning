package myProject;

class Book {
	
	int bookId;
	String bookName;
	
	Book(int bookId, String bookName) { // Parameterized Constructor
		this.bookId = bookId;
		this.bookName = bookName;
	}
	
	Whenever there is a Parameterized Constructor in a 
	Book() {}; // Default Constructor
	
	void display() {
		System.out.println("Book Id: "+bookId);
		System.out.println("Book Name: "+bookName);
	}
}

public class ConstructorDemo02 {
	public static void main(String[] args) {
		Book b1 = new Book(101, "Java Full Stack");
		b1.display();
		
		Book b2 = new Book();
		b2.display();
	}
}
