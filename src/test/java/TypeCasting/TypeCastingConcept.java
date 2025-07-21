package TypeCasting;

public class TypeCastingConcept {

    //Upcasting - converting value from smaller to larger
    //Upcasting is automatic process
    //int to long

    //Downcasting - converting value from larger to smaller
    //Downcasting need to be done manually
    //long to int

    public static void main(String[] args) {

        //Upcasting

        int intvalue = 100;
        long longvalue = intvalue;
        System.out.println(longvalue);

        float floatvalue = 10.5F;
        double doublevalue = floatvalue;
        System.out.println(doublevalue);

        int i = 100;
        double d = i;
        System.out.println(d);

        //Downcasting

        long lvalue = 10000;
        int ivalue = (int) longvalue;

        double dvalue = 125.55;
        float fvalue = (float) dvalue;

        double doo = 10.5;
        int in = (int) doo;
        System.out.println(in);

    }
}
