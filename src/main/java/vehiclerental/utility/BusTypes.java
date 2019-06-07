package vehiclerental.utility;

import java.util.ArrayList;
import java.util.List;

public class BusTypes {

    public static boolean isBusType(String busType){
        List<String> busTypes = new ArrayList<>();

        busTypes.add("Volvo");
        busTypes.add("MultiAxle");
        busTypes.add("Bus");

        return busTypes.contains(busType);
    }
}
