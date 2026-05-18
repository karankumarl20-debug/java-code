public class PetersonNumbere {
    public static void main(String[] args) {
        int n = 145;
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        if (sum == product) {
            System.out.println("The number is a Peterson Number.");
        } else {
            System.out.println("The number is not a Peterson Number.");
        }
    }
}
