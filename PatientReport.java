import java.io.*;

public class PatientReport {
    public static void main(String[] args) {
        int totalPatients = 0;
        System.out.println("Patients with Positive Results:\n");

        try (BufferedReader br = new BufferedReader(new FileReader("reports.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                totalPatients++;
                String[] data = line.split(",");
                if (data.length == 2) {
                    String name = data[0].trim();
                    String result = data[1].trim();
                    if (result.equalsIgnoreCase("Positive")) {
                        System.out.println(name);
                    }
                }
            }
            System.out.println("\nTotal Patients: " + totalPatients);
        } catch (FileNotFoundException e) {
            System.out.println("Error: reports.txt file not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
