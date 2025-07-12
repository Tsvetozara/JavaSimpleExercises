package OverridingExample;

public class SBI extends Bank {

    @Override
    double roi() {
        return 11.5;
    }
}
