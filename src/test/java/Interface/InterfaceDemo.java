package Interface;

public class InterfaceDemo implements Shape {

    void triangle()
    {
        System.out.println("This is a triangle.....");
    }

    int x=100, y=200;

    public static void main(String[] args) {

        //Scenario 1

        InterfaceDemo idobj = new InterfaceDemo();
        idobj.circle(); // abstract method
        idobj.square(); //default method

        Shape.rectangle();  // static method is accessed directly from the interface without an object

        idobj.triangle();

        System.out.println(idobj.x + idobj.y);

        //Scenario 2


        Shape sh = new InterfaceDemo();  // the object of the class is stored into the variable of an interface
        //we can not create an object of the interface, but we can create an object reference

        sh.circle();  // abstract method
        sh.square();  //default method

        Shape.rectangle();  // static method is accessed directly from the interface without an object

        System.out.println(Shape.length * Shape.width); //accessing static variables directly

    }
    @Override
    public void circle() {

        System.out.println("This is circle - abstract method");
    }
}
