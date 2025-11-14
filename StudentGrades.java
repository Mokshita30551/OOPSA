// StudentGrades.java
import java.util.*;
import java.util.stream.*;

public class StudentGrades {
    public static void main(String[] args) {
        // Step 1: Create a list of students' percentage scores
        List<Double> percentages = Arrays.asList(85.0, 58.5, 72.0, 91.5, 63.5, 49.0, 78.0);

        // Step 2: Use Stream API to filter students scoring above 60%
        // and map percentages to grades (A/B/C)
        List<String> grades = percentages.stream()
            .filter(score -> score > 60)       // keep scores above 60%
            .map(score -> {                    // convert score to grade
                if (score >= 80) return "A";
                else if (score >= 70) return "B";
                else return "C";
            })
            .collect(Collectors.toList());     // collect results into a list

        // Step 3: Display the results
        System.out.println("🎯 Students scoring above 60% and their grades:");
        grades.forEach(System.out::println);
    }
}
