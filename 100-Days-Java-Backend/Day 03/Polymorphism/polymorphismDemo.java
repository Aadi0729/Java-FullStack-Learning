package Day03.polymorphism;

public class polymorphismDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 200, 5);
        c1.displayInfo();

        Bike b1 = new Bike("Hayabusa", 160, true);
        b1.displayInfo();

        c1.start();
        b1.start();

        Vehicle v1 = new Vehicle("VehicleBrand", 202);
        v1.start();
      
        /**
         *Vehicle v = new Car(); → Upcasting
         * Parent reference can point to child object (IS-A relationship)
         * One object, not two (parent + child parts together)
         * Compile-time: checks methods using reference type
         * Runtime: method execution decided by actual object
         * Overridden methods → runtime polymorphism
         * JVM uses dynamic method dispatch
         * Same reference, same method call → different outputs possible
         * Instance variables & static methods → not polymorphic
         * Enables loose coupling and flexible design
         * Core rule: method call resolved at runtime, based on object
         */
        // Method Overriding (Runtime Polymorphism)
        Vehicle v2 = new Car("Ford", 202, 5);
        v2.start();

        // Method Overriding (Runtime Polymorphism)
        Vehicle v3 = new Bike("Yamaha", 202, true);
        v3.start();

        // Method Overloading - same method name, but different parameters
        b1.start("Hello");
        b1.start();

        Calculator calculator = new Calculator();
        System.out.println("Add (int,int): " + calculator.add(2,3));
        System.out.println("Add (double, double): " + calculator.add(2.3, 4.1));
    }
}
