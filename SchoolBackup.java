import java.io.*;

public class SchoolBackup {
    public static void main(String[] args) {
        int backupCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("grades.txt"));
             FileWriter fw = new FileWriter("grades_backup.txt")) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    String name = data[0].trim();
                    int grade = Integer.parseInt(data[1].trim());
                    if (grade > 75) {
                        fw.write(name + "," + grade + "\n");
                        backupCount++;
                    }
                }
            }
            System.out.println("Backup completed. Total students backed up: " + backupCount);
        } catch (FileNotFoundException e) {
            System.out.println("Error: grades.txt file not found.");
        } catch (IOException e) {
            System.out.println("File operation error: " + e.getMessage());
        }
    }
}
