package AdderOverloadingExample;

public class Adder {

    int a=10, b=20;

    void sum()  // no params
    {
        System.out.println(a+b);
    }

    void sum(int x, int y) // different number of parameters
    {
        System.out.println(x+y);
    }

    void sum(int x, double y)  //same number of parameters but different types
    {
        System.out.println(x+y);
    }

    void sum(double x, int y) //same number of parameters but different positions
    {
        System.out.println(x+y);
    }

    void sum(int a, int b, int c){ // different number of parameters
        System.out.println(a+b+c);
    }
}
