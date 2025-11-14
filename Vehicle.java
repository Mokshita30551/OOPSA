package co1n2;

class Vehicle {
    private String model;
    private int year;
    private int speed;

    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setSpeed(int speed) { this.speed = speed; }

    public String getModel() { return model; }
    public int getYear() { return year; }
    public int getSpeed() { return speed; }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setModel("Tesla Model 3");
        v.setYear(2024);
        v.setSpeed(120);

        System.out.println("Model: " + v.getModel());
        System.out.println("Year: " + v.getYear());
        System.out.println("Speed: " + v.getSpeed());
    }
}
