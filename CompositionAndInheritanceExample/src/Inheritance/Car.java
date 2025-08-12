package Inheritance;

import Composition.Engine;

public class Car extends  Vehicle {
    int numberOfDoors;
    String sunRoofType;

    public Car (int model, int year, int numberOfDoors, String sunRoofType, Engine engine) {
        super(model, year, engine);
        this.numberOfDoors = numberOfDoors;
        this.sunRoofType = sunRoofType;
    }
    @Override
    public String toString () {
        return super.toString() + "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", sunRoofType='" + sunRoofType + '\'' +
                '}';
    }
}
