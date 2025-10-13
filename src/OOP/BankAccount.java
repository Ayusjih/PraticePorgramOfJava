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
}