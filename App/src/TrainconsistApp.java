import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainconsistApp {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static List<Bogie> filterByLoop(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();
        for (Bogie bogie : bogies) {
            if (bogie.capacity > 60) {
                result.add(bogie);
            }
        }
        return result;
    }

    public static List<Bogie> filterByStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    public static List<Bogie> createTestDataset(int size) {
        List<Bogie> bogies = new ArrayList<>();
        String[] types = {"Sleeper", "AC Chair", "First Class", "Goods Rectangular", "Goods Cylindrical"};

        for (int i = 0; i < size; i++) {
            bogies.add(new Bogie(types[i % types.length], 40 + (i % 70)));
        }
        return bogies;
    }

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams) ");
        System.out.println("==============================================\n");

        List<Bogie> bogies = createTestDataset(100000);

        long loopStart = System.nanoTime();
        List<Bogie> loopResult = filterByLoop(bogies);
        long loopEnd = System.nanoTime();

        long streamStart = System.nanoTime();
        List<Bogie> streamResult = filterByStream(bogies);
        long streamEnd = System.nanoTime();

        System.out.println("Loop-based filtered bogies count   : " + loopResult.size());
        System.out.println("Loop execution time (ns)           : " + (loopEnd - loopStart));

        System.out.println("Stream-based filtered bogies count : " + streamResult.size());
        System.out.println("Stream execution time (ns)         : " + (streamEnd - streamStart));

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
    }
}