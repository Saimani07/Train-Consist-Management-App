public class TrainconsistAppTest {

    public static void main(String[] args) {
        testBinarySearch_BogieFound();
        testBinarySearch_BogieNotFound();
        testBinarySearch_FirstElementMatch();
        testBinarySearch_LastElementMatch();
        testBinarySearch_SingleElementArray();
        testBinarySearch_EmptyArray();
        testBinarySearch_UnsortedInputHandled();

        System.out.println("UC19 Tests Passed");
    }

    static void testBinarySearch_BogieFound() {
        String[] arr = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assert TrainApp.binarySearch(arr, "BG309");
    }

    static void testBinarySearch_BogieNotFound() {
        String[] arr = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assert !TrainApp.binarySearch(arr, "BG999");
    }

    static void testBinarySearch_FirstElementMatch() {
        String[] arr = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assert TrainApp.binarySearch(arr, "BG101");
    }

    static void testBinarySearch_LastElementMatch() {
        String[] arr = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assert TrainApp.binarySearch(arr, "BG550");
    }

    static void testBinarySearch_SingleElementArray() {
        String[] arr = {"BG101"};
        assert TrainApp.binarySearch(arr, "BG101");
    }

    static void testBinarySearch_EmptyArray() {
        String[] arr = {};
        assert !TrainApp.binarySearch(arr, "BG101");
    }

    static void testBinarySearch_UnsortedInputHandled() {
        String[] arr = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        assert TrainApp.binarySearch(arr, "BG205");
    }
}