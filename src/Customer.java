public class Customer {

    // Fields - private for encapsulation!
    private String customerId;
    private String name;
    private String email;

    // Constructor - This will run when new customer is created
    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    // Getters - to read private data
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Setters - to update data

// Updates name if new value isn't empty:
public void setName(String newName) {
    if (newName != null && !newName.isEmpty()) {
        this.name = newName;
    } else {
        System.out.println("Error: The name field can't be empty.");
    }
    }

    // Updates email - checks for basic validity (must contain @)
    public void setEmail(String newEmail) {
        if (newEmail != null && newEmail.contains("@")) {
            this.email = newEmail;
        } else {
            System.out.println("Error: Invalid email adress, missing @.");
        }
    }
}