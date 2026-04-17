import java.util.*;

public class Attendance {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        String[] students = {"A", "B", "C"};

        for (String s : students) {
            map.put(s, 0);
        }

        String[][] days = {
                {"A", "B"}, {"A"}, {"B", "C"}
        };

        for (String[] day : days) {
            for (String s : day) {
                map.put(s, map.get(s) + 1);
            }
        }

        for (String s : map.keySet()) {
            if (map.get(s) < 2) {
                System.out.println(s + " low attendance");
            }
        }
    }
}
