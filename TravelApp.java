import java.util.*;

class InvalidDestinationException extends Exception {
    public InvalidDestinationException(String message) {
        super(message);
    }
}

class TravelBooking {
    private static final List<String> validDestinations = Arrays.asList("Paris", "London", "Tokyo", "New York", "Dubai");

    public void bookTicket(String destination) throws InvalidDestinationException {
        if (!validDestinations.contains(destination)) {
            throw new InvalidDestinationException("Invalid destination: " + destination + ". Please choose a valid city.");
        } else {
            System.out.println("Booking confirmed to " + destination + "!");
        }
    }
}

public class TravelApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelBooking booking = new TravelBooking();

        System.out.println("Available destinations: Paris, London, Tokyo, New York, Dubai");
        System.out.print("Enter your destination: ");
        String destination = sc.nextLine();

        try {
            booking.bookTicket(destination);
        } catch (InvalidDestinationException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using the Travel Booking System.");
        }

        sc.close();
    }
}
