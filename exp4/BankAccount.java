package exp4;

class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Public method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Protected method to withdraw funds
    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    // Default-access method to check balance
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        // Creating object of BankAccount
        BankAccount account = new BankAccount(1000);
        
        // Accessing public method
        account.deposit(500);
        
        // Accessing default-access method
        account.checkBalance();
        
        // Accessing protected method (not accessible outside subclass)
        // account.withdraw(200); // Uncommenting this will cause an error
    }
}
