
public class Main{

    public static void main(String[] args){

        Employee e1 = new FullTimeEmployee(1,"Rahul",50000);
        Employee e2 = new PartTimeEmployee(2,"Aman",200,40);

        Employee[] employees = {e1,e2};

        for(Employee e:employees){
            e.displayDetails();
            System.out.println("Salary: "+e.calculateSalary());
        }
    }
}
