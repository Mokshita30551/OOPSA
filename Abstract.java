// Abstract class Shape
abstract class Shape {
    // Abstract method (no body)
    abstract double area();

    // Concrete (non-abstract) method
    void display() {
        System.out.println("Calculating area of shape...");
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Override area() method
    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle (radius = " + radius + ")";
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override area() method
    @Override
    double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle (length = " + length + ", width = " + width + ")";
    }
}

// Main class to demonstrate polymorphism
public class Abstract {
    public static void main(String[] args) {
        // Declare Shape reference (abstract class cannot be instantiated)
        Shape s1 = new Circle(5.5);       // upcasting to Shape
        Shape s2 = new Rectangle(4.0, 6.0); // upcasting to Shape

        // Demonstrate polymorphism: each call executes subclass version of area()
        s1.display();
        System.out.println(s1 + " -> Area = " + s1.area());

        s2.display();
        System.out.println(s2 + " -> Area = " + s2.area());

        // Example with an array of Shape objects
        System.out.println("\n--- Polymorphism using array of Shape ---");
        Shape[] shapes = { s1, s2, new Circle(3.0), new Rectangle(2.0, 8.0) };

        for (Shape shape : shapes) {
            System.out.println(shape + " -> Area = " + shape.area());
        }
    }
}
