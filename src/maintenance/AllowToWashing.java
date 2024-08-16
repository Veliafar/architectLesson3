package maintenance;

import carTypes.CarType;

public interface AllowToWashing {

    void setWashingStation(Washing washing);

    void wipingWindshield();

    void wipingHeadlights();

    void wipingMirrors();

    void washCar();
}
