package Super;

public class Dog extends Animal {

    String color = "black";

    void displayColor()
    {
        System.out.println(super.color);
        System.out.println(color);
    }

    void eat()
    {
        System.out.println("Eating bread.....");
        super.eat();
    }
}
