package com.gla.WrapperClasses.Scenario;
import java.util.ArrayList;

public class SensorData {


        // List to store sensor readings as Double objects
        private ArrayList<Double> sensorData = new ArrayList<>();

        // Method to log a reading (accepts primitive double)
        public void logReading(double reading) {
            sensorData.add(reading); // auto-boxing: double → Double
            System.out.println("Logged primitive reading: " + reading);
        }

        // Method to log a reading (accepts Double object)
        public void logReading(Double reading) {
            if (reading == null) {
                System.out.println("Cannot log null reading.");
                return;
            }
            sensorData.add(reading); // stored directly as Double
            System.out.println("Logged wrapper reading: " + reading);
        }

        // Method to display all readings (auto-unboxing happens when needed)
        public void displayReadings() {
            System.out.println("\nAll Sensor Readings:");
            for (Double data : sensorData) {
                double value = data; // auto-unboxing: Double → double
                System.out.println(value);
            }
        }

        public static void main(String[] args) {
            SensorDataLogger logger = new SensorDataLogger();

            // Logging primitive readings
            logger.logReading(23.5);
            logger.logReading(27.8);

            // Logging wrapper readings
            logger.logReading(Double.valueOf(30.2));
            logger.logReading(null); // will be handled safely

            // Display all readings
            logger.displayReadings();
        }
    }

}
