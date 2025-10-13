package OOP;

class BankAccount {
    // Private data - cannot be accessed directly from outside the class
    private final String accountNumber; // final: can't be changed after creation
    private String accountHolder;
    private double balance;

    // Constructor to initialize the object
    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0; // New accounts start with a zero balance
    }

    // --- Getter Methods (to "get" or read data) ---
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public double getBalance() {
        return this.balance;
    }

    // --- Setter Method (to "set" or update data) ---
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // --- Other Methods that modify data with logic ---

    /**
     * Adds money to the account.
     *
     * @param amount The amount to deposit (must be positive).
     */
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > this.balance) {
            System.out.println("Withdrawal failed. Insufficient funds.");
        } else {
            this.balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        }
    }
    public class BankDemo {
        public static void main(String[] args) {
            // Create an instance of BankAccount
            BankAccount myAccount = new BankAccount("SB-12345", "Ayush Ojha");

            // Use methods to interact with the object
            System.out.println("Account Holder: " + myAccount.getAccountHolder()); // Getter
            System.out.println("Initial Balance: $" + myAccount.getBalance()); // Getter

            System.out.println("\n--- Transactions ---");
            myAccount.deposit(5000.0);
            myAccount.withdraw(1200.0);
            myAccount.deposit(-100.0); // Invalid transaction
            myAccount.withdraw(4000.0); // Invalid transaction

            System.out.println("\nFinal Balance: $" + myAccount.getBalance());
        }
    }
}