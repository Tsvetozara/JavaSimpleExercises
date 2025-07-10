package Adder;

public class AdderMain {

    public static void main(String[] args) {

        AdderOverloadingExample addobj = new AdderOverloadingExample();

        addobj.sum();

        addobj.sum(100,200);

        addobj.sum(100, 10.5);

        addobj.sum(10.5, 200);

        addobj.sum(10, 20, 30);
    }
}
