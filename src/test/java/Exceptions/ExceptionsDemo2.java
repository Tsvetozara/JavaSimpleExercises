package Exceptions;

import java.util.Scanner;

public class ExceptionsDemo2 {
    public static void main(String[] args) {

        System.out.println("Program has started....");

        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter the position (0-4):");
        int pos = sc.nextInt();

        System.out.println("Enter a value: ");
        int value = sc.nextInt();

        a[pos] = value;

        System.out.println(a[pos]);

        //If the user enters a value which is not in range of 0 to 4, he will get "Index out of bound" exception

        System.out.println("Program is completed.....");

        System.out.println("Program is exited....");
    }

}
