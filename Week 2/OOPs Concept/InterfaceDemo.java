package myPackage3;

interface Shape {
	void draw();
	
	default void fill() {
		System.out.println("Filling the shape");
	}
}

class Circle implements Shape {
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		// Shape s = new Shape(); // Error
		Shape s = new Circle();
		s.draw();
		s.fill();
	}
}

// When implementing (overriding) interface methods, overridden method should be public
