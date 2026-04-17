import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<>();
        Map<String, Integer> m2 = new HashMap<>();

        m1.put("A", 1);
        m1.put("B", 2);

        m2.put("B", 3);
        m2.put("C", 4);

        for (String key : m2.keySet()) {
            if (m1.containsKey(key)) {
                m1.put(key, m1.get(key) + m2.get(key));
            } else {
                m1.put(key, m2.get(key));
            }
        }

        System.out.println(m1);
    }
}
