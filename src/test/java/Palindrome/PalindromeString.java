package Palindrome;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String str = sc.next();
        String org_str = str;

        String rev = "";

        for(int i= str.length()-1; i>=0; i--)
        {
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);

        if(org_str.equals(rev))
        {
            System.out.println("String is a palindrome string!");
        } else
        {
            System.out.println("String is not a palindrome string!");
        }
    }
}
