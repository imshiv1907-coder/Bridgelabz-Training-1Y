import java.util.*;

public class Inventory {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Pen", 10);
        map.put("Book", 5);

        map.put("Pen", map.get("Pen") - 10);
        map.put("Book", map.get("Book") + 10);

        if (!map.containsKey("Pencil"))
            System.out.println("Not stocked");

        for (String p : map.keySet()) {
            if (map.get(p) <= 0) {
                System.out.println(p + " out of stock");
            }
        }
    }
}
