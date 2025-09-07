package myProject;

class Counter {
	
	static int instanceCounter = 0;
	
	Counter() {
		instanceCounter++;
		System.out.println("Counter now is: "+instanceCounter);
	}
	
	static void getInstanceCount() {
		System.out.println("The number of instances created till now: "+instanceCounter);
	}
}

public class Program05 {
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		Counter c4 = new Counter();
		
		Counter.getInstanceCount();
	}
}
