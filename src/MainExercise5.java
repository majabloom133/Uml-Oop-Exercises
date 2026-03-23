public class MainExercise5 {

    public static void main(String[] args) {
        // Create some objects
        Product p1 = new Product("P001", "Laptop", 10000);
        Product p2 = new Product("P002", "Mouse", 500);
        Product p3 = new Product("P003", "Keyboard", 1200);

        // Create two different orders
        Order order1 = new Order("0RD-001");
        Order order2 = new Order("0RD-002");

        // Add items to order 1
        order1.addProduct(p1);
        order1.addProduct(p2);

        // Add items to order 2
        order2.addProduct(p2);
        order2.addProduct(p3);

        // Show total price for each order separately
        System.out.println("----------------");
        System.out.println("Total for order 1: " + order1.calculateTotal() + " kr.");
        System.out.println("Total for order 2: " + order2.calculateTotal() + " kr.");

        // Test to remove item to check if price updates
        System.out.println("Removing " + p2.getName() + " from order 1...");
        order1.removeProduct(p2);
        System.out.println("New total for order 1: " + order1.calculateTotal() + " kr.");


    }

}
