package dev.alejandra.models;

public abstract class Vehicle {
    
    protected String brand; 
     
    public Vehicle(String brand){
        this.brand = brand;
    }

    String getBrand() {
        return brand;
    }
}
