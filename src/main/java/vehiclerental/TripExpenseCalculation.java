package vehiclerental;

import vehiclerental.enums.FuelType;
import vehiclerental.enums.VehicleFacility;
import vehiclerental.utility.DestinationDistance;
import vehiclerental.vehicleTypes.VehicleType;

import java.util.List;

public class TripExpenseCalculation {
    private final VehicleType vehicleType;
    private final List<String> destinations;
    private final int numberOfPassengers;
    private float standardRate = 15f;
    private float additionalFacilityCharge = 0f;
    private float extraPassengerCharge = 0;

    public TripExpenseCalculation(VehicleType vehicleType,
                                  List<String> destinations,
                                  int numberOfPassengers) {

        this.vehicleType = vehicleType;
        this.destinations = destinations;
        this.numberOfPassengers = numberOfPassengers;
    }

    public float getTripExpense() {
        float totalDistance = DestinationDistance.getTotalDistance(destinations);

        if (FuelType.DIESEL.equals(vehicleType.getFuelType())) {
            //For Diesel fuel types reduce 1 rupee from the standard type
            standardRate -= 1;
        }
        if (VehicleFacility.AC.equals(vehicleType.getVehicleFacility())) {
            // Additional 2 Rs/Km charge is applicable for AC vehicles
            additionalFacilityCharge = 2;
        }
        if (numberOfPassengers > vehicleType.passengerLimit()) {
            //Additional charges of 1 Rs/Km/Person are charged if number of passengers exceeds the max limit of a vehicle
            extraPassengerCharge = totalDistance * (numberOfPassengers - vehicleType.passengerLimit());
        }
        return (standardRate * totalDistance - (standardRate * totalDistance * ( vehicleType.getDiscount()/100)) + (additionalFacilityCharge*totalDistance) + extraPassengerCharge );
    }
}
