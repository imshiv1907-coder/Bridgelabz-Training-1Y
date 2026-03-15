
class FullTimeEmployee extends Employee implements Department{

    private String department;

    public FullTimeEmployee(int id,String name,double salary){
        super(id,name,salary);
    }

    public double calculateSalary(){
        return getBaseSalary();
    }

    public void assignDepartment(String dept){
        department = dept;
    }

    public void getDepartmentDetails(){
        System.out.println("Department: " + department);
    }
}
