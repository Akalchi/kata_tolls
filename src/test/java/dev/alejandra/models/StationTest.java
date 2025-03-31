package dev.alejandra.models;


import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
 
 public class StationTest {
 
     @Test
     void testShouldReturnNameOfStation(){
 
         String name = "Stormwind";
         
         Station station = new Station(name);
 
         assertThat(station.getName(), is(name));
     }

    @Test
     void testShouldReturnCityOfStation(){
 
         String name = "Stormwind";
         String city = "Elwynn Forest";
 
         Station station = new Station(name, city);
 
         assertThat(station.getCity(), is(city));
     }
 }