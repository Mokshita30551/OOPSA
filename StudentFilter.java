// StudentFilter.java
import java.util.*;
import java.util.function.*;

class Student {
    private String name;
    private double percentage;
    private String grade;

    public Student(String name, double percentage, String grade) {
        this.name = name;
        this.percentage = percentage;
        this.grade = grade;
    }

    public String getName() { return name; }
    public double getPercentage() { return percentage; }
    public String getGrade() { return grade; }

    @Override
    public String toString() {
        return name + " - " + percentage + "% (" + grade + ")";
    }
}

public class StudentFilter {
    public static void main(String[] args) {
        // Step 1: Create a list of students
        List<Student> students = Arrays.asList(
            new Student("Asha", 82.5, "A"),
            new Student("Ravi", 68.0, "B"),
            new Student("Deepa", 91.2, "A+"),
            new Student("Karan", 74.5, "B+"),
            new Student("Sneha", 88.3, "A")
        );

        // Step 2: Create Predicate to filter students scoring above 75%
        Predicate<Student> isTopScorer = s -> s.getPercentage() > 75;

        // Step 3: Create Consumer to display name and grade
        Consumer<Student> displayInfo = s -> 
            System.out.println(s.getName() + " - Grade: " + s.getGrade());

        // Step 4: Use forEach with lambda filtering and display
        System.out.println("Students scoring above 75%:");
        students.stream()
                .filter(isTopScorer)
                .forEach(displayInfo);
    }
}
