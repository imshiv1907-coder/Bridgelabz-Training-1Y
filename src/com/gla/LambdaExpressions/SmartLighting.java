import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

class LightSystem {
    void turnOn(String mode) {
        System.out.println("Lights ON: " + mode);
    }
}

public class SmartLighting {
    public static void main(String[] args) {
        LightSystem light = new LightSystem();
        Map<String, Consumer<LightSystem>> triggers = new HashMap<>();

        triggers.put("MOTION", l -> l.turnOn("Bright White"));
        triggers.put("NIGHT", l -> l.turnOn("Dim Warm"));
        triggers.put("VOICE", l -> l.turnOn("Custom Mood"));

        triggers.get("MOTION").accept(light);
    }
}