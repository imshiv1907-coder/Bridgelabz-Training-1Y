import java.util.List;

public class EmployeeNames {
    public static void main(String[] args) {
        List<String> names = List.of("Sarthak", "Riya", "Aman");

        names.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}