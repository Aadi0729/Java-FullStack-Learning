package Day03.polymorphism;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    public void start() {
        System.out.println("Starting car...");
    }
}
