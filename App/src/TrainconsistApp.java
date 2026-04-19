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
    }
}