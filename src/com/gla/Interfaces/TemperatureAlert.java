
import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> alert = temp -> temp > 40;
        double temperature = 45.5;

        if(alert.test(temperature))
            System.out.println("Temperature Alert!");
        else
            System.out.println("Temperature Normal");
    }
}
