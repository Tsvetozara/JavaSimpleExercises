package ArraysExercises;

public class SumOfArray {

    public static void main(String[] args) {

        int a[] = {5, 2, 7, 9, 6};

        int sum = 0;

        for(int i=0; i<=a.length-1; i++ )
        {
            sum = sum + a[i];
        }

        System.out.println("Sum of array elements is " + sum);

        //Approach 2 - Enhanced For loop

        int b[] = {5, 2, 7, 9, 6, 10};

        int sumb = 0;

        for(int value: b )
        {
            sumb = sumb + value;
        }

        System.out.println("Sum of array elements is " + sumb);


    }
}
