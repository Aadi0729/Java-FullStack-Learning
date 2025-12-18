package Day03.ConstructorDemo;

// Record provides the getters, constructors and toString() method, It doesn't provide setters
record Bike (String brand, int speed) {}

// If record was not there, we will need to create a Bike class, give the properties in that class, constructor, getters.

public class RecordDemo {
    public static void main(String[] args) {
        Bike bike = new Bike("BMW", 220);
        System.out.println("Brand: " + bike.brand());
        System.out.println("Speed: " + bike.speed());
        System.out.println(bike); // toString() is called and used internally - To print entire object
    }
}
