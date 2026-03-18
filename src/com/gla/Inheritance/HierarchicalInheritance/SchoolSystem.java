class Person
{
    String name;
    int age;
}

class Teacher extends Person
{
    String subject;

    void displayRole()
    {
        System.out.println("Role: Teacher");
    }
}

class Student extends Person
{
    String grade;

    void displayRole()
    {
        System.out.println("Role: Student");
    }
}

class Staff extends Person
{
    String department;

    void displayRole()
    {
        System.out.println("Role: Staff Member");
    }
}

public class SchoolSystem
{
    public static void main(String[] args)
    {
        Teacher t = new Teacher();
        Student s = new Student();
        Staff st = new Staff();

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}