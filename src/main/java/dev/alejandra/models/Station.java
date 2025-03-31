package dev.alejandra.models;

public class Station {

    private String name, city;
    private static int idCounter = 1;
    private int id;
 
    public Station (String name, String city) {
        this.name = name;
        this.city = city;
        this.id = idCounter++;
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
}
