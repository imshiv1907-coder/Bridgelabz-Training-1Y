import java.util.*;

abstract class JobRole {}
class SoftwareEngineer extends JobRole {}

class Resume<T extends JobRole> {
    T role;
    Resume(T r) { role = r; }

    static void process(List<? extends JobRole> list) {
        System.out.println(list);
    }
}