
class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void calculateGrade() {
        if (marks >= 80)
            System.out.println("Grade: A");
        else if (marks >= 60)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}

class EngineeringStudent extends Student {
    String branch;

    EngineeringStudent(int rollNo, String name, int marks, String branch) {
        super(rollNo, name, marks);
        this.branch = branch;
    }

    void calculateGrade() {
        System.out.println("Student: " + name + " - " + branch);
        super.calculateGrade();
    }
}

public class University {
    public static void main(String[] args) {
        Student s = new EngineeringStudent(1, "Sarthak", 85, "CSE");
        s.calculateGrade();
    }
}
