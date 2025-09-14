package AccessModifiers;

class A {
	private int n;
	void p() {
		n=10; // Valid
	}
}

class B {
	void q() {
		A a = new A();
		a.n = 20; // Error: The field A.n is not visible (Private)
	}
}

public class Private {
	public static void main(String[] args) {
		
	}
}
