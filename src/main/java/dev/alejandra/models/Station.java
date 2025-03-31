package dev.alejandra.models;

public class Station {

    String name;
    String city;
 
    public Station (String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
