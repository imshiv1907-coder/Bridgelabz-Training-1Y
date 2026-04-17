import java.util.*;

public class Exam {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> map = new HashMap<>();

        Map<String, Integer> math = new HashMap<>();
        math.put("A", 90);
        math.put("B", 80);

        map.put("Math", math);

        for (String subject : map.keySet()) {
            Map<String, Integer> m = map.get(subject);

            int max = 0;
            String topper = "";

            for (String s : m.keySet()) {
                if (m.get(s) > max) {
                    max = m.get(s);
                    topper = s;
                }
            }

            System.out.println(subject + " topper: " + topper);
        }
    }
}
