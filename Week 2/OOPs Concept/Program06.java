package myPackage3;

class Book {
	int bookNum;
	String bookName;
	int price;
	
	Book(int bookNum, String bookName, int price) { // Parameterized Constructor
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.price = price;
	}
	
	Book() {} // Default Constructor
	
	void display() {
		System.out.println("Book Number= "+bookNum);
		System.out.println("Book Name= "+bookName);
		System.out.println("Book Price= "+price);
	}
}

class SpecialEditionBook extends Book{
	int discount;
	
	SpecialEditionBook(int bookNum, String bookName, int price, int d) {
		super(bookNum, bookName, price);
		discount = d;
	}
	
	void display() {
		super.display();
		System.out.println("Book discount= "+discount);
		System.out.println("Discounted Price = " + (price - discount));
	}
}

public class BookTest {
	public static void main(String[] args) {
		
		SpecialEditionBook s = new SpecialEditionBook(1, "Java", 1000, 100);
		s.display();
	}
}
