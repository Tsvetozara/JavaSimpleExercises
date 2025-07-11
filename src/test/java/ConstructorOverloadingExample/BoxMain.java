package ConstructorOverloadingExample;

public class BoxMain {

    public static void main(String[] args) {

        //BoxConstructorOverloadingExample box = new BoxConstructorOverloadingExample();

        //BoxConstructorOverloadingExample box = new BoxConstructorOverloadingExample(10.5, 15.5, 5.5);

        Box box = new Box(10.5);

        System.out.println(box.volume());

    }
}
