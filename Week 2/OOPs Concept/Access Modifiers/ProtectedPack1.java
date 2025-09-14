package myPackage1;

public class A {
	protected int n;
	void p() {
		n = 10; // valid
	}
}

class B {
	void q() {
		A a = new A();
		a.n = 20; // valid
	}
}

public class ProtectedPack1 {
	public static void main(String[] args) {
		
	}
}
