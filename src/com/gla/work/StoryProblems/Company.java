
class Employee {
    int empId;
    String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    String generateEmail() {
        return name.toLowerCase() + "@company.com";
    }
}

class Manager extends Employee {
    String department;

    Manager(int empId, String name, String department) {
        super(empId, name);
        this.department = department;
    }

    String generateEmail() {
        return name.toLowerCase() + "." + department.toLowerCase() + "@company.com";
    }
}

public class Company {
    public static void main(String[] args) {
        Employee e = new Manager(1, "Sarthak", "IT");
        System.out.println(e.generateEmail());
    }
}
