import java.util.*;

class Employee {
    String name;
    String dept;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
}

public class GroupEmployees {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alice", "HR"));
        list.add(new Employee("Bob", "IT"));
        list.add(new Employee("Carol", "HR"));

        Map<String, List<String>> map = new HashMap<>();

        for (Employee e : list) {
            if (!map.containsKey(e.dept)) {
                map.put(e.dept, new ArrayList<>());
            }
            map.get(e.dept).add(e.name);
        }

        System.out.println(map);
    }
}
