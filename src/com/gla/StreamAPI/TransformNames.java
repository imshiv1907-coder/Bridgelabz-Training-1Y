import java.util.*;

public class TransformNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rahul", "amit", "neha");

        names.stream()
            .map(n -> n.toUpperCase())
            .sorted()
            .forEach(System.out::println);
    }
}
