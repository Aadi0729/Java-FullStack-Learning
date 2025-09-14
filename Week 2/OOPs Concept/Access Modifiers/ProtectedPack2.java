package myPackage2;
import myPackage1.A;

class C {
	void r() {
		A a = new A();
		a.n = 30; // Error: The field A.n is not visible(protected)
	}
}

class D extends A {
	void x() {
		n = 40; // valid
	}
}

public class ProtectedPack2 {
	public static void main(String[] args) {
		
	}
}
