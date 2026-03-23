

public class BankAccount {

// Save the name (Text = String)
private String accountHolder;
// Save the balance (decimals = double)
private double balance;

// Constructor - This will run when typing "new BankAccount(...)"
public BankAccount(String accountHolder, double balance) {
    this.accountHolder = accountHolder;
    this.balance = balance;
}

// Getter for accountHolder - Returns name
    public String getAccountHolder() {
    return accountHolder;
    }
// Getter for balance - Returns the balance.
    public double getBalance() {
    return balance;
    }
    // Setter for accountHolder - updates name if new value isn't empty
    public void setAccountHolder(String accountHolder)
    {
        // Check if name is valid
        if (accountHolder != null && !accountHolder.isEmpty()) {
         // Update field with new name
            this.accountHolder = accountHolder;
        }
    }
    // Setter for balance - allows you to manually update if the value is 0 or more
    public void setBalance(double balance) {
    // Make sure new balance isn't negative.
    if (balance >= 0) {
     // Update field with new balance.
        this.balance = balance;
    } else {
        System.out.println("Error: Balance can't be negative.");
    }
    }

// Deposit
    public void deposit(double amount) {
    // Check if deposit amount is positive.
    if (amount > 0) {
        // Adds amount to balance.
        balance += amount;
        System.out.println(amount + " kr has been deposited.");
    }
    }

    // Withdraw money
    public  void withdraw(double amount) {
    // Check if amount is positive and if there is enough money on account.
    if (amount > 0 && amount <= balance) {
        // Same as balance = balance - amount
        balance -= amount;
        System.out.println(amount + " kr has been withdrawn.");
    } else {
        // Print error if balance is too low
        System.out.println("Withdrawal denied. Balance to small or invalid amount.");
    }
    }

}
