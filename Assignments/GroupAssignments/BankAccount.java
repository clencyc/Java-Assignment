// Abstract class for Bank Account defining the operations
abstract class ATM {
    public abstract void withDraw(double withdawalamount);
    public abstract void deposit(double depositamount);
    public abstract void checkBalance();
    public abstract void cancel();
    public abstract void OK();
}
// this is inheritance
class SimpleATM extends ATM {

    private double balance = 12000.34; // double takes 15 dps while float takes 7 dps

    // Implement withdraw method
    public void withDraw(double withdrawalamount) {
		if(withdrawalamount > balance) {
			System.out.println("Insufficient balance");
		} else {
	            balance -= withdrawalamount; 
	            System.out.println("You withdrew: $" + withdrawalamount);
	            System.out.println("New balance: $" + balance);
                System.out.println("OK");
		}
	}

    // Implement deposit method
    public void deposit(double depositamount) {
        balance += depositamount;
        System.out.println("You deposited: $" + depositamount);
        System.out.println("New balance: $" + balance);
        System.out.println("Thank you for depositing!");
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    // cancelling the transaction
    public void cancel() {
        System.out.println("Transaction cancelled");
    }

    // 'OK' method
    public void OK() {
        System.out.println("Thank you for choosing us!");
    }
}