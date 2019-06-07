package vehiclerental.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vehiclerental.TripExpenseCalculation;
import vehiclerental.utility.BusTypes;
import vehiclerental.utility.CarTypes;
import vehiclerental.vehicleTypes.VehicleType;
import vehiclerental.enums.FuelType;
import vehiclerental.enums.VehicleFacility;
import vehiclerental.vehicleTypes.Bus;
import vehiclerental.vehicleTypes.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Resource/Controller class where this service is called via api end points
 *
 */
@RestController
public class VehicleRentalResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(VehicleRentalResource.class.getName());

    /**
     * Method to rent vehicle
     */
    @RequestMapping("/vehiclerental/vehicle/{vehicle}/vehicleFacility/{vehicleFacility}/fuelType/{fuelType}/numberOfPassengers/{numberOfPassengers}/cities/{cities}")
    public ResponseEntity<String> rentVehicle(@PathVariable String vehicle,
                                      @PathVariable String vehicleFacility,
                                      @PathVariable String fuelType,
                                      @PathVariable int numberOfPassengers,
                                              @PathVariable String cities) {
        VehicleType vehicleType;

        // check if petrol or diesel is requested
        final FuelType fuel = FuelType.PETROL.getFuelType().equalsIgnoreCase(fuelType) ?
                FuelType.PETROL : FuelType.DIESEL;

        // check if AC or NON-AC is requested
        final VehicleFacility facility = VehicleFacility.AC.getVehicleFacility().equalsIgnoreCase(vehicleFacility) ?
                VehicleFacility.AC :
                VehicleFacility.NON_AC;

        if (CarTypes.isCarType(vehicle)){
            vehicleType = new Car(fuel, facility);
        } else if (BusTypes.isBusType(vehicle)){
            vehicleType = new Bus(fuel, facility);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No such Vehicle available");
        }

        List<String> destinations = new ArrayList<>();
        String [] cityLists = cities.split(" ");
        destinations.addAll(Arrays.asList(cityLists));


        TripExpenseCalculation carTripExpenseCalculation = new TripExpenseCalculation(vehicleType, destinations, numberOfPassengers);

        float totalVehicleExpense = carTripExpenseCalculation.getTripExpense();

        LOGGER.info("Total {} Expense is {}" , vehicle , totalVehicleExpense);

        return ResponseEntity.status(HttpStatus.OK)
                .body("Your Total Expense for the trip is " + totalVehicleExpense);
    }
}
