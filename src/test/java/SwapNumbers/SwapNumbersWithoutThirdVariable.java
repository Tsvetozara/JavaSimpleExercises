package SwapNumbers;

public class SwapNumbersWithoutThirdVariable {

    public static void main(String[] args) {

        // Used only if variables are not equal to 0

        int a = 10;
        int b = 20;

        System.out.println("Before swapping values are: " + a + " and " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping values are: " + a + " and " + b);


    }
}
