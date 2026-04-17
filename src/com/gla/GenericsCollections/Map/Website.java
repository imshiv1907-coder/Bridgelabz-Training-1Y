import java.util.*;

public class Website {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        String[] pages = {"home", "about", "home"};

        for (String p : pages) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        String maxPage = null;
        int max = 0;

        for (String k : map.keySet()) {
            if (map.get(k) > max) {
                max = map.get(k);
                maxPage = k;
            }
        }

        System.out.println(map);
        System.out.println("Most visited: " + maxPage);
    }
}
