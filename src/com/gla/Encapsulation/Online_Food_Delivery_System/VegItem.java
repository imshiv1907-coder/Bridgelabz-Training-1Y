
class VegItem extends FoodItem{

    public VegItem(String name,double price,int quantity){
        super(name,price,quantity);
    }

    public double calculateTotalPrice(){
        return getPrice()*getQuantity();
    }
}
