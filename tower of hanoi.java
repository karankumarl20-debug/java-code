class Main {

    static void toh(int n, char source, char aux, char dest) {

        if(n == 1) {
            System.out.println(source + " -> " + dest);
            return;
        }

        toh(n-1, source, dest, aux);

        System.out.println(source + " -> " + dest);

        toh(n-1, aux, source, dest);
    }

    public static void main(String[] args) {
        toh(3,'A','B','C');
    }
}