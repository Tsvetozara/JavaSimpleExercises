package StringExercises;

public class StringVsStringBufferVsStringBuilder {

    public static void main(String[] args) {

        //String - immutable

        /* String s = "welcome ";
        s.concat("to java");
        System.out.println(s); // immutable, cannot change original value of s
         */

        //StringBuffer - mutable

       /* StringBuffer s = new StringBuffer("welcome");
        s.append("to java");
        System.out.println(s); //welcome to java - mutable, we can change original value
        */

        //StringBuilder - mutable

        StringBuilder s = new StringBuilder("welcome");
        s.append("to java");
        System.out.println(s); // welcome to java - mutable, we can change original value
    }
}
