package StringExercises;

public class ReverseStringUsingStringConcatenation {

    public static void main(String[] args) {

        String str = "ABCD";
        String rev = "";

        int len = str.length();   //4

        for (int i = len - 1; i >= 0; i--)      //3 2 1 0
        {
            rev = rev + str.charAt(i); // D C B A
        }

        System.out.println(rev);
    }
}
