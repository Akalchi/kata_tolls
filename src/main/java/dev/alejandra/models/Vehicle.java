package dev.alejandra.models;

public abstract class Vehicle {
    
    protected String brand, licensePlate;
    protected static int idCounter = 1;  
    protected int id;
     
    public Vehicle(String brand, String licensePlate){
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.id = idCounter++;
    }

    public String getBrand() {
        return brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getId(){
        return id;
    }

    public abstract double calculateToll();
}
