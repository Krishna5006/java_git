public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Demonstrating deposit method
        account.deposit(100.0);
        System.out.println("Balance after deposit: " + account.checkBalance());

        // Demonstrating withdraw method
        account.withdraw(50.0);
        System.out.println("Balance after withdrawal: " + account.checkBalance());

        // Attempting to access private variable balance directly (will cause an error)
        // System.out.println("Direct access to balance: " + account.balance); // This line is commented out to avoid compilation error
    }
}