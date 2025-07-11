package SwapNumbers;

import java.util.Scanner;

public class SwapOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number A: ");
        double numberA = sc.nextDouble();

        System.out.println("Enter number B: ");
        double numberB = sc.nextDouble();

        if (numberA > numberB) {
            System.out.println(numberA);
            System.out.println(numberB);
        }

        if (numberA < numberB) {
            System.out.println(numberB);
            System.out.println(numberA);
        }
    }
}
