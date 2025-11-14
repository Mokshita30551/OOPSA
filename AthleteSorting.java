// AthleteSorting.java
import java.util.*;

// Step 1: Define Athlete class implementing Comparable
class Athlete implements Comparable<Athlete> {
    String name;
    String country;
    double score;

    public Athlete(String name, String country, double score) {
        this.name = name;
        this.country = country;
        this.score = score;
    }

    // Step 2: Implement compareTo() for natural sorting by name
    @Override
    public int compareTo(Athlete other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return name + " (" + country + ") - Score: " + score;
    }
}

public class AthleteSorting {
    public static void main(String[] args) {
        // Step 3: Create a list of athletes
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete("Ravi Kumar", "India", 88.5));
        athletes.add(new Athlete("John Smith", "USA", 92.3));
        athletes.add(new Athlete("Carlos Mendes", "Brazil", 78.9));
        athletes.add(new Athlete("Akira Tanaka", "Japan", 91.2));

        // Step 4: Sort using Comparable (by name)
        Collections.sort(athletes);
        System.out.println("🏅 Sorted by Name (using Comparable):");
        athletes.forEach(System.out::println);

        // Step 5: Sort using Comparator (by score descending)
        Comparator<Athlete> byScoreDesc = (a1, a2) -> Double.compare(a2.score, a1.score);
        Collections.sort(athletes, byScoreDesc);

        System.out.println("\n🔥 Sorted by Score (Descending, using Comparator):");
        athletes.forEach(System.out::println);
    }
}
