package myPackage3;

abstract class Fruit {
	String name;
	String color;
	abstract void cost();
}

class Apple extends Fruit {
	int cost;
	Apple(String name, String color, int cost) {
		this.name = name;
		this.color = color;
		this.cost = cost;
	}
	void cost() {
		System.out.println("The color of "+ name +" is "+color);
		System.out.println("The cost of "+ name +" is "+cost);
	}
}

class Mango extends Fruit {
	int cost;
	Mango(String name, String color, int cost) {
		this.name = name;
		this.color = color;
		this.cost = cost;
	}
	void cost() {
		System.out.println("The color of "+ name +" is "+color);
		System.out.println("The cost of "+ name +" is "+cost);
	}
}

public class Program07 {
	public static void main(String[] args) {
		// Fruit f = new Fruit(); // Error
		Fruit f = new Apple("Apple", "red", 60);
		Fruit f1 = new Mango("Mango", "yellow", 50);
		
		f.cost();
		f1.cost();
		
	}
}
