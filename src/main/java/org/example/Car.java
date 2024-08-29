package org.example;
/*
Car class, this class inheritance/extends from the Vehicle class.
this class add the attribute: brand (String)
 */
public class Car extends Vehicle {
    String brand;

    /**
     * empty constructor(public)
     */

    public Car() {
        super();
    }

    /**
     * copy constructor(public)
     * @param brand
     */
    public Car(String brand) {
        super();
        this.brand = brand;
    }

    /**
     * setter for brand
     * @param brand
     */

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Getter for brand
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     * method that prints out Honk, honk!
     */
    public void honk(){
        System.out.println("Honk, honk!");
    }

    /**
     * method that prints out all the attributes inculding the one in Vehicle class
     */
    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Number of wheels" + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine size" + getEngineSize());
        System.out.println("Fuel type " + getFuelType());

    }

}
