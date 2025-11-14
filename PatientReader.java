package co3;

import java.io.*;

public class PatientReader {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Patients with names starting with 'J':");
        try (BufferedReader br = new BufferedReader(new FileReader("patients.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                count++;
                String[] parts = line.split(",");
                if (parts.length > 1 && parts[1].trim().startsWith("J")) {
                    System.out.println(parts[1].trim());
                }
            }
            System.out.println("Total Patients: " + count);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
