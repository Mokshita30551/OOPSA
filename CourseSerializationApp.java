import java.io.*;
import java.util.*;

class Course implements Serializable {
    private int courseId;
    private String title;
    private int credits;
    private transient String instructorNotes;

    public Course(int courseId, String title, int credits, String instructorNotes) {
        this.courseId = courseId;
        this.title = title;
        this.credits = credits;
        this.instructorNotes = instructorNotes;
    }

    public void display() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Title: " + title);
        System.out.println("Credits: " + credits);
        System.out.println("Instructor Notes: " + instructorNotes);
    }
}

public class CourseSerializationApp {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course(101, "Data Structures", 4, "Explain stack and queue examples"));
        courses.add(new Course(102, "Database Systems", 3, "Emphasize SQL normalization"));
        courses.add(new Course(103, "Operating Systems", 4, "Focus on process scheduling"));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("courses.ser"))) {
            oos.writeObject(courses);
            System.out.println("Course list serialized successfully to courses.ser\n");
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("courses.ser"))) {
            List<Course> deserializedCourses = (List<Course>) ois.readObject();
            System.out.println("Deserialized Course Details:\n");
            for (Course c : deserializedCourses) {
                c.display();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }
}
