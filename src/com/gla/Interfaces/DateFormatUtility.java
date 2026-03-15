
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {
    static String formatDate(LocalDate date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(format);
    }
}

public class DateTest {
    public static void main(String[] args) {
        System.out.println(DateUtils.formatDate(LocalDate.now()));
    }
}
