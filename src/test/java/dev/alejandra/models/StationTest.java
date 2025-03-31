package dev.alejandra.models;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
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
     void testShouldClaimFiftyIfVehicleIsCar() {
 
         String name = "Stormwind";
         String city = "Elwynn Forest";
         
         Station station = new Station(name, city);
 
         String brand = "Chevrolet";
         String licensePlate = "444XAZ";
 
         Vehicle car = new Car(brand, licensePlate);
 
         station.claimToll(car);
 
         assertThat(station.getTotalRevenue(), is(50.00));
     }
 }
 