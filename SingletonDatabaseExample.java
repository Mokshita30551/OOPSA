// SingletonDatabaseExample.java
class DatabaseConnection {

    // Step 1: Create a private static instance variable
    private static DatabaseConnection instance;

    // Step 2: Make constructor private so no other class can instantiate it
    private DatabaseConnection() {
        System.out.println("Database Connection established!");
    }

    // Step 3: Provide a public static method to get the single instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();  // create only once
        }
        return instance;
    }

    // Step 4: Example method representing a database operation
    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }
}

// Main class to test the Singleton behavior
public class SingletonDatabaseExample {
    public static void main(String[] args) {
        System.out.println("=== Database Connection Singleton Demo ===");

        // Try to get multiple instances
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        // Test database operation
        db1.executeQuery("SELECT * FROM users");

        // Verify both instances are the same
        System.out.println("\nChecking if both instances are same:");
        if (db1 == db2) {
            System.out.println("✅ Both db1 and db2 refer to the SAME instance.");
        } else {
            System.out.println("❌ Different instances exist (Singleton failed).");
        }
    }
}
