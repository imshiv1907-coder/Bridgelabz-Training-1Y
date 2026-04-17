import java.util.*;

public class Salary {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("A", 1000.0);
        map.put("B", 2000.0);

        map.put("A", map.get("A") * 1.1);

        double sum = 0;
        for (double v : map.values()) {
            sum += v;
        }

        System.out.println("Avg: " + sum / map.size());

        double max = Collections.max(map.values());

        for (String k : map.keySet()) {
            if (map.get(k) == max)
                System.out.println("Top: " + k);
        }
    }
}
