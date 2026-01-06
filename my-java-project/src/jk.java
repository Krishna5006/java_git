// BankAccount class definition
class BankAccount {
    private double balance; // Private balance variable

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance && amount>0){
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Main class to test the program
public class jk {
    public static void main(String[] args) {
        // Creating a bank account with an initial balance of $1000
        BankAccount myAccount = new BankAccount(1000);

        // Performing transactions
        myAccount.deposit(500);   // Adding money
        myAccount.withdraw(200);  // Withdrawing money
        myAccount.checkBalance(); // Checking balance
    }
}