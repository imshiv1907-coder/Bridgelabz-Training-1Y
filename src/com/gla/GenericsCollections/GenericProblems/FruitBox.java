class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}

class FruitBox<T extends Fruit> {
    T fruit;

    void add(T fruit) {
        this.fruit = fruit;
    }

    void show() {
        System.out.println(fruit.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        FruitBox<Apple> box = new FruitBox<>();
        box.add(new Apple());
        box.show();
    }
}