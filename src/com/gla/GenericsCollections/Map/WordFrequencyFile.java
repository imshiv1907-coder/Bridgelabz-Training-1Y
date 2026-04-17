import java.io.*;
import java.util.*;

public class WordFrequencyFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        Map<String, Integer> map = new HashMap<>();

        String line;
        while ((line = br.readLine()) != null) {
            line = line.toLowerCase().replaceAll("[^a-z ]", "");
            String[] words = line.split("\\s+");

            for (String w : words) {
                if (w.length() == 0) continue;
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
        }

        br.close();
        System.out.println(map);
    }
}
