import java.util.*;

class Doctor {
    String name;
    String specialty;
    boolean weekendAvailable;

    Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }
}

public class DoctorAvailability {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Amit", "Cardiology", true),
            new Doctor("Ravi", "Dermatology", false),
            new Doctor("Neha", "Neurology", true)
        );

        doctors.stream()
            .filter(d -> d.weekendAvailable)
            .sorted((d1, d2) -> d1.specialty.compareTo(d2.specialty))
            .forEach(d -> System.out.println(d.name + " - " + d.specialty));
    }
}
