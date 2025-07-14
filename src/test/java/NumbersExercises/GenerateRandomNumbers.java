package NumbersExercises;

import java.util.Random;

public class GenerateRandomNumbers {

    public static void main(String[] args) {

        Random rand = new Random();

        int rand_int = rand.nextInt(100);  //from 0 to 99 it takes some random number

        System.out.println(rand_int);

        double rand_dbl = rand.nextDouble();  //range between 0.0 and less than 1.0
        System.out.println(rand_dbl);

        //Approach 2 - Using Math class // random() is static method inside Math class

        System.out.println(Math.random()); //returns random decimal numbers

    }
}
