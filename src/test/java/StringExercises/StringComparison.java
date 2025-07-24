package StringExercises;

public class StringComparison {
    public static void main(String[] args) {

        //Case 1

        String s1 = "welcome";
        String s2 = "welcome";

        System.out.println(s1 == s2); //true
        System.out.println(s1.equals(s2)); //true

        //Case 2

        String str1 = new String("welcome");
        String str2 = new String("welcome");

        System.out.println(str1 == str2); // false - // == is used to compare objects
        System.out.println(str1.equals(str2)); //true // equals is used to compare the value of objects

        //Case 3

        String string1 = "abc";
        String string2 = new String("abc");

        System.out.println(string1 == string2); //false
        System.out.println(string1.equals(string2)); //true

        //Case 4

        String b1 = "abc";
        String b2 = new String("abc");
        String b3 = b2;

        System.out.println(b1 == b2); //false
        System.out.println(b1.equals(b2)); //true
        System.out.println(b2 == b3); //true because objects are the same
        System.out.println(b2.equals(b3));

    }
}
