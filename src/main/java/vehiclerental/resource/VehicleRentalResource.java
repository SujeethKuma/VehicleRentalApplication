package vehiclerental.resource;

import vehiclerental.TripExpenseCalculation;
import vehiclerental.vehicleTypes.VehicleType;
import vehiclerental.enums.FuelType;
import vehiclerental.enums.VehicleFacility;
import vehiclerental.vehicleTypes.Bus;
import vehiclerental.vehicleTypes.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Resource class where this service can be called via api end points
 *
 */
public class VehicleRentalResource {
    private static final Logger LOGGER = Logger.getLogger(VehicleRentalResource.class.getName());

    /**
     * Method to rent vehicle
     * As of now just hard coded the values but in real the values should be got via POST data
     */
    public void rentVehicle() {

        VehicleType vehicleTypeCar = new Car(FuelType.PETROL, VehicleFacility.AC);
        VehicleType vehicleTypeBus = new Bus(FuelType.PETROL, VehicleFacility.NON_AC);

        List<String> destinations = new ArrayList<String>();
        destinations.add("Pune");
        destinations.add("Mumbai");
        destinations.add("Bangalore");
        destinations.add("Delhi");
        destinations.add("Chennai");

        TripExpenseCalculation carTripExpenseCalculation = new TripExpenseCalculation(vehicleTypeCar, destinations, 4);
        TripExpenseCalculation busTripExpenseCalculation = new TripExpenseCalculation(vehicleTypeBus, destinations, 11);

        float totalCarExpense = carTripExpenseCalculation.getTripExpense();
        float totalBusExpense = busTripExpenseCalculation.getTripExpense();

        LOGGER.info("Total Car Expense is " + totalCarExpense);
        LOGGER.info("Total Bus Expense is " + totalBusExpense);
    }
}
