package Day04;

import java.util.ArrayList;
import java.util.List;

class CarNew {
    String brand;

    public void display() {
        System.out.println("displayed");
    }

    public CarNew(String brand) {
        this.brand = brand;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {

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
        CarNew car1 = new CarNew("Toyota");
        CarNew car2 = new CarNew("Ford");

        List<CarNew> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        System.out.println("== All Cars ==");
        for(CarNew car : carList) {
            System.out.println(car.brand);
            car.display();
        }
    }
}
