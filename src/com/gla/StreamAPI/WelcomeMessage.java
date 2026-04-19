import java.util.*;

public class WelcomeMessage {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Amit", "Neha", "Ravi");

        attendees.forEach(a -> System.out.println("Welcome " + a));
    }
}
