public class AcademicMarks {
    public static void main(String[] args) {
        int[][] marks = {
            {45, 67, 56}, 
            {23, 78, 90}, 
            {35, 40, 50}
        };

        String[] students = {"Ananya", "Rohan", "Meera"};

        System.out.println("Students passing all subjects:");

        for (int i = 0; i < marks.length; i++) {
            boolean passedAll = true;
            for (int m : marks[i]) {
                if (m < 35) {
                    passedAll = false;
                    break;
                }
            }
            if (passedAll) {
                System.out.println(students[i]);
            }
        }
    }
}
