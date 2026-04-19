public class TrainconsistApp {

    public static boolean linearSearch(String[] bogieIds, String searchId) {
        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("===== UC18: Linear Search =====");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchId = "BG309";

        boolean found = linearSearch(bogieIds, searchId);

        System.out.println("Search ID: " + searchId);
        System.out.println("Found: " + found);
    }
}