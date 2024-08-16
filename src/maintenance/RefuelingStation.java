package maintenance;

import carTypes.FuelType;

public class RefuelingStation implements Refueling {
    @Override
    public void refuel(FuelType fuelType) {
        switch (fuelType) {
            case Diesel -> System.out.println("Refueling by Diesel");
            case Gasoline -> System.out.println("Refueling by Gasoline");
            case Electricity -> System.out.println("Refueling by Electricity");
        }
    }
}
