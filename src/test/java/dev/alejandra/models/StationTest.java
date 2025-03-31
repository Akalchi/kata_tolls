package dev.alejandra.models;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
 
 public class StationTest {

      @BeforeEach
 
      void setUp() {
         Station.idCounter = 1;
      }
 
     @Test
     @DisplayName("It should return the attributes")
     void testShouldReturnAttributesOfStation(){
 
         String name = "Stormwind";
         String city = "Elwynn Forest";
 
         
         Station station = new Station(name, city);
         Station station2 = new Station(name, city);
 
         assertThat(station.getName(), is(name));
         assertThat(station.getCity(), is(city));
         assertThat(station.getId(), is(1));
         assertThat(station2.getId(), is(2));
         assertThat(station.getTotalRevenue(), is(0.00));
     }

     @Test
     void testShouldClaimHundredIfVehicleIsCar() {
 
         String name = "Stormwind";
         String city = "Elwynn Forest";
         
         Station station = new Station(name, city);
 
         String brand = "Chevrolet";
         String licensePlate = "444XAZ";
 
         Vehicle car = new Car(brand, licensePlate);
 
         station.claimToll(car);
 
         assertThat(station.getTotalRevenue(), is(100.00));
     }

     @Test
     void testShouldClaimFiftyPerAxisIfVehicleIsTruck() {
 
         String name = "Stormwind";
         String city = "Elwynn Forest";
         
         Station station = new Station(name, city);
 
         String brand = "Chevrolet";
         String licensePlate = "444XAZ";    
 
         Truck truck = new Truck(brand, licensePlate, 3);
 
         station.claimToll(truck);
 
         assertThat(station.getTotalRevenue(), is(150.00));
     }

     @Test
     void testShouldClaimFiftyIfVehicleIsMotorbike() {
 
         String name = "Stormwind";
         String city = "Elwynn Forest";
         
         Station station = new Station(name, city);
 
         String brand = "Harley Davidson";
         String licensePlate = "444XAZ";
 
         Vehicle motorbike = new Motorbike(brand, licensePlate);
 
         station.claimToll(motorbike);
 
         assertThat(station.getTotalRevenue(), is(50.00));
     }

     @Test
     void testShouldAddNumberOfTollsAfterPayment() {
 
         String name = "Stormwind";
         String city = "Elwynn Forest";
         
         Station station = new Station(name, city);
 
         String brand = "Chevrolet";
         String licensePlate = "444XAZ";
 
         Truck truck = new Truck(brand, licensePlate, 3);
         Vehicle motorbike = new Motorbike(brand, licensePlate);
 
         station.claimToll(motorbike);
 
        assertThat(station.getCollectedTolls(), is(1));
     }

    @Test
     void testShouldPrintVehiclesAndTotalRevenue() {
 
         String name = "Stormwind";
         String city = "Elwynn Forest";
         
         Station station = new Station(name, city);
 
         String brand = "Chevrolet";    
         String licensePlate = "444XAZ";
 
         Truck truck = new Truck(brand, licensePlate, 3);
         Vehicle motorbike = new Motorbike(brand, "1234ABC");
 
         station.claimToll(truck);
         station.claimToll(motorbike);
 
         ByteArrayOutputStream output = new ByteArrayOutputStream();
         PrintStream originalOut = System.out;
         System.setOut(new PrintStream(output));
 
         station.printDetails();
 
         System.setOut(originalOut);
 
         String outputString = output.toString();
 
         assertThat(outputString, containsString("Revenue details:"));
         assertThat(outputString, containsString(truck.getLicensePlate()));
         assertThat(outputString, containsString(motorbike.getLicensePlate()));
         assertThat(outputString, containsString(String.valueOf(motorbike.calculateToll())));
         assertThat(outputString, containsString(String.valueOf(truck.calculateToll())));
         assertThat(outputString, containsString(String.valueOf(station.getTotalRevenue())));
     }
 }
 