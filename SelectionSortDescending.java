public class SelectionSortDescending {
    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;

        // Selection Sort in Descending Order
        for (int i = 0; i < n - 1; i++) {

            int maxIndex = i;

            // Find the largest element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap elements
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        // Print sorted array
        System.out.println("Sorted array in descending order:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}