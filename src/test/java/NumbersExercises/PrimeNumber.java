package NumbersExercises;

public class PrimeNumber {

    public static void main(String[] args) {

        //prime number is divided by 1 and itself and it is greater than 1

        int num = 23;
        int count= 0;

        if(num>1)
        {
            for(int i=1; i<=num; i++)
            {
                if(num%i ==0)
                    count++;
            }

            if(count==2) // Number has only 2 factors that can divide the number - 1 and itself
            {
                System.out.println(num + " is a prime number");
            }
            else
            {
                System.out.println(num + " is not a prime number");
            }
        }
        else {
            System.out.println(num + " is not a prime number");
        }
    }
}
