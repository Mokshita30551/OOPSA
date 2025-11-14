package co3;

import java.io.*;
import java.util.*;

class Ticket implements Serializable {
    private static final long serialVersionUID = 1L;
    int ticketId;
    String eventName;
    double price;

    Ticket(int ticketId, String eventName, double price) {
        this.ticketId = ticketId;
        this.eventName = eventName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId + ", Event: " + eventName + ", Price: $" + price;
    }
}

public class TicketSerialization {
    public static void main(String[] args) {
        List<Ticket> tickets = Arrays.asList(
                new Ticket(201, "Music Fest", 1500),
                new Ticket(202, "Comedy Night", 800),
                new Ticket(203, "Tech Conference", 2500),
                new Ticket(204, "Art Expo", 1200)
        );

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tickets.ser"))) {
            oos.writeObject(tickets);
            System.out.println("✅ Tickets serialized to tickets.ser");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tickets.ser"))) {
            List<Ticket> list = (List<Ticket>) ois.readObject();
            System.out.println("\n🎟️ Deserialized Ticket Details:");
            list.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}

