package NumbersExercises;

public class CountSumOfDigits {

    public static void main(String[] args) {

        int num = 1234;
        int sum  = 0;

        while(num>0)
        {
            sum = sum + num%10; //4   4+3  7+2 9+1
            num = num/10;      //123  12   1   0
        }

        System.out.println("Sum of digits in number is " + sum);
    }
}
