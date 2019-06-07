package vehiclerental;


import vehiclerental.resource.VehicleRentalResource;


public class VehicleRentalApplication {

    public static void main(String args[]){
        VehicleRentalResource  vehicleRentalResource = new VehicleRentalResource();
        vehicleRentalResource.rentVehicle();

    }
}
