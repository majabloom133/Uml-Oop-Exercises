public class MainExercise4 {

    public static void main(String[] args) {
        // Create 2 different products/objects
        Product p1 = new Product("P001", "Laptop", 12500.50);
        Product p2 = new Product("P002", "Gaming mouse", 899.0);

        // Print information
        System.out.println("Product 1: " + p1.getName() + " costs " + p1.getPrice() + " kr.");
        System.out.println("Product 2: " + p2.getName() + " costs " + p2.getPrice() + " kr.");

        // Change price (for a sale, for example
        p1.setPrice(10999.0);

        System.out.println("------------------");
        System.out.println("Sale on " + p1.getName() + "!New price: " + p1.getPrice() + " kr.");

        // Proof p2 didn't change
        System.out.println("Price of " + p2.getName() + " is still " + p2.getPrice() + " kr.");


    }


}
