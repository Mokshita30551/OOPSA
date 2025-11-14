class Course {
    private String courseName;
    private int duration;
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public static void main(String[] args) {
        Course c = new Course();
        c.setCourseName("Java Programming");
        c.setDuration(3);
        System.out.println("Course Name: " + c.getCourseName());
        System.out.println("Course Duration: " + c.getDuration() + " months");

}
}