package vehiclerental.vehicleTypes;

import vehiclerental.enums.FuelType;
import vehiclerental.enums.VehicleFacility;

public interface VehicleType {
    /**
     * Method to get the fuel type of the vehicle
     * @return enum FuelType
     */
    FuelType getFuelType();

    /**
     * Method to get the facility of the vehicle
     * @return enum VehicleFacility
     */
    VehicleFacility getVehicleFacility();

    /**
     * Method to get the discount applied
     * @return discount applied
     */
    int getDiscount();

    /**
     * Method to get limited number of passengers can travel
     * @return passenger limit
     */
    int passengerLimit();
}
