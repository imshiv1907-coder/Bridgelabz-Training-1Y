import java.util.List;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }
}

public class AlertFilter {
    public static void main(String[] args) {
        List<Alert> alerts = List.of(
            new Alert("CRITICAL", "Heart rate abnormal"),
            new Alert("INFO", "Daily report ready"),
            new Alert("WARNING", "Low battery")
        );

        Predicate<Alert> criticalOnly = a -> "CRITICAL".equals(a.type);

        alerts.stream()
            .filter(criticalOnly)
            .forEach(a -> System.out.println(a.message));
    }
}