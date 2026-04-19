public class TrainconsistAppTest {

    public static void main(String[] args) {
        testSort_BasicAlphabeticalSorting();
        testSort_UnsortedInput();
        testSort_AlreadySortedArray();
        testSort_DuplicateBogieNames();
        testSort_SingleElementArray();

        System.out.println("UC17 Tests Passed");
    }

    static void testSort_BasicAlphabeticalSorting() {
        String[] arr = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};
        TrainApp.sortBogieNames(arr);

        assert isEqual(arr, new String[]{"AC Chair", "First Class", "General", "Luxury", "Sleeper"});
    }

    static void testSort_UnsortedInput() {
        String[] arr = {"Luxury", "General", "Sleeper", "AC Chair"};
        TrainApp.sortBogieNames(arr);

        assert isEqual(arr, new String[]{"AC Chair", "General", "Luxury", "Sleeper"});
    }

    static void testSort_AlreadySortedArray() {
        String[] arr = {"AC Chair", "First Class", "General"};
        TrainApp.sortBogieNames(arr);

        assert isEqual(arr, new String[]{"AC Chair", "First Class", "General"});
    }

    static void testSort_DuplicateBogieNames() {
        String[] arr = {"Sleeper", "AC Chair", "Sleeper", "General"};
        TrainApp.sortBogieNames(arr);

        assert isEqual(arr, new String[]{"AC Chair", "General", "Sleeper", "Sleeper"});
    }

    static void testSort_SingleElementArray() {
        String[] arr = {"Sleeper"};
        TrainApp.sortBogieNames(arr);

        assert isEqual(arr, new String[]{"Sleeper"});
    }

    static boolean isEqual(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
}