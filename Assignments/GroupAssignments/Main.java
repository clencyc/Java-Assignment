import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // user input
        Scanner scanner = new Scanner(System.in);

        SimpleATM atm = new SimpleATM();

        boolean atmRunning = true;

        // ask for the user input
        while (atmRunning) {
        System.out.println("Choose a transaction:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. OK");
        System.out.println("5. Cancel");

        int option = scanner.nextInt();

        switch (option) {
            // handling the cases
            case 1:
                System.out.println("Enter the amount to withdraw: ");
                double withdawalamount = scanner.nextDouble();
                atm.withDraw(withdawalamount);
                break;

            case 2:
                System.out.println("Enter amount to deposit: ");
                double depositamount = scanner.nextDouble();
                atm.deposit(depositamount);
                break;

            case 3:
                atm.checkBalance();
                break;
            
            case 4:
                atm.OK();
                break;
            case 5:
                atm.cancel();
                atmRunning = false;    
                break;

            default:
            System.out.println("Invalid option. Please try again.");
        }
    }
    }
    
}
