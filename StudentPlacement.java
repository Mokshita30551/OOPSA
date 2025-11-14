// StudentPlacement.java
import java.util.*;

class Candidate {
    String name;
    double cgpa;
    int yearOfPassing;

    public Candidate(String name, double cgpa, int yearOfPassing) {
        this.name = name;
        this.cgpa = cgpa;
        this.yearOfPassing = yearOfPassing;
    }

    @Override
    public String toString() {
        return name + " | CGPA: " + cgpa + " | Year: " + yearOfPassing;
    }
}

public class StudentPlacement {
    public static void main(String[] args) {
        // Step 1: Create a list of candidates
        List<Candidate> candidates = new ArrayList<>();
        candidates.add(new Candidate("Riya Sharma", 9.1, 2024));
        candidates.add(new Candidate("Aman Verma", 8.5, 2023));
        candidates.add(new Candidate("Neha Patel", 9.1, 2023));
        candidates.add(new Candidate("Karan Mehta", 7.9, 2025));
        candidates.add(new Candidate("Sanjay Rao", 8.8, 2024));

        // Step 2: Define Comparator for sorting
        Comparator<Candidate> candidateComparator = Comparator
                .comparingDouble((Candidate c) -> c.cgpa).reversed() // by CGPA descending
                .thenComparingInt(c -> c.yearOfPassing);             // then by year ascending

        // Step 3: Sort and display
        Collections.sort(candidates, candidateComparator);

        System.out.println("🎓 Candidates sorted by CGPA (desc) and Year of Passing (asc):");
        candidates.forEach(System.out::println);
    }
}
