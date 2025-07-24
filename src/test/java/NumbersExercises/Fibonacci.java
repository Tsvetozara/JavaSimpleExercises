package NumbersExercises;

public class Fibonacci {

    //sum of 2 preceding numbers

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        for (int i = 2; i < 10; i++) {
            sum = n1 + n2; //1
            System.out.println(sum);
            n1 = n2;
            n2 = sum;
        }
    }
}
