public class MergeSort {
static void mergeSort(int arr[]) {

    Arrays.sort(arr);
    }

    public static void main(String[] args) {

        int arr[] = {9,4,7,2,1};

        mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}