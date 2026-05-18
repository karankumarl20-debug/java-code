public class OctalToDecimal {
    public static void main(String[] args) {
        String octalNumber = "24";
        int decimalNumber = Integer.parseInt(octalNumber, 8);
        System.out.println("The decimal equivalent of octal " + octalNumber + " is: " + decimalNumber);
    }
}
