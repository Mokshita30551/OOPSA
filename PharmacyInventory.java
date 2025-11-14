// PharmacyInventory.java
import java.util.*;

class Medicine {
    private String name;
    private double price;
    private int expiryYear;

    public Medicine(String name, double price, int expiryYear) {
        this.name = name;
        this.price = price;
        this.expiryYear = expiryYear;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getExpiryYear() { return expiryYear; }

    @Override
    public String toString() {
        return name + " - ₹" + price + " (Expiry: " + expiryYear + ")";
    }
}

public class PharmacyInventory {
    public static void main(String[] args) {
        // Step 1: Create a list of Medicine objects
        List<Medicine> medicines = Arrays.asList(
            new Medicine("Paracetamol", 35.0, 2026),
            new Medicine("Aspirin", 20.0, 2027),
            new Medicine("Cetrizine", 35.0, 2025),
            new Medicine("Ibuprofen", 45.0, 2026),
            new Medicine("Amoxicillin", 20.0, 2028)
        );

        // Step 2: Define a custom Comparator
        Comparator<Medicine> medicineComparator = (m1, m2) -> {
            if (Double.compare(m1.getPrice(), m2.getPrice()) == 0) {
                // If prices are equal → sort by expiryYear descending
                return Integer.compare(m2.getExpiryYear(), m1.getExpiryYear());
            } else {
                // Otherwise → sort by price ascending
                return Double.compare(m1.getPrice(), m2.getPrice());
            }
        };

        // Step 3: Sort the list using the custom comparator
        Collections.sort(medicines, medicineComparator);

        // Step 4: Display the sorted list
        System.out.println("💊 Pharmacy Inventory (Sorted by Price, then Expiry Year):");
        medicines.forEach(System.out::println);
    }
}
