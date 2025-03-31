package dev.alejandra.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;

public class VehicleTest {

     @Test
     void testShouldReturnBrandOfCar(){
 
         String brand = "Chevrolet";
 
         Car car = new Car("Chevrolet");
 
         assertThat(car.getBrand(), is(brand));
     }
}
