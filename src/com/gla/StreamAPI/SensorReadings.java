import java.util.*;

public class SensorReadings {
    public static void main(String[] args) {
        List<Integer> readings = Arrays.asList(30, 70, 90, 50);

        readings.stream()
            .filter(r -> r > 60)
            .forEach(r -> System.out.println("High: " + r));
    }
}
