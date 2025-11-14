import java.io.*;

class Employee implements Serializable {
    private int id;
    private String name;
    private double salary;
    private transient String password;

    public Employee(int id, String name, double salary, String password) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.password = password;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Password: " + password);
        System.out.println("----------------------");
    }
}

public class HRApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Ananya", 55000.0, "secure123");
        Employee emp2 = new Employee(102, "Rohan", 48000.0, "pass456");

        try {
            FileOutputStream fos = new FileOutputStream("employees.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp1);
            oos.writeObject(emp2);
            oos.close();
            fos.close();
            System.out.println("Employee data serialized successfully.\n");
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        try {
            FileInputStream fis = new FileInputStream("employees.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee e1 = (Employee) ois.readObject();
            Employee e2 = (Employee) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Deserialized Employee Data:");
            e1.display();
            e2.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }
}
