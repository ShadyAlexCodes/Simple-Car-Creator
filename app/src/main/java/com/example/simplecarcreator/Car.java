package com.example.simplecarcreator;

public class Car {

    private String modelName;
    private int doors;
    private float milesPerGallon;

    public void createCar(String carName, int carDoors, float milesPerGallon) {
        this.modelName = carName;
        this.doors = carDoors;
        this.milesPerGallon = milesPerGallon;
    }

    // Create the getters
    public String getModelName() {
        return modelName;
    }

    // Define the names
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public float getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(float milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    // Creation of a To String
    public String getString() {
        return "Car Model Name: " + getModelName()
                + "\nCar Doors: " + getDoors()
                + "\nMiles Per Gallon: " + getMilesPerGallon();
    }
}
