public class MainExercise2 {

    public static void main(String[] args) {

        // Create 2 customers (2 objects)
        Customer customer1 = new Customer("001", "Maja", "maja@email.com");
        Customer customer2 = new Customer("002", "Bella", "bella@email.com");

        // Print names
        System.out.println("Customer 1 is named: " + customer1.getName());
        System.out.println("Customer 2 is named: " + customer2.getName());

        // Change e-mail for customer 1
        customer1.setEmail("maja_new_email@email.com");

        // Prove that they save their information separately
        System.out.println("-------------------");
        System.out.println("Updated info for customer 1:");
        System.out.println("ID: " + customer1.getCustomerId());
        System.out.println("Name: " + customer1.getName());
        System.out.println("Email: " + customer1.getEmail());

        System.out.println("-------------------");
        System.out.println("Info for customer 2 (that wasn't changed):");
        System.out.println("E-mail: " + customer2.getEmail());

        System.out.println("\n--- Testing validation - Errors should appear below. ---");
        // Test to set an invalid email, missing the @
        customer1.setEmail("invalid-email.com");

        // Test to set empty name:
        customer2.setName("");

        // Check that old name remains for customer2
        System.out.println("Customer 2 name is still: " + customer2.getName());
    }
}
