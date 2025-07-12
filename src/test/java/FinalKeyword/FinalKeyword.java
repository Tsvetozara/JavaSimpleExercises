package FinalKeyword;

public class FinalKeyword {

    public static void main(String[] args) {

        Test t = new Test();

        t.x=200;  // we are able to change the value of x

       // t.y = 300; // we are not able to assign value to y because it is final

        System.out.println(t.x);

    }
}
