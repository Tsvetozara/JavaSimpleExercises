package StringExercises;

import java.util.Arrays;

public class StringOperations {

    public static void main(String[] args) {

        //length() - returns length of a string (number of characters)

        String s = new String("welcome");

        System.out.println(s);

        int l = s.length();

        System.out.println(l);

        System.out.println("welcome".length());

        //concat() - joining strings

        String s1 = "Welcome ";
        String s2 = "to java ";
        String s3 = "automation";

        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1 + s2 + s3);
        System.out.println(s1.concat(s2).concat(s3));
        System.out.println(s1.concat(s2+s3));

        //trim() - remove spaces right and left

        s="   welcome   ";

        System.out.println(s);

        System.out.println("Before trimming: " + s.length());
        System.out.println(s.trim());
        System.out.println("After trimming: " + s.trim().length());

        //charAt() - returns a character from a string based on index
        //index start from 0

        s= "welcome";

        System.out.println(s.charAt(3));
        System.out.println(s.charAt(0));

        //contains - returns true or false

        System.out.println(s.contains("wel")); //true
        System.out.println(s.contains("come")); //true
        System.out.println(s.contains("Wel")); //false

        //equals(), equalsIgnoreCase() - compare strings

        s1= "welcome";
        s2= "welcome";

        System.out.println(s1==s2); //true
        System.out.println(s1.equals(s2));  //true
        System.out.println(s1.equals("Welcome")); //false

        //replace() - replace single/multiple(sequence) of characters in a string

        s= "welcome to selenium java selenium python selenium c#";
        System.out.println(s.replace('e', 'X'));

        System.out.println(s.replace("selenium", "playwrigth"));

        //substring() - extract substring from the main string
        //starting index - 0
        //ending index - 1

        s= "Selenium";
        System.out.println(s.substring(1,5)); //elen
        System.out.println(s.substring(0,3));

        //toUpperCase()  toLowerCase()

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //split() - split the string into multiple parts based on delimiter

        s= "abc@gmail.com";

        String a[]=s.split("@");
        System.out.println(a[0]);
        System.out.println(a[1]);

        System.out.println(Arrays.toString(a));

        //ex1

        String amount= "$15,20,55";
        System.out.println(amount.replace("$", "").replace(",", ""));

        //ex2

        s= "abc,123@xyz";

        String arr1[] = s.split(",");

        System.out.println(Arrays.toString(arr1));

        String arr2[] = arr1[1].split("@");

        System.out.println(Arrays.toString(arr2));

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        //ex3

        s= "abc 123";
        String ar[]= s.split(" ");
        System.out.println(Arrays.toString(ar));

        //% * $ ( ) ^ - you cannot use as a delimiter

        //ex4

        String name = "John Kenedy";

        System.out.println(name.contains("john")); //false

        System.out.println(name.replace('J', 'j').contains("john")); //true
        System.out.println(name.toLowerCase().contains("john"));

        }
}
