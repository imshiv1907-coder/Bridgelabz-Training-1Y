import java.util.regex.*;
public class Program12_Languages {
    public static void main(String[] args) {
        String text = "Java Python Go";
        Matcher m = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);
        while (m.find()) System.out.println(m.group());
    }
}