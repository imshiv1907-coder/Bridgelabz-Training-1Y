
class Car extends Vehicle implements Insurable{

    public Car(String number,double rate){
        super(number,"Car",rate);
    }

    public double calculateRentalCost(int days){
        return days*getRentalRate();
    }

    public double calculateInsurance(){
        return 500;
    }

    public void getInsuranceDetails(){
        System.out.println("Car Insurance: 500");
    }
}
