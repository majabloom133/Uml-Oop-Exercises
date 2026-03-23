public class MainExercise1 {

    public static void main(String[] args) {

        // Create 2 separate bank accounts (objects) from same blueprint (class)
        BankAccount account1 = new BankAccount("Kalle", 1000.0);
        BankAccount account2 = new BankAccount("Lisa", 500.0);

        // Try to deposit money to Kalles account
        account1.deposit(500.0);

        // Try to withdraw to much from Lisas account
        account2.withdraw(1000.0);

        // Test the setter to change namne
        account1.setAccountHolder("Gustav");
        System.out.println("New name for account 1: " + account1.getAccountHolder());

        // Check the balance again
        System.out.println(account1.getAccountHolder() + " has " + account1.getBalance() + " kr.");
        System.out.println(account2.getAccountHolder() + " has " + account2.getBalance() + " kr.");
    }
}

