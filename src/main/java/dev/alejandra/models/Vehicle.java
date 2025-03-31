package dev.alejandra.models;

public abstract class Vehicle {
    
    protected String brand, licensePlate;
     
    public Vehicle(String brand, String licensePlate){
        this.brand = brand;
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
