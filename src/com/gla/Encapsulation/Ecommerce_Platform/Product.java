
abstract class Product{

    private int productId;
    private String name;
    private double price;

    public Product(int id,String name,double price){
        this.productId=id;
        this.name=name;
        this.price=price;
    }

    public double getPrice(){
        return price;
    }

    public abstract double calculateDiscount();
}
