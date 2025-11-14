import java.util.*;

class LateCheckInException extends Exception {
    public LateCheckInException(String message) {
        super(message);
    }
}

class FlightCheckIn {
    private String passengerName;
    private int minutesBeforeDeparture;

    public FlightCheckIn(String passengerName, int minutesBeforeDeparture) {
        this.passengerName = passengerName;
        this.minutesBeforeDeparture = minutesBeforeDeparture;
    }

    public void checkIn() throws LateCheckInException {
        if (minutesBeforeDeparture < 30) {
            throw new LateCheckInException("Check-in failed: " + passengerName + " arrived only " + minutesBeforeDeparture + " minutes before departure.");
        } else {
            System.out.println("Check-in successful for " + passengerName + ". (" + minutesBeforeDeparture + " minutes before departure)");
        }
    }
}

public class FlightApp {
    public static void main(String[] args) {
        FlightCheckIn p1 = new FlightCheckIn("Ananya", 45);
        FlightCheckIn p2 = new FlightCheckIn("Rohan", 20);

        try {
            p1.checkIn();
        } catch (LateCheckInException e) {
            System.out.println(e.getMessage());
        }

        try {
            p2.checkIn();
        } catch (LateCheckInException e) {
            System.out.println(e.getMessage());
        }
    }
}
