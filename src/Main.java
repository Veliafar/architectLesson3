import car.Harvester;
import car.SportCar;
import carTypes.FuelType;
import carTypes.GearboxType;
import carTypes.SelectedGearType;
import maintenance.RefuelingStation;
import maintenance.WashingStation;
import maintenance.WheelsRepairStation;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Harvester harvester = new Harvester("MAN","Hurricane", Color.GRAY);
        harvester.setFuelType(FuelType.Diesel);

        RefuelingStation refuelingStation = new RefuelingStation();
        WashingStation washingStation = new WashingStation();
        WheelsRepairStation wheelsRepairStation = new WheelsRepairStation(20);

        harvester.setRefuelingStation(refuelingStation);
        harvester.setWashingStation(washingStation);
        harvester.setWheelsRepairStation(wheelsRepairStation);


        harvester.printCarInfo();
        harvester.refuel();
        harvester.wipingHeadlights();
        harvester.wipingMirrors();
        harvester.wipingWindshield();
        harvester.washCar();
        harvester.changeWheels();
        harvester.fixWheels(2);
        harvester.restorePressure();
        harvester.movement();



        SportCar sportCar = new SportCar("McLaren","F1", Color.RED, GearboxType.MT);
        sportCar.setFuelType(FuelType.Gasoline);

        WheelsRepairStation wheelsRepairStation2 = new WheelsRepairStation(23);

        sportCar.setRefuelingStation(refuelingStation);
        sportCar.setWashingStation(washingStation);
        sportCar.setWheelsRepairStation(wheelsRepairStation2);

        sportCar.printCarInfo();
        sportCar.refuel();
        sportCar.wipingHeadlights();
        sportCar.wipingMirrors();
        sportCar.wipingWindshield();
        sportCar.washCar();
        sportCar.changeWheels();
        sportCar.fixWheels(2);
        sportCar.restorePressure();
        sportCar.movement();
        sportCar.shiftGear(SelectedGearType.First);
        sportCar.movement();
        sportCar.shiftGear(SelectedGearType.Second);
        sportCar.movement();
        sportCar.shiftGear(SelectedGearType.P);
        sportCar.shiftGear(SelectedGearType.First);
        sportCar.shiftGear(SelectedGearType.P);

    }
}