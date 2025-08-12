package task4;

// Base class
class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Subclass 1: Student
class Student extends Person {
    private String course;
    private double percentage;

    public Student(String name, int id, String course, double percentage) {
        super(name, id);
        this.course = course;
        this.percentage = percentage;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        super.displayDetails();
        System.out.println("Course: " + course);
        System.out.println("Percentage: " + percentage);
    }
}

// Subclass 2: Faculty
class Faculty extends Person {
    private String department;
    private double salary;

    public Faculty(String name, int id, String department, double salary) {
        super(name, id);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Faculty Details ---");
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}

// Subclass 3: Admin
class Admin extends Person {
    private String role;
    private String shift;

    public Admin(String name, int id, String role, String shift) {
        super(name, id);
        this.role = role;
        this.shift = shift;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Admin Details ---");
        super.displayDetails();
        System.out.println("Role: " + role);
        System.out.println("Shift: " + shift);
    }
}

// Main class to test
public class Task4 {
    public static void main(String[] args) {
        // Create objects
        Student student = new Student("Aashrith", 101, "B.Tech CSE", 98.5);
        Faculty faculty = new Faculty("Dr. Swapnika", 8815, "Computer Science", 150000);
        Admin admin = new Admin("Mr. Gopala Krishna", 705, "System Admin", "Morning");

        // Display details using method overriding
        student.displayDetails();
        faculty.displayDetails();
        admin.displayDetails();
    }
}
