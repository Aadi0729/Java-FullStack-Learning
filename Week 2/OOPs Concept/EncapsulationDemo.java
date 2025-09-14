package myProject;

class CustomerDetails {
	private int age;
	void setAge(int age) {
		this.age = age;
	}
	void display() {
		System.out.println("The age is set to: "+age);
	}
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		CustomerDetails c = new CustomerDetails();
		c.setAge(30);
		c.display();
	}
}

