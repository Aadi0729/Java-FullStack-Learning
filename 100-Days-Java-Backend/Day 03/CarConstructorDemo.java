package Day03.classesDemo;

public class CarConstructorDemo {
    String brand;
    String color;
    private int speed;

    // If no constructor is written in a class, the Java compiler automatically provides a default no-argument constructor.

    // From IDE - Right click -> Generate -> Constructor

    // Constructor with 3 Parameters
        public CarConstructorDemo(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    // Constructor with 1 Parameter
    public CarConstructorDemo(String brand) {
            this.brand = brand;
    }

    // If any constructor is written by the programmer (parameterized or no-arg), the compiler does NOT provide the default constructor.
    // Default Constructor
    public CarConstructorDemo() {
        System.out.println("Constructor called");
    }

    public void drive() {
        System.out.println(brand + " is driving at " + speed);
    }

    // Setter
    public void setSpeed(int speed) {
            this.speed = speed;
    }

    // Getter
    public int getSpeed() {
            if(speed < 0)
                return 0;
            return speed; // It will return the speed of the instance/object who called getSpeed
    }
}
