package dev.alejandra.models;

public class Station {

    private String name, city;
    private static int idCounter = 1;
    private int id;
    private double totalRevenue;
 
    public Station (String name, String city) {
        this.name = name;
        this.city = city;
        this.id = idCounter++;
        this.totalRevenue = 0.00;
    }

    public String getName() {
        return name;
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
}
