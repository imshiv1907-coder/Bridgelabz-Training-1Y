
class Device implements Runnable {

    String deviceName;
    int time;

    Device(String name, int t) {
        deviceName = name;
        time = t;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(deviceName + " running at " + System.currentTimeMillis());
                Thread.sleep(time);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class SmartHome {
    public static void main(String[] args) {

        Thread temp = new Thread(new Device("Temperature Sensor", 5000));
        Thread cam = new Thread(new Device("Security Camera", 3000));
        Thread light = new Thread(new Device("Light Controller", 4000));
        Thread door = new Thread(new Device("Door Lock Monitor", 6000));

        cam.setPriority(10);
        temp.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);

        temp.start();
        cam.start();
        light.start();
        door.start();
    }
}
