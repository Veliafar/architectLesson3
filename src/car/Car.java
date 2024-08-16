package car;

import carTypes.CarType;
import carTypes.FuelType;
import carTypes.GearboxType;
import carTypes.SelectedGearType;

import java.awt.*;
import java.lang.reflect.Field;

public abstract class Car {

    //region Constructors

    public Car(String make, String model, Color color, CarType carType) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.carType = carType;
    }

    //endregion

    //region Public methods

    public abstract void movement();

    //обслуживание
    public abstract void maintenance();

    public abstract boolean switchHeadlights();

    // дворники
    public abstract boolean switchWipers();

    protected String getCarInfo() {

        String colorFirstLetter = String.valueOf(getColorName(color).charAt(0)).toUpperCase();
        String colorOtherLetters = getColorName(color).substring(1);
        String capitalizedColor = colorFirstLetter + colorOtherLetters;


        return make + " " + model + " " + capitalizedColor + " " + carType + " " + gearboxType;
    }

    protected static String getColorName(Color color) {
        for (Field f : Color.class.getFields()) {
            try {
                if (f.getType() == Color.class && f.get(null).equals(color)) {
                    return f.getName();
                }
            } catch (java.lang.IllegalAccessException e) {
                // it should never get to here
            }
        }
        return "unknown";
    }

    public void printCarInfo() {
        System.out.println("--------------------------");
        System.out.println(getCarInfo());
    }


    public boolean shiftGear(SelectedGearType switchGear) {
        if (selectedGear == switchGear) {
            System.out.println("Передача не перключилась. Она уже выбрана");
            return false;
        } else {
            if (switchGear == SelectedGearType.P || switchGear == SelectedGearType.R || switchGear == SelectedGearType.N) {
                if (selectedGear == SelectedGearType.First || selectedGear == SelectedGearType.P || selectedGear == SelectedGearType.R || selectedGear == SelectedGearType.N) {

                    System.out.println("Передача перключилась! Теперь это " + switchGear);
                    selectedGear = switchGear;

                    if (selectedGear == SelectedGearType.P) {
                        System.out.println("Вы припарковались");
                    }

                    return true;

                } else {
                    System.out.println("Передача не перключилась! Текущая " + selectedGear + ". Вы хотите включить " + switchGear + ". Сначала понизьте до " + SelectedGearType.First);
                    return false;
                }
            } else {
                System.out.println("Передача перключилась! Теперь это " + switchGear);
                selectedGear = switchGear;

                return true;
            }
        }
    }

    public boolean switchFogLights() {
        isFogLightsUsed = !isFogLightsUsed;
        return isFogLightsUsed;
    }

    public void setWheelsCount(int count) {
        this.wheelsCount = count;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setGearboxType(GearboxType gearboxType) {
        this.gearboxType = gearboxType;
    }

    public GearboxType getGearboxType() {
        return gearboxType;
    }

    public CarType getCarType() {
        return carType;
    }

    //endregion

    //region Protected fields
    protected FuelType fuelType;

    protected CarType carType;

    protected int wheelsSize;

    protected SelectedGearType selectedGear = SelectedGearType.P;

    protected GearboxType gearboxType = GearboxType.AT;
    //endregion

    //region Private fields


    private String make;

    private String model;

    private Color color;

    private int wheelsCount;


    private double engineCapacity;

    private int year;

    private boolean isFogLightsUsed = false;
    //endregion


}
