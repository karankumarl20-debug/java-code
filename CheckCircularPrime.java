public class CheckCircularPrime {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isCircularPrime(int n) {
        String str = Integer.toString(n);
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (!isPrime(Integer.parseInt(str)))
                return false;
            str = str.substring(1) + str.charAt(0); // Rotate the number
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 197;
        if (isCircularPrime(num))
            System.out.println(num + " is a circular prime.");
        else
            System.out.println(num + " is not a circular prime.");
    }
}
