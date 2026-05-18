public  class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2; // Number of positions to rotate

        // Right rotate the array
        k = k % n; // Handle cases where k is greater than n
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        // Print the rotated array
        System.out.println("Array after right rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Helper method to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}