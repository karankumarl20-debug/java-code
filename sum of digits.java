class Main {
    public static void main(String[] args) {
        int n = 1234, sum = 0;

        while(n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        System.out.println(sum);
    }
}
