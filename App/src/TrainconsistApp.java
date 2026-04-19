import java.util.Arrays;

public class TrainconsistApp {

    public static boolean binarySearch(String[] bogieIds, String key) {
        Arrays.sort(bogieIds); // precondition: sorted data

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = key.compareTo(bogieIds[mid]);

            if (cmp == 0) {
                return true;
            } else if (cmp < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("===== UC19: Binary Search =====");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String key = "BG309";

        boolean found = binarySearch(bogieIds, key);

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
    }
}