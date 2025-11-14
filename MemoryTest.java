class MemoryDemo {
    int id;

    MemoryDemo(int id) {
        this.id = id;
        System.out.println("Object created with ID: " + id);
    }

    @Override
    protected void finalize() {
        System.out.println("Object with ID " + id + " is being garbage collected.");
    }
}

public class MemoryTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            MemoryDemo obj = new MemoryDemo(i);
        }

        System.gc();
        System.out.println("Main method completed.");
    }
}
