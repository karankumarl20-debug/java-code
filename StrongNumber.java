public class StrongNumber {
    public static void main(String[] args) {
        int num = 145; // Example number to check
        int sum = 0;
        int temp = num;

        // Calculate the sum of the factorial of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        // Check if the sum of the factorial of digits equals the original number
        if (sum == num) {
            System.out.println(num + " is a strong number.");
        } else {
            System.out.println(num + " is not a strong number.");
        }
    }

    // Helper method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
