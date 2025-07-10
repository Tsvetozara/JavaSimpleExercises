package Box;

public class BoxConstructorOverloadingExample {

    double width, height, depth;

    BoxConstructorOverloadingExample()
    {
        width = 0;
        height = 0;
        depth = 0;

        //width=height=depth=0;
    }

    BoxConstructorOverloadingExample(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    BoxConstructorOverloadingExample(double len)
    {
        width=depth=height=len;
    }

    double volume() {
        return (width * height * depth);
    }
}
