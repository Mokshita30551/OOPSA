// Person.java
public class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void display() {
        System.out.println("Person -> Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }
}

// Employee.java
public class Employee extends Person {
    protected String employeeId;
    protected String department;
    protected double salary;

    public Employee(String name, int age, String gender,
                    String employeeId, String department, double salary) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Employee -> ID: " + employeeId +
                           ", Name: " + name +
                           ", Dept: " + department +
                           ", Age: " + age +
                           ", Gender: " + gender +
                           ", Salary: " + salary);
    }
}

// Manager.java
public class Manager extends Employee {
    private int teamSize;
    private String[] teamMembers; // optional: store team member names
    private String level; // e.g., "Senior", "Lead"

    public Manager(String name, int age, String gender,
                   String employeeId, String department, double salary,
                   int teamSize, String level, String[] teamMembers) {
        super(name, age, gender, employeeId, department, salary);
        this.teamSize = teamSize;
        this.level = level;
        this.teamMembers = teamMembers != null ? teamMembers.clone() : new String[0];
    }

    @Override
    public void display() {
        System.out.print("Manager -> ID: " + employeeId +
                         ", Name: " + name +
                         ", Level: " + level +
                         ", Dept: " + department +
                         ", TeamSize: " + teamSize +
                         ", Salary: " + salary +
                         ", TeamMembers: ");
        if (teamMembers.length == 0) {
            System.out.println("None");
        } else {
            for (int i = 0; i < teamMembers.length; i++) {
                System.out.print(teamMembers[i]);
                if (i < teamMembers.length - 1) System.out.print(", ");
            }
            System.out.println();
        }
    }
}

// Main.java (demo)
public class Main {
    public static void main(String[] args) {
        Person p = new Person("Asha Rao", 28, "Female");
        Employee e = new Employee("Ravi Kumar", 30, "Male", "E102", "Engineering", 65000);
        String[] team = { "Ravi Kumar", "Deepa Nair", "Sandeep Joshi" };
        Manager m = new Manager("Sunita Sharma", 38, "Female", "M01", "Engineering", 120000, 3, "Senior", team);

        // Direct calls
        p.display();
        e.display();
        m.display();

        System.out.println("\n--- Demonstrating polymorphism ---");
        Person[] people = { p, e, m };
        for (Person person : people) {
            // dynamic dispatch - the most derived display() runs
            person.display();
        }
    }
}
