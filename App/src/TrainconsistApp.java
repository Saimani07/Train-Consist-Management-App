import java.util.regex.*;

public class TrainconsistApp {
    public static void main(String[] args) {

        // Sample inputs (you can change these)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainIdPattern = Pattern.compile(trainPattern);
        Pattern cargoCodePattern = Pattern.compile(cargoPattern);

        // Create matchers
        Matcher trainMatcher = trainIdPattern.matcher(trainId);
        Matcher cargoMatcher = cargoCodePattern.matcher(cargoCode);

        // Validate inputs
        if (trainMatcher.matches()) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }
    }
}