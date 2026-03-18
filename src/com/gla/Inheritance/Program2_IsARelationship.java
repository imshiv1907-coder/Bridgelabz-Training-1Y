class Animal {
    void eat() {
        System.out.println("Eating");
    }
}
class Dog extends Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}