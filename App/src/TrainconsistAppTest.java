import java.util.List;

public class TrainconsistAppTest {

    public static void main(String[] args) {
        testLoopFilteringLogic();
        testStreamFilteringLogic();
        testLoopAndStreamResultsMatch();
        testExecutionTimeMeasurement();
        testLargeDatasetProcessing();

        System.out.println("\nUC13 All test cases passed successfully.");
    }

    static void testLoopFilteringLogic() {
        List<TrainApp.Bogie> bogies = List.of(
                new TrainApp.Bogie("Sleeper", 50),
                new TrainApp.Bogie("AC Chair", 75),
                new TrainApp.Bogie("First Class", 90)
        );

        List<TrainApp.Bogie> result = TrainApp.filterByLoop(bogies);

        assert result.size() == 2 : "Loop filtering failed";
        System.out.println("testLoopFilteringLogic passed");
    }

    static void testStreamFilteringLogic() {
        List<TrainApp.Bogie> bogies = List.of(
                new TrainApp.Bogie("Sleeper", 60),
                new TrainApp.Bogie("AC Chair", 61),
                new TrainApp.Bogie("First Class", 100)
        );

        List<TrainApp.Bogie> result = TrainApp.filterByStream(bogies);

        assert result.size() == 2 : "Stream filtering failed";
        System.out.println("testStreamFilteringLogic passed");
    }

    static void testLoopAndStreamResultsMatch() {
        List<TrainApp.Bogie> bogies = TrainApp.createTestDataset(1000);

        List<TrainApp.Bogie> loopResult = TrainApp.filterByLoop(bogies);
        List<TrainApp.Bogie> streamResult = TrainApp.filterByStream(bogies);

        assert loopResult.size() == streamResult.size() : "Loop and Stream results do not match";
        System.out.println("testLoopAndStreamResultsMatch passed");
    }

    static void testExecutionTimeMeasurement() {
        List<TrainApp.Bogie> bogies = TrainApp.createTestDataset(1000);

        long start = System.nanoTime();
        TrainApp.filterByLoop(bogies);
        long end = System.nanoTime();

        long elapsed = end - start;

        assert elapsed > 0 : "Execution time measurement failed";
        System.out.println("testExecutionTimeMeasurement passed");
    }

    static void testLargeDatasetProcessing() {
        List<TrainApp.Bogie> bogies = TrainApp.createTestDataset(100000);

        List<TrainApp.Bogie> result = TrainApp.filterByStream(bogies);

        assert result.size() > 0 : "Large dataset processing failed";
        System.out.println("testLargeDatasetProcessing passed");
    }
}