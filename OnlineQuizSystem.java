public class OnlineQuizSystem {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int score = 0;

        System.out.println("Java developed by?");
        System.out.println("1.James Gosling");
        System.out.println("2.Dennis Ritchie");

        int ans = scanner.nextInt();

        if(ans == 1)
            score++;

        System.out.println("Score = " + score);
    }
}