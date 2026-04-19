public class TrainconsistAppTest {

    public static void main(String[] args) {
        testException_ValidCapacityCreation();
        testException_NegativeCapacityThrowsException();
        testException_ZeroCapacityThrowsException();
        testException_ExceptionMessageValidation();
        testException_ObjectIntegrityAfterCreation();
        testException_MultipleValidBogiesCreation();

        System.out.println("\nUC14 All test cases passed!");
    }

    static void testException_ValidCapacityCreation() {
        try {
            TrainApp.PassengerBogie b =
                    new TrainApp.PassengerBogie("Sleeper", 50);

            assert b != null;
            System.out.println("testException_ValidCapacityCreation passed");

        } catch (Exception e) {
            assert false : "Should not throw exception";
        }
    }

    static void testException_NegativeCapacityThrowsException() {
        try {
            new TrainApp.PassengerBogie("AC", -10);
            assert false : "Exception expected";

        } catch (TrainApp.InvalidCapacityException e) {
            System.out.println("testException_NegativeCapacityThrowsException passed");
        }
    }

    static void testException_ZeroCapacityThrowsException() {
        try {
            new TrainApp.PassengerBogie("AC", 0);
            assert false : "Exception expected";

        } catch (TrainApp.InvalidCapacityException e) {
            System.out.println("testException_ZeroCapacityThrowsException passed");
        }
    }

    static void testException_ExceptionMessageValidation() {
        try {
            new TrainApp.PassengerBogie("AC", 0);
            assert false;

        } catch (TrainApp.InvalidCapacityException e) {
            assert e.getMessage().equals("Capacity must be greater than zero");
            System.out.println("testException_ExceptionMessageValidation passed");
        }
    }

    static void testException_ObjectIntegrityAfterCreation() {
        try {
            TrainApp.PassengerBogie b =
                    new TrainApp.PassengerBogie("First Class", 80);

            assert b.type.equals("First Class");
            assert b.capacity == 80;

            System.out.println("testException_ObjectIntegrityAfterCreation passed");

        } catch (Exception e) {
            assert false;
        }
    }

    static void testException_MultipleValidBogiesCreation() {
        try {
            new TrainApp.PassengerBogie("Sleeper", 60);
            new TrainApp.PassengerBogie("AC", 70);
            new TrainApp.PassengerBogie("First Class", 90);

            System.out.println("testException_MultipleValidBogiesCreation passed");

        } catch (Exception e) {
            assert false;
        }
    }
}