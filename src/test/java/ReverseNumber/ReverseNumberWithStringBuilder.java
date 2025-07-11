package ReverseNumber;

import java.util.Scanner;

public class ReverseNumberWithStringBuilder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = sc.nextInt();

        StringBuilder sbl = new StringBuilder();

        sbl.append(num);
        StringBuilder rev = sbl.reverse();

        System.out.println("Reverse number is: " + rev);
    }
}
