class Box<T> {
    private T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);

        Box<String> strBox = new Box<>();
        strBox.set("Hello");

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(5.5);

        System.out.println(intBox.get());
        System.out.println(strBox.get());
        System.out.println(doubleBox.get());
    }
}