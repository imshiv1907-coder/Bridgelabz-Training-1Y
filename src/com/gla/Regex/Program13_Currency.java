import java.util.regex.*;
public class Program13_Currency {
    public static void main(String[] args) {
        String text = "$45.99 and 10.50";
        Matcher m = Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(text);
        while (m.find()) System.out.println(m.group());
    }
}