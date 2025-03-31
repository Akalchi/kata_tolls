package dev.alejandra.models;

public class Truck extends Vehicle {

    private int axis;

    public Truck(String brand, String licensePlate, int axis) {
        super(brand, licensePlate);
        this.axis = axis;
    }

    public int getAxis() {
        return axis;
    }

}
