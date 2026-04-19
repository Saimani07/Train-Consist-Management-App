public class TrainconsistApp {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("===== UC16: Bubble Sort =====");

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.print("Original: ");
        printArray(capacities);

        bubbleSort(capacities);

        System.out.print("Sorted:   ");
        printArray(capacities);
    }
}