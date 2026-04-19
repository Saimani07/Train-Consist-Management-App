import java.util.Arrays;

public class TrainconsistApp {

    public static void sortBogieNames(String[] names) {
        Arrays.sort(names);
    }

    public static void main(String[] args) {
        System.out.println("===== UC17: Arrays.sort() =====");

        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Original: " + Arrays.toString(bogies));

        sortBogieNames(bogies);

        System.out.println("Sorted:   " + Arrays.toString(bogies));
    }
}