public class AtmMachineSimulation {
public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int balance = 10000;

        while(true) {

            System.out.println("\n1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter Amount: ");
                    int deposit = sc.nextInt();

                    balance += deposit;

                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    int withdraw = sc.nextInt();

                    if(withdraw <= balance)
                        balance -= withdraw;
                    else
                        System.out.println("Insufficient Balance");

                    break;

                case 3:
                    System.out.println("Balance = " + balance);

                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}