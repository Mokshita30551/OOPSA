package co3;

import java.io.*;
import java.util.*;

public class RestaurantSystem {
    public static void appendOrders(ArrayList<String> orders) {
        try (FileWriter fw = new FileWriter("orders.log", true)) {
            for (String order : orders) {
                fw.write(order + "\n");
            }
            System.out.println("✅ Orders appended successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> orders = new ArrayList<>(Arrays.asList(
                "2025-10-13 12:30: Pizza $15",
                "2025-10-13 12:45: Pasta $12"
        ));
        appendOrders(orders);
    }
}
