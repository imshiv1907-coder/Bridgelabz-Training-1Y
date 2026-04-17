import java.util.*;

public class Course {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("CS101", 50);
        map.put("CS102", 3);

        map.put("CS101", map.get("CS101") + 1);
        map.put("CS102", map.get("CS102") - 1);

        for (String k : map.keySet()) {
            if (map.get(k) >= 50)
                System.out.println(k + " full");
            if (map.get(k) < 5)
                System.out.println(k + " low");
        }
    }
}
