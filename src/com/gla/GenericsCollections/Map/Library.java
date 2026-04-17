import java.util.*;

public class Library {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("101", "Java");
        map.put("102", "DSA");

        if (map.containsKey("101"))
            System.out.println(map.get("101"));

        map.remove("102");

        for (String k : map.keySet()) {
            System.out.println(k + " " + map.get(k));
        }
    }
}
