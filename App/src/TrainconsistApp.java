public class TrainconsistApp {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("===== UC16: Bubble Sort =====");

        int[] capacities = {72, 56, 24, 70, 60};

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
    }
}