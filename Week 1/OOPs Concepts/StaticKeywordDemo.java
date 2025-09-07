package myProject;

class MyClass {
	
	int m; // instance variable OR non-static variable
	static int n; // class variable OR static variable
	
	void p() {
		m = 10;
		n = 20;
	}
	
	static void q() {
//		m = 30; // Error: Non-static variable 'm' can't be accessed from static context
		n = 40;
	}
	
	void display() {
		System.out.println("m="+m+" "+"n="+n);
	}
}

public class StatickeywordDemo {
	public static void main(String[] args) {
		MyClass mc1 = new MyClass();
		mc1.p();
		mc1.display(); // m=10 n=20
		
		MyClass mc2 = new MyClass();
		// A static variable (n) acts as a global variable within the class means all the objects of the class can access static variable memory
		mc2.display(); // m=0 n=20
		
		mc2.q();
		mc1.display(); // m=10 n=40
		mc2.display(); // m=0 n=40
		
		MyClass.n = 50;
		mc1.display(); // m=10 n=50
		mc2.display(); // m=0 n=50
	}
}
