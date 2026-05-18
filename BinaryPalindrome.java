public class BinaryPalindrome {
    public static void main(String[] args) {

        System.out.print("Enter a number: 9");
        int num = 9;

        // Convert number to binary string
        String binary = Integer.toBinaryString(num);

        // Reverse binary string
        String reverse = new StringBuilder(binary).reverse().toString();

        // Check palindrome
        if (binary.equals(reverse)) {
            System.out.println(num + " is a Binary Palindrome");
        } else {
            System.out.println(num + " is NOT a Binary Palindrome");
        }

        System.out.println("Binary Representation: " + binary);

        // sc.close();
    }
}