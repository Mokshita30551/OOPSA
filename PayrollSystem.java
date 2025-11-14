import java.io.*;

public class PayrollSystem {
    public static void main(String[] args) {
        int totalEmployees = 0;
        System.out.println("Employees working more than 35 hours:\n");

        try (BufferedReader br = new BufferedReader(new FileReader("hours.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                totalEmployees++;
                String[] data = line.split(",");
                if (data.length == 2) {
                    String name = data[0].trim();
                    int hours = Integer.parseInt(data[1].trim());
                    if (hours > 35) {
                        System.out.println(name + " - " + hours + " hours");
                    }
                }
            }
            System.out.println("\nTotal Employees Processed: " + totalEmployees);
        } catch (FileNotFoundException e) {
            System.out.println("Error: hours.txt file not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
