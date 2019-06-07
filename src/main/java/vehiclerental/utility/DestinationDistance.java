package vehiclerental.utility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Utility class to get the total distance to be travelled
 */
public class DestinationDistance {
    // To hide the default public constructor
    private DestinationDistance(){

    }

    private static List<String> cityList = Arrays.asList("Pune", "Bangalore", "Chennai", "Delhi", "Mumbai");

    public static float getTotalDistance(List<String> strings){
        checkValidCityNames(strings);
        float totalDestination = 0f;
        final Map<List<String>, Float> distance = getDistance();
        //loop to get the total distance to be travelled
        for ( int i = 0; i < strings.size() - 1 ; i ++){
            totalDestination += distance.get(Arrays.asList(strings.get(i), strings.get(i+1)));
        }
        return totalDestination;
    }

    public static void checkValidCityNames(List<String> strings) {
        boolean validCityName;
        for ( String string : strings){
            validCityName = cityList.contains(string);
            if(!validCityName){
                throw new IllegalArgumentException("Sorry!! We don't rent car to some of the cities mentioned. We rent only to cities Pune, Bangalore, Chennai, Delhi and Mumbai. Please enter cities separated by spaces.");
            }
        }
    }

    private static Map<List<String>, Float> getDistance() {
        // Map containing the distance between the cities
        final Map<List<String>, Float> distance = new HashMap<>();
        distance.put(Arrays.asList("Pune", "Mumbai"), 200f);
        distance.put(Arrays.asList("Pune", "Bangalore"), 1000f);
        distance.put(Arrays.asList("Pune", "Delhi"), 1000f);
        distance.put(Arrays.asList("Pune", "Chennai"), 1000f);
        distance.put(Arrays.asList("Mumbai", "Delhi"), 2050f);
        distance.put(Arrays.asList("Mumbai", "Chennai"), 1234.5f);
        distance.put(Arrays.asList("Mumbai", "Bangalore"), 500f);
        distance.put(Arrays.asList("Bangalore", "Delhi"), 2500f);
        distance.put(Arrays.asList("Bangalore", "Chennai"), 2500f);
        distance.put(Arrays.asList("Delhi", "Chennai"), 1200f);
        distance.put(Arrays.asList("Chennai", "Delhi"), 1200f);

        return distance;
    }

}
