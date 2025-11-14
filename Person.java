package co1n2;

class Person {
    String name;
    Person(String name) { this.name = name; }
    void display() { System.out.println("Name: " + name); }
}

class Employee extends Person {
    int empId;
    Employee(String name, int empId) {
        super(name);
        this.empId = empId;
    }
    void display() { System.out.println("Employee: " + name + ", ID: " + empId); }
}

class Manager extends Employee {
    String department;
    Manager(String name, int empId, String dept) {
        super(name, empId);
        this.department = dept;
    }
    void display() { System.out.println("Manager: " + name + ", ID: " + empId + ", Dept: " + department); }

    public static void main(String[] args) {
        Manager m = new Manager("Arjun", 501, "IT");
        m.display();
    }
}
