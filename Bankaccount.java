public class BankAccount {
    private String accountType;
    private double balance;

    // Constructors
    public BankAccount(String accountType) {
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public BankAccount(String accountType, double initialBalance) {
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    // Methods
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    public void deposit(String depositType, double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " by " + depositType + " successful.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Example usage
        BankAccount savingsAccount = new BankAccount("Savings");
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(200);
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());

        BankAccount checkingAccount = new BankAccount("Checking", 500);
        checkingAccount.deposit("Cash", 300);
        checkingAccount.withdraw(700);
        System.out.println("Checking Account Balance: $" + checkingAccount.getBalance());
    }
}
