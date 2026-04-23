import java.util.regex.*;
public class Program7_Links {
    public static void main(String[] args) {
        String text = "https://google.com";
        Matcher m = Pattern.compile("https?://\\S+").matcher(text);
        while (m.find()) System.out.println(m.group());
    }
}