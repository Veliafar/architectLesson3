package maintenance;

import carTypes.CarType;

public interface Washing {

    int getWipingWindshieldCost();

    int getWipingHeadlightsCost();

    int getWipingMirrorsCost();

    int getWashCarCost();

    double getWashingIndex(CarType carType);

    void wipingWindshield(CarType carType);

    void wipingHeadlights(CarType carType);

    void wipingMirrors(CarType carType);

    void washCar(CarType carType);
}
