import java.util.*;

public class Bank {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("101", 5000.0);

        map.put("101", map.get("101") + 1000);

        if (map.get("101") >= 2000)
            map.put("101", map.get("101") - 2000);

        System.out.println(map);
    }
}
