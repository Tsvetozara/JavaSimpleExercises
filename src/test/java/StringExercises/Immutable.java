package StringExercises;

public class Immutable {
    public static void main(String[] args) {

        String s = new String("welcome");

        System.out.println(s);

        String concatstring = s.concat("to java");

        System.out.println(s); //welcome ---> immutable - we cannot change

        System.out.println(concatstring);
    }
}
