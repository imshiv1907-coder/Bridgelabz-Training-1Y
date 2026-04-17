import java.util.*;

public class CountryCapital {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("India", "Delhi");
        map.put("USA", "Washington");

        String c = "India";

        if (map.containsKey(c))
            System.out.println(map.get(c));
        else
            System.out.println("Unknown");

        System.out.println(map);
    }
}
