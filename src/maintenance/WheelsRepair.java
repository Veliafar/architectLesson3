package maintenance;

import carTypes.CarType;

public interface WheelsRepair {

    int getChangeWheelCost();

    int getFixWheelCost();

    int getRestorePressureCost();

    float getWheelsRepairIndex(CarType carType, int wheelSize);

    void changeWheels(CarType carType, int wheelsCount);

    void fixWheels(CarType carType, int wheelsCount);

    void restorePressure(CarType carType, int wheelsCount);
}
