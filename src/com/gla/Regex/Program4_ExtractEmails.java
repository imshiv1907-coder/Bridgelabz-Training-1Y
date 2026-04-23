import java.util.regex.*;
public class Program4_ExtractEmails {
    public static void main(String[] args) {
        String text = "support@example.com info@company.org";
        Matcher m = Pattern.compile("[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}").matcher(text);
        while (m.find()) System.out.println(m.group());
    }
}