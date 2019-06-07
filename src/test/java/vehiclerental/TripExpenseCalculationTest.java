package vehiclerental;

import org.junit.Test;
import vehiclerental.enums.FuelType;
import vehiclerental.enums.VehicleFacility;
import vehiclerental.vehicleTypes.Bus;
import vehiclerental.vehicleTypes.Car;
import vehiclerental.vehicleTypes.VehicleType;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TripExpenseCalculationTest {
    private TripExpenseCalculation tripExpenseCalculation;

    ///////////////////////////////// Tests for Renting Car Type ///////////////////////////////////////////////////
    @Test
    public void testTotalExpenseForRentingPetrolCarWithAC() {
        VehicleType vehicleType = new Car(FuelType.PETROL, VehicleFacility.AC);
        List<String> destinations = new ArrayList<String>();
        destinations.add("Pune");
        destinations.add("Mumbai");
        destinations.add("Bangalore");
        destinations.add("Delhi");
        destinations.add("Chennai");
        tripExpenseCalculation = new TripExpenseCalculation(vehicleType, destinations, 4);
        assertEquals("Incorrect Expense", 74800.0f, tripExpenseCalculation.getTripExpense(), 0.0);
    }

    @Test
    public void testTotalExpenseForRentingPetrolCarWithoutAC() {
        VehicleType vehicleType = new Car(FuelType.PETROL, VehicleFacility.NON_AC);
        List<String> destinations = new ArrayList<String>();
        destinations.add("Pune");
        destinations.add("Mumbai");
        destinations.add("Bangalore");
        destinations.add("Delhi");
        destinations.add("Chennai");
        tripExpenseCalculation = new TripExpenseCalculation(vehicleType, destinations, 4);
        assertEquals("Incorrect Expense", 74800.0f, tripExpenseCalculation.getTripExpense(), 0.0);
    }

    @Test
    public void testTotalExpenseForRentingDieselCarWithAC() {
        VehicleType vehicleType = new Car(FuelType.DIESEL, VehicleFacility.AC);
        List<String> destinations = new ArrayList<String>();
        destinations.add("Pune");
        destinations.add("Mumbai");
        destinations.add("Bangalore");
        destinations.add("Delhi");
        destinations.add("Chennai");
        tripExpenseCalculation = new TripExpenseCalculation(vehicleType, destinations, 4);
        assertEquals("Incorrect Expense", 74800.0f, tripExpenseCalculation.getTripExpense(), 0.0);
    }

    @Test
    public void testTotalExpenseForRentingDieselCarWithoutAC() {
        VehicleType vehicleType = new Car(FuelType.DIESEL, VehicleFacility.NON_AC);
        List<String> destinations = new ArrayList<String>();
        destinations.add("Pune");
        destinations.add("Mumbai");
        destinations.add("Bangalore");
        destinations.add("Delhi");
        destinations.add("Chennai");
        tripExpenseCalculation = new TripExpenseCalculation(vehicleType, destinations, 4);
        assertEquals("Incorrect Expense", 74800.0f, tripExpenseCalculation.getTripExpense(), 0.0);
    }

    @Test
    public void testTotalExpenseForRentingDieselCarWithoutACForExceedingPassengerLimit() {
        VehicleType vehicleType = new Car(FuelType.DIESEL, VehicleFacility.NON_AC);
        List<String> destinations = new ArrayList<String>();
        destinations.add("Pune");
        destinations.add("Mumbai");
        destinations.add("Bangalore");
        destinations.add("Delhi");
        destinations.add("Chennai");
        tripExpenseCalculation = new TripExpenseCalculation(vehicleType, destinations, 6);
        assertEquals("Incorrect Expense", 74800.0f, tripExpenseCalculation.getTripExpense(), 0.0);
    }

    @Test
    public void testTotalExpenseForRentingDieselCarWithACForExceedingPassengerLimit() {
        VehicleType vehicleType = new Car(FuelType.DIESEL, VehicleFacility.AC);
        List<String> destinations = new ArrayList<String>();
        destinations.add("Pune");
        destinations.add("Mumbai");
        destinations.add("Bangalore");
        destinations.add("Delhi");
        destinations.add("Chennai");
        tripExpenseCalculation = new TripExpenseCalculation(vehicleType, destinations, 7);
        assertEquals("Incorrect Expense", 74800.0f, tripExpenseCalculation.getTripExpense(), 0.0);
    }

    @Test
    public void testTotalExpenseForRentingPetrolCarWithACForExceedingPassengerLimit() {
        VehicleType vehicleType = new Car(FuelType.PETROL, VehicleFacility.AC);
        List<String> destinations = new ArrayList<String>();
        destinations.add("Pune");
        destinations.add("Mumbai");
        destinations.add("Bangalore");
        destinations.add("Delhi");
        destinations.add("Chennai");
        tripExpenseCalculation = new TripExpenseCalculation(vehicleType, destinations, 6);
        assertEquals("Incorrect Expense", 74800.0f, tripExpenseCalculation.getTripExpense(), 0.0);
    }

    @Test
    public void testTotalExpenseForRentingPetrolCarWithoutACForExceedingPassengerLimit() {
        VehicleType vehicleType = new Car(FuelType.PETROL, VehicleFacility.NON_AC);
        List<String> destinations = new ArrayList<String>();
        destinations.add("Pune");
        destinations.add("Mumbai");
        destinations.add("Bangalore");
        destinations.add("Delhi");
        destinations.add("Chennai");
        tripExpenseCalculation = new TripExpenseCalculation(vehicleType, destinations, 7);
        assertEquals("Incorrect Expense", 74800.0f, tripExpenseCalculation.getTripExpense(), 0.0);
    }

    ///////////////////////////////// End of Tests for Renting Car Type //////////////////////////////////////////////////


    ///////////////////////////////// Tests for Renting Bus Type ///////////////////////////////////////////////////
    @Test
    public void testTotalExpenseForRentingBusWithAC() {
        VehicleType vehicleType = new Bus(FuelType.DIESEL, VehicleFacility.AC);
        List<String> destinations = new ArrayList<String>();
        destinations.add("Pune");
        destinations.add("Mumbai");
        destinations.add("Bangalore");
        destinations.add("Delhi");
        destinations.add("Chennai");
        tripExpenseCalculation = new TripExpenseCalculation(vehicleType, destinations, 4);
        assertEquals("Incorrect Expense", 74800.0f, tripExpenseCalculation.getTripExpense(), 0.0);
    }

    @Test
    public void testTotalExpenseForRentingBusWithoutAC() {
        VehicleType vehicleType = new Bus(FuelType.DIESEL, VehicleFacility.NON_AC);
        List<String> destinations = new ArrayList<String>();
        destinations.add("Pune");
        destinations.add("Mumbai");
        destinations.add("Bangalore");
        destinations.add("Delhi");
        destinations.add("Chennai");
        tripExpenseCalculation = new TripExpenseCalculation(vehicleType, destinations, 4);
        assertEquals("Incorrect Expense", 74800.0f, tripExpenseCalculation.getTripExpense(), 0.0);
    }

    @Test
    public void testTotalExpenseForRentingBusWithoutACForExceedingPassengerLimit() {
        VehicleType vehicleType = new Bus(FuelType.DIESEL, VehicleFacility.NON_AC);
        List<String> destinations = new ArrayList<String>();
        destinations.add("Pune");
        destinations.add("Mumbai");
        destinations.add("Bangalore");
        destinations.add("Delhi");
        destinations.add("Chennai");
        tripExpenseCalculation = new TripExpenseCalculation(vehicleType, destinations, 12);
        assertEquals("Incorrect Expense", 74800.0f, tripExpenseCalculation.getTripExpense(), 0.0);
    }

    @Test
    public void testTotalExpenseForRentingBusWithACForExceedingPassengerLimit() {
        VehicleType vehicleType = new Bus(FuelType.DIESEL, VehicleFacility.AC);
        List<String> destinations = new ArrayList<String>();
        destinations.add("Pune");
        destinations.add("Mumbai");
        destinations.add("Bangalore");
        destinations.add("Delhi");
        destinations.add("Chennai");
        tripExpenseCalculation = new TripExpenseCalculation(vehicleType, destinations, 14);
        assertEquals("Incorrect Expense", 74800.0f, tripExpenseCalculation.getTripExpense(), 0.0);
    }

    ///////////////////////////////// End of Tests for Renting Bus Type //////////////////////////////////////////////////

}