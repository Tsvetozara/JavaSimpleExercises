package Box;

public class BoxMain {

    public static void main(String[] args) {

        //BoxConstructorOverloadingExample box = new BoxConstructorOverloadingExample();

        //BoxConstructorOverloadingExample box = new BoxConstructorOverloadingExample(10.5, 15.5, 5.5);

        BoxConstructorOverloadingExample box = new BoxConstructorOverloadingExample(10.5);

        System.out.println(box.volume());

    }
}
