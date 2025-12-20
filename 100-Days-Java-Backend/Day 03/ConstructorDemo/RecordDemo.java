package Day03.ConstructorDemo;

// It provides a abstraction with enforced rules
// Record is a transparent, Immutable DATA CARRIER [The fields are declared as private final fields]
// Record provides the getters, constructors and toString() method, It doesn't provide setters

/**
 * When we define a record, the compiler automatically generates:
 * - private final fields
 * - Constructor
 * - getter methods
 * - toString() method
 * - equals() method
 * - hashCode() method
  */

record Bike (String brand, int speed) {}

// If record was not there, we will need to create a Bike class, give the properties in that class, constructor, getters.

public class RecordDemo {
    public static void main(String[] args) {
        Bike bike = new Bike("BMW", 220);
        // bike.speed = 100; // 'speed' has private access in 'Day03.ConstructorDemo.Bike'
        System.out.println("Brand: " + bike.brand());
        System.out.println("Speed: " + bike.speed());
        System.out.println(bike); // toString() is called and used internally - To print entire object
    }
}
