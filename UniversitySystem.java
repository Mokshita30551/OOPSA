class Student {
    private int studentId;
    private String studentName;
    private String course;
    private static int totalRegistrations = 0;

    public Student(int studentId, String studentName, String course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        totalRegistrations++;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourse() {
        return course;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course Enrolled: " + course);
        System.out.println("----------------------------");
    }

    public static void displayTotalRegistrations() {
        System.out.println("Total Students Registered: " + totalRegistrations);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ananya", "Computer Science");
        Student s2 = new Student(102, "Rohan", "Mechanical Engineering");
        Student s3 = new Student(103, "Meera", "Electronics");

        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();

        Student.displayTotalRegistrations();
    }
}
