package Day03.interfaces;

public class ElectricCar implements CarControls {
    @Override
    public void turnRight() {
        System.out.println("Electric Turns right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Electric Turns left");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Electric Brakes applied");
    }
}
