package myPackage1;

class Outer {
	
	int n = 100;
	class Inner {
		void p() {
			System.out.println("n="+n);
		}
	}
}

public class InnerClass {
	
	public static void main(String[] args) {
		Outer.Inner obj = new Outer().new Inner();
		obj.p();
	}
}
