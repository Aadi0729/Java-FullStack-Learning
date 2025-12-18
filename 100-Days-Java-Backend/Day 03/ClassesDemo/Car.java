package Day03.classesDemo;

public class Car {
    String brand;
    String color;
    int speed;

    public void drive() {
        System.out.println(brand + " is driving at " + speed);
    }
}

/*
 * // Class 'ClassesObjectDemo1' is public, should be declared in a file named 'ClassesObjectDemo1.java'
 * BEST PRACTICE: Create classes in different files
 *
 * public class ClassesObjectDemo1 {
 *     public static void main(String[] args) {
 *         Car car1 = new Car(); // Object Creation - Instantiation
 *         car1.speed = 100;
 *         car1.brand = "Toyota";
 *         car1.color = "Red";
 * //        car1.drive();
 *     }
 */
