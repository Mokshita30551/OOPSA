package co1n2;

public class PriceSum {
    public static void main(String[] args) {
        double[] prices = {199.99, 299.49, 150.75, 450.00};
        double total = 0;

        for (double price : prices) {
            total += price;
        }

        System.out.println("Total Price: $" + total);
    }
}
