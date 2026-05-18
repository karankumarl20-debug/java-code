public class PalindromeUsingRecursion {
    static String reverse(String str) {

        if(str.isEmpty())
            return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        String str = "madam";

        if(str.equals(reverse(str)))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
