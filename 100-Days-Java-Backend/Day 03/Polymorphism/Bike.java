package Day03.polymorphism;

public class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    public void start() {
        System.out.println("Starting bike...");
    }

    public void start(String greet) {
        System.out.println("Starting bike..." + greet);
    }
}
