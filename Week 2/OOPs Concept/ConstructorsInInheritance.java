// Constructors in Inheritance

package myPackage2;

class Base {
	int i;
	int j;
	
	Base(int i, int j) { // Parameterized constructor
		this.i = i;
		this.j = j;
	}
	
	Base() {} // Default constructor

	void display() {
		System.out.println("i="+i+" "+"j="+j);
	}
}

class Derived extends Base {
	int k;
	Derived(int k) { 
		// super(); // added implicitly - invokes Base class default constructor
		super(40, 50); // call explicitly - invokes Base class parameterized constructor
		this.k = k;
	}
	
	Derived(int i, int j, int k) {
		super(i, j);
		this.k = k;
	}
	
	void display() { // Overridden method
		
		super.display(); // Invokes Base class display()
		System.out.println("k="+k);
	}
}

public class ConstructorsInInheritance {
	public static void main(String[] args) {
		Base b = new Base(10, 20);
		b.display(); // i=10 j=20
		Derived d1 = new Derived(30);
		d1.display(); // i=40 j=50 k=30
		Derived d2 = new Derived(60, 70, 80);
		d2.display(); // i=60 j=70 k=80
	}
}
