import java.io.*;
import java.util.*;

class Student implements Serializable {
    private int id;
    private String name;
    private String grade;
    private transient String password;

    public Student(int id, String name, String grade, String password) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.password = password;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Password: " + password);
    }
}

public class StudentSerializationApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Ananya", "A", "pass123"));
        students.add(new Student(102, "Rohan", "B", "secure456"));
        students.add(new Student(103, "Meera", "A+", "hidden789"));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.ser"))) {
            oos.writeObject(students);
            System.out.println("Students serialized successfully.\n");
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.ser"))) {
            List<Student> deserializedStudents = (List<Student>) ois.readObject();
            System.out.println("Deserialized Student Details:\n");
            for (Student s : deserializedStudents) {
                s.display();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }
}
