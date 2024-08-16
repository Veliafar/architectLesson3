package car;

import carTypes.CarType;
import carTypes.SelectedGearType;

import java.awt.*;

public class FlyCar extends Car {
    public FlyCar(String make, String model, Color color) {
        super(make, model, color, CarType.Sedan);
        setWheelsCount(4);
    }

    public void fly() {
        System.out.println("Car is flying");
    }

    @Override
    public void movement() {
        fly();
    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }
}
