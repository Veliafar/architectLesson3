package maintenance;

import carTypes.CarType;

public interface AllowToWheelsRepair {

    void setWheelsRepairStation(WheelsRepair wheelsRepairStation);

    void changeWheels(int wheelsCount);

    void changeWheels();

    void fixWheels(int wheelsCount);

    void fixWheels();

    void restorePressure(int wheelsCount);

    void restorePressure();
}
