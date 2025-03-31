package dev.alejandra.models;

public class Car extends Vehicle {
    
    public Car(String brand, String licensePlate) {
        super(brand, licensePlate);
    }

    @Override
    public double calculateToll() {
        return 100.00;
    }

}
