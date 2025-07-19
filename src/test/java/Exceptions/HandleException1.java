package Exceptions;

import java.util.Scanner;

public class HandleException1 {
    public static void main(String[] args) {

        System.out.println("Program has started....");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        try {
            System.out.println(100 / num);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Invalid data");
        }
        //if the user enters invalid number such as zero - the exception will be caught

        System.out.println("Program is completed.....");

        System.out.println("Program is exited....");
    }

}
