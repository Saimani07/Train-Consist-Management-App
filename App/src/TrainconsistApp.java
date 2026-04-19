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
    }
}