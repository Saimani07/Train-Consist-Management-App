public class TrainconsistAppTest {

    public static void main(String[] args) {
        testSearch_ThrowsExceptionWhenEmpty();
        testSearch_AllowsSearchWhenDataExists();
        testSearch_BogieFoundAfterValidation();
        testSearch_BogieNotFoundAfterValidation();
        testSearch_SingleElementValidCase();

        System.out.println("UC20 Tests Passed");
    }

    static void testSearch_ThrowsExceptionWhenEmpty() {
        try {
            TrainApp.search(new String[]{}, "BG101");
            assert false;
        } catch (IllegalStateException e) {
            assert e.getMessage().equals("No bogies available for search");
        }
    }

    static void testSearch_AllowsSearchWhenDataExists() {
        String[] arr = {"BG101", "BG205"};
        boolean result = TrainApp.search(arr, "BG101");
        assert result;
    }

    static void testSearch_BogieFoundAfterValidation() {
        String[] arr = {"BG101", "BG205", "BG309"};
        assert TrainApp.search(arr, "BG205");
    }

    static void testSearch_BogieNotFoundAfterValidation() {
        String[] arr = {"BG101", "BG205", "BG309"};
        assert !TrainApp.search(arr, "BG999");
    }

    static void testSearch_SingleElementValidCase() {
        String[] arr = {"BG101"};
        assert TrainApp.search(arr, "BG101");
    }
}