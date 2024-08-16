package maintenance;

import carTypes.CarType;

public class WashingStation implements Washing {

    @Override
    public int getWipingWindshieldCost() {
        return 300;
    }

    @Override
    public int getWipingHeadlightsCost() {
        return 100;
    }

    @Override
    public int getWipingMirrorsCost() {
        return 100;
    }

    @Override
    public int getWashCarCost() {
        return 1000;
    }

    public double getWashingIndex(CarType carType) {
        switch (carType) {
            case Hatchback -> {
                return 1;
            }
            case Sedan -> {
                return 1.2;
            }
            case Pickup -> {
                return 1.4;
            }
            case Sport -> {
                return 1.6;
            }
            case SUV -> {
                return 1.8;
            }
            case Truck -> {
                return 2;
            }
        }
        return 0;
    }

    @Override
    public void wipingWindshield(CarType carType) {
        System.out.println("wiping windshield cost is " + getWashingIndex(carType) * getWipingWindshieldCost());
    }

    @Override
    public void wipingHeadlights(CarType carType) {
        System.out.println("wiping headlights cost is " + getWashingIndex(carType) * getWipingHeadlightsCost());
    }

    @Override
    public void wipingMirrors(CarType carType) {
        System.out.println("wiping mirrors cost is " + getWashingIndex(carType) * getWipingMirrorsCost());
    }

    @Override
    public void washCar(CarType carType) {
        System.out.println("washCar cost is " + getWashingIndex(carType) * getWashCarCost());
    }
}
