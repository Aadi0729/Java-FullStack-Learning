package Day03.classesDemo;

public class ClassesObjectDemo {
    public static void main(String[] args) {
        Car car1 = new Car(); // Object Creation - Instantiation
        car1.speed = 100;
        car1.brand = "Toyota";
        car1.color = "Red";
//        car1.drive();

        Car car2 = new Car();
        car2.speed = 120;
        car2.brand = "Kia";
        car2.color = "White";
//        car2.drive();

        Bank bank = new Bank();
        bank.userName = "Aditya";
        bank.userAge = 23;
        bank.address = "Bengaluru, India";
//        bank.info();
    }
}
