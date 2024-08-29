package org.example;
/*
Vehicle class, has following the attributes: numberOfWheels (integer),color (String),
engineSize (float) and fuelType (String)
 */

public class Vehicle {
    int numberOfWheels; //
    String color;
    float engineSize;
    String fuelType;

    /**
    *empty constructor(public)
     */

    public Vehicle() {
        numberOfWheels = 0;
        color = "black";
        engineSize = 0;
        fuelType = "";
    }
    /**
    *copy constructor(public)
    * @param numberOfWheels
     * @param color
     * @param engineSize
     * @param fuelType
     */


    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    /**
     * setter for NumberOfWheels
     * @param numberOfWheels
     */

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    /**
     * setter for color
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * setter for engineSize
     * @param engineSize
     */
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    /**
     * Setter for fuelType
     * @param fuelType
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * getter for numberOfWheels
     * @return
     */
    public int getNumberOfWheels() {
        return numberOfWheels;

    }

    /**
     * getter for color
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * getter for engineSize;
     * @return
     */
    public float getEngineSize() {
        return engineSize;
    }

    /**
     * getter for fuelType
     * @return
     */
    public String getFuelType() {
        return fuelType;
    }
}
