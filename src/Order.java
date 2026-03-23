import java.util.ArrayList;

public class Order {

    // Fields (private for encapsulation)
    private String orderId;
    // A list that is only allowed to hold Products-objects
    private ArrayList<Product> products;

    // Constructur - Initializes the order with ID and empty list
    public Order(String orderId) {
        this.orderId = orderId;
        // Create an empty list when order is created
        this.products = new ArrayList<>();
    }

    // Methods
    // Add product to list
    public void addProduct(Product p) {
        // Adds product to the list
        products.add(p);
        System.out.println(p.getName() + " was added in order " + orderId);
    }
    // Remove products from the list with error handling
    public void removeProduct(Product p) {
        // Check if product actually exists before trying to remove it.
        if (products.contains(p)) {
            // Removes product
            products.remove(p);
            System.out.println(p.getName() + " was removed from the order " + orderId);
        } else {
            // Print error if product can't be found in the order
            System.out.println("Error: Product " + p.getName() + " not found in this order.");
        }
    }
    // Calculate total for all products in the list
    public double calculateTotal() {
        double total = 0;
        // A for-each loop that runs through every object on the list
        for (Product p : products) {
            // Add price to total
            total += p.getPrice();
        }
        // Return final amount
        return total;
    }
    // Getter for orderId
    public String getOrderId() {
        return orderId;
    }

    // Getter for the product list - to see all items in order.
    public ArrayList<Product> getProducts() {
        return products;
    }
}
