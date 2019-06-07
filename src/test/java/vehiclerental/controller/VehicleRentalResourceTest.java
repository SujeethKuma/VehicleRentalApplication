package vehiclerental.controller;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.*;

public class VehicleRentalResourceTest {

    @Test
    public void shouldReturn200ForValidVehicle() {
        VehicleRentalResource vehicleRentalResource = new VehicleRentalResource();
        ResponseEntity<String> responseEntity = vehicleRentalResource.rentVehicle("Swift", "AC", "Petrol", 3, "Pune Mumbai");
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals("Your Total Expense for the trip is 3400.0", responseEntity.getBody());
    }

    @Test
    public void shouldReturn404ForInValidVehicle() {
        VehicleRentalResource vehicleRentalResource = new VehicleRentalResource();
        ResponseEntity<String> responseEntity = vehicleRentalResource.rentVehicle("benz", "AC", "Petrol", 3, "Pune Mumbai");
        assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
        assertEquals("No such Vehicle available. Only cars like Swift, WagonR and buses like Volvo, MultiAxle are available", responseEntity.getBody());
    }

    @Test
    public void shouldReturn400ForInValidCity() {
        VehicleRentalResource vehicleRentalResource = new VehicleRentalResource();
        ResponseEntity<String> responseEntity = vehicleRentalResource.rentVehicle("Swift", "AC", "Petrol", 3, "Pune Haryana");
        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
        assertEquals("Sorry!! We don't rent car to some of the cities mentioned. We rent only to cities Pune, Bangalore, Chennai, Delhi and Mumbai. Please enter cities separated by spaces.", responseEntity.getBody());
    }
}