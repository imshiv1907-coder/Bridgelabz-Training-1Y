
abstract class RideVehicle{

    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(String id,String driver,double rate){
        this.vehicleId=id;
        this.driverName=driver;
        this.ratePerKm=rate;
    }

    public double getRatePerKm(){
        return ratePerKm;
    }

    public abstract double calculateFare(double distance);
}
