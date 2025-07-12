package OverridingExample;

public class MainClass {

    public static void main(String[] args) {

        ICICI ic = new ICICI();
        System.out.println(ic.roi());

        SBI sb = new SBI();
        System.out.println(sb.roi());

    }
}
