// ReflectionExample.java
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionExample {

    // Inner Product class
    public static class Product {
        private int id;
        private String name;
        private double price;

        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public void showDetails() {
            System.out.println("Product Details:");
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Price: ₹" + price);
        }
    }

    // Main method
    public static void main(String[] args) {
        try {
            // Step 1: Load the Product class dynamically
            Class<?> cls = Class.forName("ReflectionExample$Product");

            // Step 2: Get the constructor with (int, String, double)
            Constructor<?> constructor = cls.getConstructor(int.class, String.class, double.class);

            // Step 3: Create a Product object dynamically
            Object obj = constructor.newInstance(101, "Wireless Mouse", 799.99);

            // Step 4: Get the showDetails() method
            Method method = cls.getMethod("showDetails");

            // Step 5: Invoke the showDetails() method
            method.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
