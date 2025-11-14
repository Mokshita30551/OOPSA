

class Computer {
    // Step 1: Private fields (complex object)
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private String os;

    // Step 2: Private constructor (only Builder can create)
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.os = builder.os;
    }

    // Step 3: Static nested Builder class
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String gpu;
        private String os;

        // Mandatory fields can go in constructor, or all can be optional
        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this; // allows chaining
        }

        public Builder setRAM(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setOS(String os) {
            this.os = os;
            return this;
        }

        // Step 4: Build method returns the final Computer object
        public Computer build() {
            return new Computer(this);
        }
    }

    // Step 5: Display method
    public void showDetails() {
        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("GPU: " + (gpu != null ? gpu : "None"));
        System.out.println("Operating System: " + (os != null ? os : "Not Installed"));
        System.out.println("-----------------------------------");
    }
}

// Step 6: Main class to demonstrate the Builder Pattern
public class BuilderPatternExample {
    public static void main(String[] args) {
        System.out.println("=== Builder Design Pattern Example ===\n");

        // Build a basic computer
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i3")
                .setRAM("8GB")
                .setStorage("512GB HDD")
                .build();

        // Build a gaming computer
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("2TB SSD")
                .setGPU("NVIDIA RTX 4090")
                .setOS("Windows 11 Pro")
                .build();

        // Display configurations
        System.out.println("Basic Computer:");
        basicComputer.showDetails();

        System.out.println("Gaming Computer:");
        gamingComputer.showDetails();
    }
}
