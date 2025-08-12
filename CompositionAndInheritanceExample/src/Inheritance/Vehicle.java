package Inheritance;

import Composition.Engine;

public class Vehicle {
    int model;
    int year;
    Engine engine;

    public Vehicle (int model, int year, Engine engine) {
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    @Override
    public String toString () {
        return "Vehicle{" +
                "model=" + model +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }
}
