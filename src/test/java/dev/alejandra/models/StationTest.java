package dev.alejandra.models;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
 
 public class StationTest {
 
     @Test
     @DisplayName("It should return the attributes")
     void testShouldReturnAttributesOfStation(){
 
         String name = "Stormwind";
         String city = "Elwynn Forest";
 
         
         Station station = new Station(name, city);
 
         assertThat(station.getName(), is(name));
         assertThat(station.getCity(), is(city));
     }
 }
 