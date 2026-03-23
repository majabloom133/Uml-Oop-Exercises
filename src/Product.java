public class Product {

    // 1. Fields (Encapsulation w. private fields)
    private String productId;
    private String name;
    private double price;

    // 2. Constructor - "start button" - Initializes data
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters - To read product information
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setters - To make changes in products
    // Set product ID
    public void setProductId(String productId) {
        if (productId != null && !productId.isEmpty()) {
            this.productId = productId;
        }
    }

    // Set new name
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setPrice(double newPrice) {
        if (newPrice >= 0) {
            this.price = newPrice;
        } else {
            System.out.println("Error: Price cannot be negative!");
        }
    }
}

