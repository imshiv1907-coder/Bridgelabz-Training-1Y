class Employee
{
    String name;
    int id;
    double salary;

    Employee(String n,int i,double s)
    {
        name = n;
        id = i;
        salary = s;
    }

    void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee
{
    int teamSize;

    Manager(String n,int i,double s,int t)
    {
        super(n,i,s);
        teamSize = t;
    }

    void displayDetails()
    {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee
{
    String programmingLanguage;

    Developer(String n,int i,double s,String p)
    {
        super(n,i,s);
        programmingLanguage = p;
    }

    void displayDetails()
    {
        super.displayDetails();
        System.out.println("Language: " + programmingLanguage);
    }
}

class Intern extends Employee
{
    String college;

    Intern(String n,int i,double s,String c)
    {
        super(n,i,s);
        college = c;
    }

    void displayDetails()
    {
        super.displayDetails();
        System.out.println("College: " + college);
    }
}

public class EmployeeTest
{
    public static void main(String args[])
    {
        Manager m = new Manager("Rahul",101,60000,5);
        Developer d = new Developer("Amit",102,50000,"Java");
        Intern i = new Intern("Riya",103,10000,"ABC College");

        m.displayDetails();
        System.out.println();

        d.displayDetails();
        System.out.println();

        i.displayDetails();
    }
}