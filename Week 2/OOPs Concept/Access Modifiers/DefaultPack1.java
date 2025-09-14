package myPackage1;

public class A {
	int n; // default modifier
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

public class DefaultPack1 {
	public static void main(String[] args) {
		
	}
}
