abstract class Employee {
    /**
     * Calculate salary
     */
    abstract void calculateSalary();
}
class Developer extends Employee {
    void calculateSalary() {
        System.out.println("Salary calculated");
    }
    public static void main(String[] args) {
        new Developer().calculateSalary();
    }
}