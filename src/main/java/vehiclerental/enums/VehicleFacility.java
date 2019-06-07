package vehiclerental.enums;

public enum VehicleFacility {
    AC("AC"),
    NON_AC("NON-AC");

    private final String vehicleFacility;

    VehicleFacility(String vehicleFacility){

        this.vehicleFacility = vehicleFacility;
    }

    public String getVehicleFacility(){
        return vehicleFacility;
    }
}
