class Parent {
    void show(int a) {
        System.out.println("Parent int");
    }
}
class Child extends Parent {
    @Override
    void show(int a) {
        System.out.println("Child int");
    }
    void show(double a) {
        System.out.println("Child double");
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.show(10);
        c.show(10.5);
    }
}