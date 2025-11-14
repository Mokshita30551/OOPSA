package co3;

class Box<T> {
    private T value;

    public void set(T value) { this.value = value; }
    public T get() { return value; }
}

public class GenericBoxDemo {
    public static <T> boolean compareBoxes(Box<T> b1, Box<T> b2) {
        return b1.get().equals(b2.get());
    }

    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>(); box1.set(10);
        Box<Integer> box2 = new Box<>(); box2.set(10);
        System.out.println("Boxes equal? " + compareBoxes(box1, box2));

        Box<String> s1 = new Box<>(); s1.set("Hello");
        Box<String> s2 = new Box<>(); s2.set("World");
        System.out.println("Boxes equal? " + compareBoxes(s1, s2));
    }
}

