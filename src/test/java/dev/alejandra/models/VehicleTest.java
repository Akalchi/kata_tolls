package dev.alejandra.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


import org.junit.jupiter.api.Test;

public class VehicleTest {

     @Test
     void testShouldReturnBrandOfCar(){
 
         String brand = "Chevrolet";
 
         Car car = new Car(brand);
 
         assertThat(car.getBrand(), is(brand));
     }

     @Test
     void testShouldReturnLicensePlateOfCar(){
 
         String brand = "Chevrolet";
         String licensePlate = "444XAZ";
 
         Car car = new Car(brand, licensePlate);
 
         assertThat(car.getLicensePlate(), is(brand));
     }
}
