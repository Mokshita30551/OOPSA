package task2;

import java.util.Scanner;

class Course {
    private String courseName;
    private Student[] enrolledStudents;
    private int studentCount;

    public Course(String courseName, int maxStudents) {
        this.courseName = courseName;
        this.enrolledStudents = new Student[maxStudents];
        this.studentCount = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        if (studentCount < enrolledStudents.length) {
            enrolledStudents[studentCount++] = student;
        } else {
            System.out.println("Course " + courseName + " is full.");
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Students in " + courseName + ":");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("- " + enrolledStudents[i].getName());
        }
    }
}

class Student {
    private String name;
    private Course[] enrolledCourses;
    private int courseCount;

    public Student(String name, int maxCourses) {
        this.name = name;
        this.enrolledCourses = new Course[maxCourses];
        this.courseCount = 0;
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (courseCount < enrolledCourses.length) {
            enrolledCourses[courseCount++] = course;
            course.enrollStudent(this);  // Enroll student in the course
        } else {
            System.out.println(name + " cannot enroll in more courses.");
        }
    }

    public void showEnrolledCourses() {
        System.out.println(name + " is enrolled in:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println("- " + enrolledCourses[i].getCourseName());
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of courses
        System.out.print("Enter number of courses: ");
        int numCourses = scanner.nextInt();
        scanner.nextLine();  // consume newline

        Course[] courses = new Course[numCourses];
        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter course name: ");
            String courseName = scanner.nextLine();
            courses[i] = new Course(courseName, 10);  // max 10 students per course
        }

        // Input number of students
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();
            students[i] = new Student(studentName, numCourses);

            // Enroll in courses
            System.out.print("How many courses to enroll " + studentName + " in? ");
            int courseCount = scanner.nextInt();
            scanner.nextLine();
            for (int j = 0; j < courseCount; j++) {
                System.out.print("Enter course name to enroll: ");
                String cName = scanner.nextLine();

                boolean found = false;
                for (Course c : courses) {
                    if (c.getCourseName().equalsIgnoreCase(cName)) {
                        students[i].enrollInCourse(c);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Course not found.");
                }
            }
        }

        // Display enrollments
        System.out.println("\n Student Course Enrollments");
        for (Student student : students) {
            student.showEnrolledCourses();
        }

        System.out.println("\n Course Student Enrollments");
        for (Course course : courses) {
            course.showEnrolledStudents();
        }

        scanner.close();
    }
}

