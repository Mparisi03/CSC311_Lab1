package org.example;
/*
for Lab 1, will be use a Vehical and Car class(car will extends by Vehical)
go to their classes for more info
 */

public class Main {
    public static void main(String[] args) {
        /*
         * testing  classes
         * make Car object with constructor
         */
        Car Mycar = new Car(4, "Blue", 2.5f, "Diesel", "Toyota");
        /*
        *use Mycar to display the info
         */
        Mycar.displayInfo();
        /*
        *use honk method print the Honk, honk!
         */
        Mycar.honk();

        /*
         * new line
         */

        System.out.println();

        /*
         * testing the setters and getters in Car/brand(use Mycar)
         */
        Mycar.setBrand("Adui");
        Mycar.displayInfo();


        /*
         * new line
         */

        System.out.println();

        /*
         * test Vechicle class
         * make Vechicle  object with constructor
         */
        Vehicle myVehicle = new Vehicle(3, "green", 1.5f, "Diesel");
        /*
         * print the info of myVechicle with toString
         */

        System.out.println(myVehicle.toString());

        /*
         * new line
         */

        System.out.println();

        /*
         * testing the setters and getters in Vehicle(use myVehicle)
         */
        myVehicle.setNumberOfWheels(2);
        myVehicle.setColor("pink");
        myVehicle.setEngineSize(0.0f);
        myVehicle.setFuelType("Gasoline");
        System.out.println("Wheels: "+ myVehicle.getNumberOfWheels()+" Color: "+ myVehicle.getColor() +
                " Engine " +myVehicle.getEngineSize() + " Fuel Type: "+ myVehicle.getFuelType());














    }

}