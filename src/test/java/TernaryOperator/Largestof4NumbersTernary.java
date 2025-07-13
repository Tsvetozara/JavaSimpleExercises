package TernaryOperator;

import java.util.Scanner;

public class Largestof4NumbersTernary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int a = sc.nextInt();

        System.out.println("Enter your second number: ");
        int b = sc.nextInt();

        System.out.println("Enter your third number: ");
        int c = sc.nextInt();

        System.out.println("Enter your fourth number: ");
        int d = sc.nextInt();


        int largest1 = a>b?a:b; // largest of a and b

        int largest2 = c>largest1?c:largest1; //largest of c and largest1

        int largest3 = d>largest2?d:largest2; //largest of d and largest2

        System.out.println(largest3 + " is the largest number");
    }
}
