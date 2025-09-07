package myProject;

class Rectangle {
	
	int length;
	int breadth;
	
	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	void area() {
		int area = length * breadth;
		System.out.println("The area of the rectangle is: "+area);
	}
}

public class Program03 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 20);
		
		r.area();
	}
}
