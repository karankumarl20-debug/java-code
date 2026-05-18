public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        // Using LinkedHashSet to remove duplicates
        java.util.Set<Integer> set = new java.util.LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("1 2 3 4  5:");
        
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}