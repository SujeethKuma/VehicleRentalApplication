package vehiclerental.enums;

public enum Vehicle {
    CAR("car"),
    BUS("bus");

    private final String vehicle;

    Vehicle(String vehicle){

        this.vehicle = vehicle;
    }

    public String getVehicle(){
        return vehicle;
    }
}
