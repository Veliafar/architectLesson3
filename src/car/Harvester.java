package car;

import carTypes.CarType;
import carTypes.SelectedGearType;
import maintenance.*;

import java.awt.*;

public class Harvester extends Car implements AllowToFueling, AllowToWashing, AllowToWheelsRepair {

    public Harvester(String make, String model, Color color) {
        super(make, model, color, CarType.Truck);
        setWheelsCount(6);
    }

    private Refueling refueling;

    private Washing washing;

    private WheelsRepair wheelsRepair;

    @Override
    public void movement() {
        System.out.println("Автомобиль движется.");
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

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }

    public void setRefuelingStation(Refueling refueling) {
        this.refueling = refueling;
    }

    public void setWashingStation(Washing washing) {
        this.washing = washing;
    }

    public void setWheelsRepairStation(WheelsRepair wheelsRepair) {
        this.wheelsRepair = wheelsRepair;
    }

    @Override
    public void changeWheels(int wheelsCount) {
        if (wheelsRepair != null) {
            wheelsRepair.changeWheels(carType, wheelsCount);
        }
    }

    @Override
    public void changeWheels() {
        if (wheelsRepair != null) {
            wheelsRepair.changeWheels(carType, this.getWheelsCount());
        }
    }

    @Override
    public void fixWheels(int wheelsCount) {
        if (wheelsRepair != null) {
            wheelsRepair.fixWheels(carType, wheelsCount);
        }
    }

    @Override
    public void fixWheels() {
        if (wheelsRepair != null) {
            wheelsRepair.fixWheels(carType, this.getWheelsCount());
        }
    }

    @Override
    public void restorePressure(int wheelsCount) {
        if (wheelsRepair != null) {
            wheelsRepair.restorePressure(carType, wheelsCount);
        }
    }

    @Override
    public void restorePressure() {
        if (wheelsRepair != null) {
            wheelsRepair.restorePressure(carType, this.getWheelsCount());
        }
    }

    // заправить
    @Override
    public void refuel() {
        if (refueling != null) {
            refueling.refuel(fuelType);
        }
    }

    @Override
    public void wipingWindshield() {
        if (washing != null) {
            washing.wipingWindshield(carType);
        }
    }

    @Override
    public void wipingHeadlights() {
        if (washing != null) {
            washing.wipingHeadlights(carType);
        }
    }

    @Override
    public void wipingMirrors() {
        if (washing != null) {
            washing.wipingMirrors(carType);
        }
    }

    @Override
    public void washCar() {
        if (washing != null) {
            washing.washCar(carType);
        }
    }



}
