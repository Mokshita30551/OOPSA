// EventManagement.java
import java.time.LocalDate;
import java.util.*;

// Step 1: Define Event class implementing Comparable
class Event implements Comparable<Event> {
    String name;
    LocalDate date;
    int attendance;

    public Event(String name, LocalDate date, int attendance) {
        this.name = name;
        this.date = date;
        this.attendance = attendance;
    }

    // Step 2: Implement compareTo() to sort by date (ascending)
    @Override
    public int compareTo(Event other) {
        return this.date.compareTo(other.date);
    }

    @Override
    public String toString() {
        return name + " | " + date + " | Attendance: " + attendance;
    }
}

public class EventManagement {
    public static void main(String[] args) {
        // Step 3: Create a list of events
        List<Event> events = new ArrayList<>();
        events.add(new Event("Tech Conference", LocalDate.of(2025, 11, 15), 500));
        events.add(new Event("Music Festival", LocalDate.of(2025, 8, 10), 1200));
        events.add(new Event("Startup Meetup", LocalDate.of(2025, 9, 5), 300));
        events.add(new Event("Art Exhibition", LocalDate.of(2025, 7, 20), 800));

        // Step 4: Sort by natural order (date) using Comparable
        Collections.sort(events);
        System.out.println("📅 Events sorted by Date (using Comparable):");
        events.forEach(System.out::println);

        // Step 5: Sort by attendance (descending) using Comparator
        Comparator<Event> byAttendanceDesc = (e1, e2) -> Integer.compare(e2.attendance, e1.attendance);
        Collections.sort(events, byAttendanceDesc);

        System.out.println("\n👥 Events sorted by Attendance (Descending, using Comparator):");
        events.forEach(System.out::println);
    }
}
