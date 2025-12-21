package Day03.interfaces;

import Day03.classesDemo.Car;

public class InterfaceDemo {
    public static void main(String[] args) {

        /*
        ElectricCar e1 = new ElectricCar();
        e1.turnRight();
        e1.turnLeft();
        e1.applyBrakes();
        */

        CarControls myCar1 = new ElectricCar();
        myCar1.turnLeft();

        CarControls myCar2 = new SportCar();
        myCar2.applyBrakes();
    }
}
