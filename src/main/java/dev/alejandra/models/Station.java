package dev.alejandra.models;

import java.util.ArrayList;
import java.util.List;

public class Station {

    private String name, city;
    static int idCounter = 1;
    private int id;
    private int collectedTolls; 
    private double totalRevenue;
    private List<Vehicle> registeredVehicles;
 
    public Station (String name, String city) {
        this.name = name;
        this.city = city;
        this.id = idCounter++;
        this.totalRevenue = 0.00;
        this.collectedTolls = 0;
        this.registeredVehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCollectedTolls() {
        return collectedTolls;
    }

    public String getCity() {
        return city;
    }

    public int getId() {
        return id;
    }
    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void claimToll(Vehicle vehicle) {
        double tollPrice = vehicle.calculateToll();
        totalRevenue += tollPrice;
        collectedTolls++;
        registeredVehicles.add(vehicle);
    }
    public void printDetails() {
        System.out.println("Revenue details:");
        for (Vehicle vehicle : registeredVehicles) {
            System.out.println("- " + vehicle.getLicensePlate() + " paid: $" + vehicle.calculateToll());
        }
        System.out.println("Total revenue: $" + totalRevenue);
    }
}


