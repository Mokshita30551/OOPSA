import java.io.*;
import java.util.*;

class Product implements Serializable {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }
}

public class ProductSerializationApp {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "Laptop", 75000.0));
        products.add(new Product(102, "Smartphone", 45000.0));
        products.add(new Product(103, "Headphones", 2500.0));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("inventory.dat"))) {
            oos.writeObject(products);
            System.out.println("Product list serialized successfully to inventory.dat\n");
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("inventory.dat"))) {
            List<Product> deserializedProducts = (List<Product>) ois.readObject();
            System.out.println("Deserialized Product Details:\n");
            for (Product p : deserializedProducts) {
                p.display();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }
}
