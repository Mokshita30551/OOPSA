package co1n2;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable, Swimmable {
    public void fly() { System.out.println("Bird is flying"); }
    public void swim() { System.out.println("Bird is swimming"); }
}

public class BirdDemo {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();
        b.swim();
    }
}
