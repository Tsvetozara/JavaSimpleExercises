package Interface;

public interface Shape {

    int length = 10;  //final and static
    int width = 20;   //final and static

    void circle();  // abstract method

    default void square()  //default method
    {
        System.out.println("This is a square.....");
    }

    static void rectangle() {
        System.out.println("This is rectangle - static method");
    }
}
