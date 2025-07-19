package Exceptions;

import java.util.Scanner;

public class ExceptionsDemo3 {
    public static void main(String[] args) {

        System.out.println("Program has started....");

        Scanner sc = new Scanner(System.in);

        String s = "12345";

        //If the value of s is not numerical the program will return exception // Number format exception

        int num = Integer.parseInt(s);

        System.out.println(num);

        System.out.println("Program is completed.....");

        System.out.println("Program is exited....");
    }

}
