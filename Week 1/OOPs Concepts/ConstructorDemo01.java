package myProject;

class Sample {
	
	int m;
	int n;
	
	Sample(int m, int n) {
		this.m = m;
		this.n = n;
	}
	
	void display() {
		System.out.println("m= "+m+" n= "+n);
	}
}

public class ConstructorDemo01 {
	public static void main(String[] args) {
		
		Sample s = new Sample(10, 20);
		s.display();
	}
}
