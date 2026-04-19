public class TrainconsistApp {

    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return type + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {
        System.out.println("===== UC14: Custom Exception Handling =====");

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + b1);

            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
            System.out.println("Created: " + b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception: " + e.getMessage());
        }


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
    }
}