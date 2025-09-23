toString() method
-----------------
- When an object is displayed in SOP(), toString() is invoked implicitly
- toString() belongs to object class
- toString() of object class returns the classname along with the hashcode
- In order to represent the object value in readable/string format we need to override toString() in the class

package week3;

class Book {
	
	int bid;
	String bname;
	double price;
	
	public Book(int bid, String bname, double price) {
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}
	
	public Book() {}
	
	public String toString() {
		return "Book Id: "+bid+"\n"+"Book Name: "+bname+"\n"+"Book Price: "+price;
	}
}

public class ToStringDemo {
	public static void main(String[] args) {
		Book b = new Book (101, "Learn Spring", 800.0); 
		System.out.println(b);//invokes toString() implicitly
	}
}
