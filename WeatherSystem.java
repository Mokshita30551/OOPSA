package co3;

import java.io.*;

public class WeatherSystem {
    public static void main(String[] args) {
        int cityCount = 0;
        System.out.println("Cities with Temperature > 25°C:");
        try (BufferedReader br = new BufferedReader(new FileReader("weather_data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                cityCount++;
                String[] parts = line.split(",");
                if (parts.length == 2 && Double.parseDouble(parts[1].trim()) > 25) {
                    System.out.println(parts[0]);
                }
            }
            System.out.println("Total Cities: " + cityCount);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
