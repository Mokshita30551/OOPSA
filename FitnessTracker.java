// FitnessTracker.java
import java.util.*;
import java.util.function.*;

class User {
    private String name;
    private int dailySteps;

    public User(String name, int dailySteps) {
        this.name = name;
        this.dailySteps = dailySteps;
    }

    public String getName() { return name; }
    public int getDailySteps() { return dailySteps; }

    @Override
    public String toString() {
        return name + " - Steps: " + dailySteps;
    }
}

public class FitnessTracker {
    public static void main(String[] args) {
        // Step 1: Create a list of users with their daily step counts
        List<User> users = Arrays.asList(
            new User("Asha", 12500),
            new User("Ravi", 8500),
            new User("Deepa", 14300),
            new User("Karan", 9600),
            new User("Sneha", 17800)
        );

        // Step 2: Create a Predicate to filter users with over 10,000 steps
        Predicate<User> isActiveUser = u -> u.getDailySteps() > 10000;

        // Step 3: Create a Consumer to display user details
        Consumer<User> displayUser = u ->
            System.out.println(u.getName() + " walked " + u.getDailySteps() + " steps today!");

        // Step 4: Stream processing with Predicate and Consumer
        System.out.println("🏅 Active Users (Over 10,000 Steps):");
        users.stream()
             .filter(isActiveUser)
             .forEach(displayUser);
    }
}
