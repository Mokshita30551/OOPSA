package co3;

import java.util.*;

class Product {
    String productName;
    double price;
    double rating;

    Product(String productName, double price, double rating) {
        this.productName = productName;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return productName + " | Rating: " + rating + " | Price: $" + price;
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Laptop", 80000, 4.7),
                new Product("Phone", 50000, 4.7),
                new Product("Tablet", 30000, 4.5),
                new Product("Earbuds", 2000, 4.8)
        ));

        Collections.sort(products, (p1, p2) -> {
            int rateCompare = Double.compare(p2.rating, p1.rating);
            return (rateCompare != 0) ? rateCompare : Double.compare(p1.price, p2.price);
        });

        System.out.println("📦 Sorted Products:");
        products.forEach(System.out::println);
    }
}

