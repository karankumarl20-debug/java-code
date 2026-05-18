public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String str = "Hello@# World$%^!";
        StringBuilder cleanedStr = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
                cleanedStr.append(ch);
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Cleaned String: " + cleanedStr.toString());
    }
}
