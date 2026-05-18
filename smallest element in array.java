class Main {
    public static void main(String[] args) {
        int arr[] = {10, 5, 30, 2, 20};

        int min = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println("Smallest = " + min);
    }
}
