package Day03.encapsulation;

class Car {
    
    // This is the internal state of the objects, which is in control of us. What to expose and what not.
    // Using "private" keyword and getter and setter
    
    // Public - access anywhere
    // Protected - access within the class and in subclasses
    // Private - can't be accessed outside the class
    
    private String brand;
    private String color;
    private int speed;

    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void drive() {
        System.out.println(brand + " is driving at " + speed);
    }

    // Setter
    public void setSpeed(int speed) {
        if(speed < 0)
            speed = 0;
        this.speed = speed;
    }

    // Getter
    public int getSpeed() {
        if(speed < 0)
            return 0;
        return speed;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red", 150);
        // car1.speed = 100; // 'speed' has private access in 'Day03.encapsulation.Car'
        car1.setSpeed(150);
        System.out.println(car1.getSpeed());

        Car car2 = new Car("Kia", "White", -200);
        System.out.println(car2.getSpeed());
        car2.setSpeed(-150);
        System.out.println(car2.getSpeed());
    }
}
