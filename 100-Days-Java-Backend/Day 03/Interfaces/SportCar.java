package Day03.interfaces;

import java.io.Serializable;

public class SportCar implements CarControls, Serializable {
    @Override
    public void turnRight() {
        System.out.println("Sports Turn right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Sports Turn left");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Sports applied brakes");
    }
}
