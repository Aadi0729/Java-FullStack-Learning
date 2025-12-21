package Day04;

import java.util.ArrayList;
import java.util.List;

class Car {
    String brand;

    public void display() {
        System.out.println("displayed");
    }

    public Car(String brand) {
        this.brand = brand;
    }
}

public class ListDemo {
    public static void main(String[] args) {

        // LIST: Ordered, Allow Duplicates

        List<Object> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        users.add(1);

        System.out.println("All users");
        for(Object user : users) {
            System.out.println(user);
        }

        // Generics - Type safety
        List<String> users1 = new ArrayList<>();
        users1.add("Aditya");
        users1.add("Piyush");
        // users1.add(1); // Required type : String, Provided : int

        for(String user : users1) {
            System.out.println(user);
        }

        System.out.println("== Accessing with index == ");
        System.out.println(users1.get(0));
        System.out.println(users1.get(1));

        // List of CUSTOM Objects
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Ford");

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        System.out.println("== All Cars ==");
        for(Car car : carList) {
            System.out.println(car.brand);
            car.display();
        }
    }
}
