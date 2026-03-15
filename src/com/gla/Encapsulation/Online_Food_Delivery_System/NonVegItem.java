
class NonVegItem extends FoodItem{

    public NonVegItem(String name,double price,int quantity){
        super(name,price,quantity);
    }

    public double calculateTotalPrice(){
        return getPrice()*getQuantity()+50;
    }
}
