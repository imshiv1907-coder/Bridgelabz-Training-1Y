
class InPatient extends Patient implements MedicalRecord{

    public InPatient(int id,String name,int age){
        super(id,name,age);
    }

    public double calculateBill(){
        return 5000;
    }

    public void addRecord(String record){
        System.out.println("Record Added:"+record);
    }

    public void viewRecords(){
        System.out.println("Viewing Records");
    }
}
