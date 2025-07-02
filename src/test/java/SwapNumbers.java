import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number A: ");
        double numberA = sc.nextDouble();

        System.out.println("Enter number B: ");
        double numberB = sc.nextDouble();
        double numberC;

        numberC = numberA;
        numberA = numberB;
        System.out.println("Number A is now = " + numberA);

        numberB = numberC;
        System.out.println("Number B is now = " + numberB);
    }
}
