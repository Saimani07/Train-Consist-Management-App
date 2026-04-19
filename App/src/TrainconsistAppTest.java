public class TrainconsistAppTest {

    public static void main(String[] args) {
        testSearch_BogieFound();
        testSearch_BogieNotFound();
        testSearch_FirstElementMatch();
        testSearch_LastElementMatch();
        testSearch_SingleElementArray();

        System.out.println("UC18 Tests Passed");
    }

    static void testSearch_BogieFound() {
        String[] arr = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assert TrainApp.linearSearch(arr, "BG309");
    }

    static void testSearch_BogieNotFound() {
        String[] arr = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assert !TrainApp.linearSearch(arr, "BG999");
    }

    static void testSearch_FirstElementMatch() {
        String[] arr = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assert TrainApp.linearSearch(arr, "BG101");
    }

    static void testSearch_LastElementMatch() {
        String[] arr = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assert TrainApp.linearSearch(arr, "BG550");
    }

    static void testSearch_SingleElementArray() {
        String[] arr = {"BG101"};
        assert TrainApp.linearSearch(arr, "BG101");
    }
}