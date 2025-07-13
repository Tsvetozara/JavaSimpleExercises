package NumbersExercises;

public class PrintEvenNumbers {

    public static void main(String[] args) {

        int i=1;

       /* while(i<=10) {
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
        */

        while(i<=10){
            if(i%2==0){
                System.out.println(i + " is even number");
            }else {
                System.out.println(i + " is odd number");
            }
            i++;
        }
    }
}
