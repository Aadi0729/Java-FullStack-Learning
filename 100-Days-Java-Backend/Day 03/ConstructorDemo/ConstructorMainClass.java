package Day03.ConstructorDemo;

import Day03.classesDemo.CarConstructorDemo;

public class ConstructorMainClass {
    public static void main(String[] args) {
        // If any constructor is written by the programmer (parameterized or no-arg), the compiler does NOT provide the default constructor.
        CarConstructorDemo car1 = new CarConstructorDemo();
        car1.drive();

        CarConstructorDemo car2 = new CarConstructorDemo("Kia", "White", 120);
        car2.drive();

        CarConstructorDemo car3 = new CarConstructorDemo("Honda");
        car3.drive();

        // Setter
        car2.setSpeed(180);

        // Getter
        System.out.println("Car 2 speed: " + car2.getSpeed());

        // 'speed' has private access in 'CarConstructorDemo'
//         System.out.println("Car 2 speed: " + car2.speed); // It can only be accessed using getter

        car2.setSpeed(-120);
        System.out.println("Car 2 speed: " + car2.getSpeed());
    }
}
