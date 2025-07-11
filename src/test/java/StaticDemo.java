public class StaticDemo {

    static int a=10;  //static variable
    int b=20;  //non-static variable

    static void m1()  //static method
    {
        System.out.println("This is m1 static method....");
    }

    void m2()   ///non-static method
    {
        System.out.println("This is m2 non static method....");
    }

    //non-static methods can access everything directly

    void m()  //non-static method
    {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {

        //static methods can access static stuff directly without creating objects

        System.out.println(a);
        m1();

        //static methods can access non-static stuff through object

        StaticDemo sd = new StaticDemo();

        System.out.println(sd.b);
        sd.m2();

        sd.m();

    }
}
