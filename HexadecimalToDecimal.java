public class HexadecimalToDecimal {
    public static void main(String[] args) {
        String hexNumber = "1A";
        int decimalNumber = Integer.parseInt(hexNumber, 16);
        System.out.println("The decimal equivalent of hexadecimal " + hexNumber + " is: " + decimalNumber);
    }
}
