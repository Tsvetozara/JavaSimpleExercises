package NumbersExercises;

public class Factorial {

    public static void main(String[] args) {

        //A factorial is a function that multiplies a number by every number below it
        // For example 5! = 5*4*3*2*1 = 120 or 5! = 1*2*3*4*5 = 120

        int num = 5;

        long factorial = 1;

        // in ascending order

        /*
        for(int i=1; i<=num; i++)
        {
            factorial=factorial * i;
        }
        System.out.println("Factorial of a number is " + factorial);

         */

        // in descending order

        for(int i = num; i>=1; i--)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial of a number is " + factorial);
    }
}
