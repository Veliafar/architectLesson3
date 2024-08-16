package maintenance;

import carTypes.CarType;

public class WheelsRepairStation implements WheelsRepair {


    protected int wheelSize;

    public WheelsRepairStation(int wheelSize) {
        this.wheelSize = wheelSize;
    }


    @Override
    public int getChangeWheelCost() {
        return 200;
    }

    @Override
    public int getFixWheelCost() {
        return 1000;
    }

    @Override
    public int getRestorePressureCost() {
        return 100;
    }

    @Override
    public float getWheelsRepairIndex(CarType carType, int wheelSize) {

        float wheelSizeIndex = (float) wheelSize / 10;

        switch (carType) {
            case Hatchback -> {
                return wheelSizeIndex;
            }
            case Sedan -> {
                return (float) (wheelSizeIndex * 1.1);
            }
            case Pickup -> {
                return (float) (wheelSizeIndex * 1.2);
            }
            case Sport -> {
                return (float) (wheelSizeIndex * 1.3);
            }
            case SUV -> {
                return (float) (wheelSizeIndex * 1.4);
            }
            case Truck -> {
                return wheelSizeIndex * 2;
            }
        }
        return 0;
    }

    @Override
    public void changeWheels(CarType carType, int wheelsCount) {
        System.out.println("changeWheels cost is " + getWheelsRepairIndex(carType, this.wheelSize) * getChangeWheelCost() * wheelsCount);
    }

    @Override
    public void fixWheels(CarType carType, int wheelsCount) {
        System.out.println("fixWheels cost is " + getWheelsRepairIndex(carType, this.wheelSize) * getFixWheelCost() * wheelsCount);
    }

    @Override
    public void restorePressure(CarType carType, int wheelsCount) {
        System.out.println("restorePressure cost is " + getWheelsRepairIndex(carType, this.wheelSize) * getRestorePressureCost() * wheelsCount);
    }
}
