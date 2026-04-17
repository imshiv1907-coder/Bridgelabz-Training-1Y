import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Map<String, Double> map = new TreeMap<>();

        map.put("Aman", 75.0);
        map.put("Riya", 82.5);

        map.put("Aman", 85.0);
        map.remove("Riya");
        map.put("Sita", 90.0);

        for (String name : map.keySet()) {
            System.out.println(name + " : " + map.get(name));
        }
    }
}
