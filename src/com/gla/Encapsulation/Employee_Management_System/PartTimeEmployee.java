
class PartTimeEmployee extends Employee implements Department{

    private int hours;
    private String department;

    public PartTimeEmployee(int id,String name,double rate,int hours){
        super(id,name,rate);
        this.hours = hours;
    }

    public double calculateSalary(){
        return getBaseSalary()*hours;
    }

    public void assignDepartment(String dept){
        department = dept;
    }

    public void getDepartmentDetails(){
        System.out.println("Department: " + department);
    }
}
