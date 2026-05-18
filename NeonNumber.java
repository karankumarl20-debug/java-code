public class NeonNumber {
    public static void main(String[] args) {
        int num = 9; // Example number to check
        int square = num * num;
        int sum = 0;
        int temp = square;

        // Calculate the sum of the digits of the square
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Check if the sum of the digits of the square equals the original number
        if (sum == num) {
            System.out.println(num + " is a neon number.");
        } else {
            System.out.println(num + " is not a neon number.");
        }
    }
}
