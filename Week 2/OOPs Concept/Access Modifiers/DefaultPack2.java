package myPackage2;
import myPackage1.A;

class C {
	void r() {
		A a = new A();
		a.n = 30; // Error: The field A.n is not visible (default)
	}
}

public class DefaultPack2 {

}
