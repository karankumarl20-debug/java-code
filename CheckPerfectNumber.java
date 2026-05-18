public class CheckPerfectNumber {
    public static void main(String[] args) {
        int num = 28; // Example number to check
        int sum = 0;

        // Calculate the sum of proper divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of proper divisors equals the original number
        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
