class Main {
    public static void main(String[] args) {
        int n = 10, sum = 0;

        for(; n > 0; ) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println(sum);
    }        
}