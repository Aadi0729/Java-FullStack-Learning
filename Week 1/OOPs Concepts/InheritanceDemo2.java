// Polymorphism - Method overloading and Method overriding

package myPackage1;

class Base {
	int i;
	int j;
	
	void input(int i, int j) {
		this.i = i;
		this.j = j;
	}

	void display() {
		System.out.println("i="+i+" "+"j="+j);
	}
}

class Derived extends Base {
	int k;
	void input(int k) { // Overloaded method
		this.k = k;
	}
	
	void display() { // Overridden method
		
		// super reference is used to invoke the Base class members from Derived class method
		super.display(); // Invokes Base class display()
		System.out.println("k="+k);
	}
}

public class InheritanceDemo2 {
	public static void main(String[] args) {
		Base b = new Base();
		b.input(10,20);
		b.display();//i=10 j=20
		Derived d = new Derived();
		d.input(30, 40);
		d.display();
		d.input(50);
		d.display();
	}
}
