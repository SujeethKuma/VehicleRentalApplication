package vehiclerental.enums;

public enum FuelType {
    PETROL("Petrol"),
    DIESEL("Diesel");

    private final String fuelType;

    FuelType(String fuelType){

        this.fuelType = fuelType;
    }

    public String getFuelType(){
        return fuelType;
    }
}
