package ExampleForTypesOfMethods;

public class Greetings {

    // 1) Method with No params and No return value
    void m1() {
        System.out.println("Hello....");
    }

    // 2) Method with No params and A return value
    String m2() {
        return ("Hello how are you?");
    }

    // 3) Method takes params and has No return value

    void m3(String name) {
        System.out.println("Hello " + name);
    }

    // 4) Method takes params and has A returns value

    String m4(String name) {
        return ("Hello " + name);
    }
}
