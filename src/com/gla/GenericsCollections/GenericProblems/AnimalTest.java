import java.util.*;

class Animal {
    void speak() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {}
class Cat extends Animal {}

class TestAnimals {
    static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.speak();
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        printAnimals(dogs);
    }
}