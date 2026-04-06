import java.util.HashMap;
import java.util.Map;

public class TrainconsistApp {
    public static void main(String[] args) {

        // Create HashMap to store bogie and capacity
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Adding bogies with their capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 78);
        bogieCapacityMap.put("First Class", 24);

        // Display bogie and capacity
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " seats");
        }
    }
}