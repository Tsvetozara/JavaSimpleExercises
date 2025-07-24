package Interface;

//Multiple inheritance

public class ClassOne extends ClassTwo implements InterfaceOne, InterfaceTwo {

    public static void main(String[] args) {

        ClassOne obj = new ClassOne();
        obj.m1();
        obj.m2();

        obj.m3();  // can access method in extended class

    }

    @Override
    public void m1() {
        System.out.println(x);
    }

    @Override
    public void m2() {
        System.out.println(y);
    }
}
