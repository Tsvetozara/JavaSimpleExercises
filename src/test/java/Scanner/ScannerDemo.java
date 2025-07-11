package Scanner;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How much money do you have? ");
        double money = sc.nextDouble();

        System.out.println("Is it true or false?");
        boolean isHappy = sc.nextBoolean();

        if (money >= 15 || isHappy) {
            System.out.println("It is funny");
        } else {
            System.out.println("It is not funny");
        }

    }

}
