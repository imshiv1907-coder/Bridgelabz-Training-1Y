import java.util.List;

public class PatientIDs {
    public static void main(String[] args) {
        List<String> ids = List.of("P101", "P102", "P103");
        ids.forEach(System.out::println);
    }
}