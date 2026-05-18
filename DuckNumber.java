public class DuckNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String num = sc.nextLine();

        // Check if first digit is '0'
        if (num.charAt(0) == '0') {
            System.out.println("Not a Duck Number");
        } else if (num.contains("0")) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not a Duck Number");
        }

        sc.close();
    }
}