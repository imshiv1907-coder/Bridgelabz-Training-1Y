
class Person
{
    String name;
    int id;
}

interface Worker
{
    void performDuties();
}

class Chef extends Person implements Worker
{
    public void performDuties()
    {
        System.out.println("Chef cooks food");
    }
}

class Waiter extends Person implements Worker
{
    public void performDuties()
    {
        System.out.println("Waiter serves food");
    }
}

public class RestaurantHybrid
{
    public static void main(String args[])
    {
        Chef c = new Chef();
        Waiter w = new Waiter();

        c.performDuties();
        w.performDuties();
    }
}
