# VehicleRentalApplication
Application to get the total expense for renting a vehicleFacility

Vehicle can be rented using this application

**To Run**

http://localhost:8080/vehiclerental/vehicle/{vehicle}/vehicleFacility/{vehicleFacility}/fuelType/{fuelType}/numberOfPassengers/{numberOfPassengers}/cities/{cities}

where

{vehicle}           - List of below cars
                        - Swift
                        - WagonR
                     - List of below buses
                        - Volvo
                        - MultiAxle          
{vehicleFacility}   - AC or NON-AC
                
{fuelType}           - Petrol or Diesel
{numberOfPassengers} - total number of passengers travelling
{cities}             - cities to be travelled (should be separated by spaces)

**Sample Request**      

http://localhost:8080/vehiclerental/vehicle/Volvo/vehicleFacility/Non-AC/fuelType/Diesel/numberOfPassengers/4/cities/Pune Bangalore Chennai         