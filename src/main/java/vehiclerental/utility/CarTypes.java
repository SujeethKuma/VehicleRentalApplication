package vehiclerental.utility;

import java.util.ArrayList;
import java.util.List;

public class CarTypes {

    public static boolean isCarType(String carType){
        List<String> carTypes = new ArrayList<>();

        carTypes.add("Swift");
        carTypes.add("WagonR");
        carTypes.add("Car");

        return carTypes.contains(carType);
    }
}
