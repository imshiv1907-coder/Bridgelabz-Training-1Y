
class RideCar extends RideVehicle implements GPS{

    public RideCar(String id,String driver,double rate){
        super(id,driver,rate);
    }

    public double calculateFare(double distance){
        return distance*getRatePerKm();
    }

    public void getCurrentLocation(){
        System.out.println("Fetching Location");
    }

    public void updateLocation(String location){
        System.out.println("Location Updated:"+location);
    }
}
