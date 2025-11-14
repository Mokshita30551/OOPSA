// GenericPair.java

// Step 1: Define a generic Pair class with two type parameters K and V
class Pair<K, V> {
    private K key;
    private V value;

    // Constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter for key
    public K getKey() {
        return key;
    }

    // Setter for key
    public void setKey(K key) {
        this.key = key;
    }

    // Getter for value
    public V getValue() {
        return value;
    }

    // Setter for value
    public void setValue(V value) {
        this.value = value;
    }

    // Display method
    public void display() {
        System.out.println("Key: " + key + " | Value: " + value);
    }
}

// Step 2: Demonstration class
public class GenericPair {
    public static void main(String[] args) {
        System.out.println("=== Generic Pair Demonstration ===");

        // Pair 1: Integer key, String value (Student data)
        Pair<Integer, String> student = new Pair<>(101, "Asha Rao");
        student.display();

        // Pair 2: String key, Double value (Product price data)
        Pair<String, Double> product = new Pair<>("Laptop", 78999.50);
        product.display();

        // Step 3: Update values
        student.setValue("Ravi Kumar");
        product.setValue(69999.00);

        System.out.println("\nAfter updates:");
        student.display();
        product.display();
    }
}
