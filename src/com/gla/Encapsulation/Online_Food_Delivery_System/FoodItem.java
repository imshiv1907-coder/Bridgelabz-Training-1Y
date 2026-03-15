
abstract class FoodItem{

    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name,double price,int quantity){
        this.itemName=name;
        this.price=price;
        this.quantity=quantity;
    }

    public double getPrice(){ return price; }
    public int getQuantity(){ return quantity; }

    public abstract double calculateTotalPrice();
}
