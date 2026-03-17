

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

// Getter for name
    public String getAccountHolder() {
    return accountHolder;
    }

// Getter for balance
    public double getBalance() {
    return balance;
    }

}
