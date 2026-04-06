import java.util.LinkedHashSet;

public class TrainConsistApp {
    public static void main(String[] args) {

        // Create LinkedHashSet to store bogies
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate bogie
        trainFormation.add("Sleeper"); // Duplicate - will be ignored

        // Display final formation
        System.out.println("Final Train Formation (Insertion Order Preserved):");
        for (String bogie : trainFormation) {
            System.out.print(bogie + " -> ");
        }
        System.out.println("END");
    }
}