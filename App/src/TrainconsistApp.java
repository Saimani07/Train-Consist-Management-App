public class TrainconsistApp {

    public static boolean search(String[] bogieIds, String searchId) {
        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("===== UC20: Exception Handling During Search =====");

        String[] bogieIds = {};
        String searchId = "BG101";

        try {
            boolean found = search(bogieIds, searchId);
            System.out.println("Found: " + found);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("UC20 execution completed.");

        System.out.println("Search ID: " + key);
        System.out.println("Found: " + found);

        System.out.println("Sorted:   " + Arrays.toString(bogies));

        System.out.print("Original: ");
        printArray(capacities);
        bubbleSort(capacities);

        System.out.print("Sorted:   ");
        printArray(capacities);

        GoodsBogie g2 = new GoodsBogie("Rectangular");
        g2.assignCargo("Petroleum");
        System.out.println("\nProgram continues safely...");


        System.out.println("Program continues safely...");

        System.out.println("\nResult match: " + (loopResult.size() == streamResult.size() ? "YES" : "NO"));
import java.util.*;

class GoodsBogie {
    String type;
    String cargo;

    // Constructor
    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class TrainconsistApp {
    public static void main(String[] args) {

        // Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // Safety validation using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b -> {
                    if (b.type.equals("Cylindrical")) {
                        return b.cargo.equals("Petroleum");
                    }
                    return true; // other bogies allowed
                });

        // Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT");
        } else {
            System.out.println("Train is NOT SAFE");
        }
dev
 dev
dev
 dev
 dev
 dev
 dev
    }
}