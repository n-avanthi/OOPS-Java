// Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses
//  bike, Car and van. Each subclass should have properties such as make, model, year, and fuel type. Implement 
//  methods for calculating fuel efficiency, mileage. (fuel efficiency=no.of kilometres travelled/no. of litres 
//  consumed, mileage= no.of kilometres travelled/litre).

package CO3.Activity_Set_2;

class Vehicle {
    String make, model, fuelType;
    int year;

    void fuelEfficiency(double kms_travelled, double fuel_liters) {
        System.out.println(kms_travelled/kms_travelled);
    }

    void mileage(double km, int l) {
        System.out.println(km/l);
    }
}

class bike extends Vehicle {
    void properties(String make, String model, String fuelType, int year) {
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.year = year;
        System.out.println(model + " " + make + " " + fuelType + " " + year);
    }
}

class car extends Vehicle {
    void properties(String make, String model, String fuelType, int year) {
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.year = year;
        System.out.println(model + " " + make + " " + fuelType + " " + year);
    }
}

class van extends Vehicle {
    void properties(String make, String model, String fuelType, int year) {
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.year = year;
        System.out.println(model + " " + make + " " + fuelType + " " + year);
    }
}

public class Vehicles {
    public static void main(String[] args) {
        bike objBike = new bike();
        objBike.properties("Himalayan", "Royal Enfield", "Petrol", 2022);
        objBike.fuelEfficiency(345.45, 29.6);
        objBike.mileage(42.1, 1);

        car objCar = new car();
        objCar.properties("SUV", "Creta", "Petrol", 2017);
        objCar.fuelEfficiency(456.98, 34.3);
        objCar.mileage(58.46, 1);

        van objVan = new van();
        objVan.properties("Omni", "Maruthi", "Petrol", 2013);
        objVan.fuelEfficiency(76.13, 15.8);
        objVan.mileage(29.4, 1);
    }
}