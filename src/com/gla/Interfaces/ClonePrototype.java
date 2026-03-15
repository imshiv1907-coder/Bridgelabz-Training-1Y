
class Product implements Cloneable {
    int id;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
