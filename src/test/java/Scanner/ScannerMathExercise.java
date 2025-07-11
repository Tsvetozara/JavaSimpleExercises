package Scanner;

import java.util.Scanner;

public class ScannerMathExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number A: ");
        double numberA = sc.nextDouble();

        System.out.println("Enter number B: ");
        double numberB = sc.nextDouble();

        double sum = numberA + numberB;
        System.out.println("The sum of Number A + Number B = " + sum);

        double subtraction = numberA - numberB;
        System.out.println("The subtraction of Number A - Number B = " + subtraction);

        double multiplication = numberA * numberB;
        System.out.println("The multiplication of Number A * Number B = " + multiplication);

        double division = numberA / numberB;
        System.out.println("The division of Number A / Number B = " + division);

        double modulo = numberA % numberB;
        System.out.println("The modulo of Number A % Number B = " + modulo);
    }

}
