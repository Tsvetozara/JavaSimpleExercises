package ExampleForTypesOfMethods;

public class GreetingsMain {

    public static void main(String[] args) {

        Greetings gr = new Greetings();

        gr.m1();

        String s = gr.m2();
        System.out.println(s);

        // System.out.println(gr.m2());

        gr.m3("John");

        String var = gr.m4("David");
        System.out.println(var);

        System.out.println(gr.m4("Tsveti"));

    }
}
