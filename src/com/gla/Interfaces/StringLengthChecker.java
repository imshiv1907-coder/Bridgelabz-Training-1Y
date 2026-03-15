
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> length = str -> str.length();
        String message = "Hello Java";
        System.out.println("Length: " + length.apply(message));
    }
}
