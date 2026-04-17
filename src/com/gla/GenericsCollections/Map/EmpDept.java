import java.util.*;

public class EmpDept {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "IT");
        map.put(2, "HR");

        map.put(1, "Finance");

        for (int id : map.keySet()) {
            if (map.get(id).equals("Finance"))
                System.out.println(id);
        }
    }
}
