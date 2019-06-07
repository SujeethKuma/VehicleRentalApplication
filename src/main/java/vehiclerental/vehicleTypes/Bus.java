package vehiclerental.vehicleTypes;

import vehiclerental.enums.FuelType;
import vehiclerental.enums.VehicleFacility;

public class Bus implements VehicleType {
    private final FuelType fuelType;
    private final VehicleFacility vehicleFacility;

    public Bus(FuelType fuelType,
               VehicleFacility vehicleFacility
    ) {

        this.fuelType = fuelType;
        this.vehicleFacility = vehicleFacility;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public VehicleFacility getVehicleFacility() {
        return vehicleFacility;
    }

    public int getDiscount() {
        return 2;
    }

    public int passengerLimit() {
        return 10;
    }
}
