import java.util.Scanner;

public class OrderNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number A: ");
        double numberA = sc.nextDouble();

        System.out.println("Enter number B: ");
        double numberB = sc.nextDouble();

        System.out.println("Enter number C: ");
        double numberC = sc.nextDouble();

        if (numberA >= numberB && numberB >= numberC && numberA >= numberC) {
            System.out.println(numberA);
            System.out.println(numberB);
            System.out.println(numberC);
        }

        if (numberA >= numberC && numberC >= numberB && numberA >= numberB) {
            System.out.println(numberA);
            System.out.println(numberC);
            System.out.println(numberB);
        }

        if (numberB >= numberA && numberA >= numberC && numberB >= numberC) {
            System.out.println(numberB);
            System.out.println(numberA);
            System.out.println(numberC);
        }

        if (numberB >= numberC && numberC >= numberA && numberB >= numberC) {
            System.out.println(numberB);
            System.out.println(numberC);
            System.out.println(numberA);
        }

        if (numberC >= numberA && numberA >= numberB && numberC >= numberB) {
            System.out.println(numberC);
            System.out.println(numberA);
            System.out.println(numberB);
        }

        if (numberC >= numberB && numberB >= numberA && numberC >= numberA) {
            System.out.println(numberC);
            System.out.println(numberB);
            System.out.println(numberA);
        }

    }
}
