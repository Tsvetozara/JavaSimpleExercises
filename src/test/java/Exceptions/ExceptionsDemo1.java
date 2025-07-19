package Exceptions;

import java.util.Scanner;

public class ExceptionsDemo1 {
    public static void main(String[] args) {

        System.out.println("Program has started....");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(100/num);

        //if the user enters invalid number such as zero - he will get an exception / Arithmetic exception

        System.out.println("Program is completed.....");

        System.out.println("Program is exited....");
    }

}
