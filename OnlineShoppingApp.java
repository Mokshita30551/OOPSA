class Order {
    String customerName;
    String productName;
    int quantity;

    public Order(String customerName, String productName, int quantity) {
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
    }

    public void processOrder() {
        try {
            try {
                if (customerName == null || productName == null) {
                    throw new NullPointerException("Customer or product details are missing.");
                }
                if (quantity <= 0) {
                    throw new IllegalArgumentException("Invalid quantity: " + quantity);
                }
                System.out.println("Order placed successfully for " + customerName +
                        ": " + quantity + " x " + productName);
            } catch (NullPointerException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Order processing completed for: " +
                        (customerName != null ? customerName : "Unknown Customer"));
            }
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}

public class OnlineShoppingApp {
    public static void main(String[] args) {
        Order order1 = new Order("Ananya", "Laptop", 2);
        Order order2 = new Order("Rohan", "Headphones", 0);
        Order order3 = new Order(null, "Smartwatch", 1);

        order1.processOrder();
        order2.processOrder();
        order3.processOrder();
    }
}
