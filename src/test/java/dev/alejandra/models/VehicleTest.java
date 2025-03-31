package dev.alejandra.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    void testShouldReturnAttributesOfVehicles() {

        String brand = "Chevrolet";
        String licensePlate = "444XAZ";

        Vehicle car = new Car(brand, licensePlate);

        assertThat(car.getBrand(), is(brand));
        assertThat(car.getLicensePlate(), is(licensePlate));
    }
}
