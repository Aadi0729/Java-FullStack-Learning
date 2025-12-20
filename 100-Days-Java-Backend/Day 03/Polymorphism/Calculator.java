package Day03.polymorphism;

public class Calculator {

    // Method Overloading - Same method name, but different parameters, different signatures (return type)

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
