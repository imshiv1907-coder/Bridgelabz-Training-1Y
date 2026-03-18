class Animal
{
    String name;
    int age;

    Animal(String n,int a)
    {
        name = n;
        age = a;
    }

    void makeSound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal
{
    Dog(String n,int a)
    {
        super(n,a);
    }

    void makeSound()
    {
        System.out.println(name + " says: Bark");
    }
}

class Cat extends Animal
{
    Cat(String n,int a)
    {
        super(n,a);
    }

    void makeSound()
    {
        System.out.println(name + " says: Meow");
    }
}

class Bird extends Animal
{
    Bird(String n,int a)
    {
        super(n,a);
    }

    void makeSound()
    {
        System.out.println(name + " says: Chirp");
    }
}

public class AnimalTest
{
    public static void main(String args[])
    {
        Dog d = new Dog("Tommy",3);
        Cat c = new Cat("Kitty",2);
        Bird b = new Bird("Parrot",1);

        d.makeSound();
        c.makeSound();
        b.makeSound();
    }
}