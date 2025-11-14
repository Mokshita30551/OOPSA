// TaskManager.java
import java.util.*;
import java.util.stream.*;

class Task {
    private String title;
    private String priority;
    private String dueDate;

    public Task(String title, String priority, String dueDate) {
        this.title = title;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public String getTitle() { return title; }
    public String getPriority() { return priority; }
    public String getDueDate() { return dueDate; }

    @Override
    public String toString() {
        return title + " (" + priority + ", Due: " + dueDate + ")";
    }
}

public class TaskManager {
    public static void main(String[] args) {
        // Step 1: Create a list of Task objects
        List<Task> tasks = Arrays.asList(
            new Task("Complete Java Assignment", "High", "2025-11-08"),
            new Task("Team Meeting", "Medium", "2025-11-09"),
            new Task("Prepare Presentation", "High", "2025-11-10"),
            new Task("Email Follow-up", "Low", "2025-11-07"),
            new Task("Code Review", "High", "2025-11-11")
        );

        // Step 2: Use Stream API to filter high-priority tasks
        List<String> highPriorityTitles = tasks.stream()
            .filter(task -> task.getPriority().equalsIgnoreCase("High"))  // keep only High priority
            .map(Task::getTitle)                                          // extract titles
            .collect(Collectors.toList());                                // collect into list

        // Step 3: Display the filtered task titles
        System.out.println("📝 High Priority Tasks:");
        highPriorityTitles.forEach(System.out::println);
    }
}
