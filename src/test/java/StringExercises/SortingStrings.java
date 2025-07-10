package StringExercises;

import java.util.Arrays;

public class SortingStrings {

    public static void main(String[] args) {

        String s[]= {"Scott", "Marry", "John", "David"};

        //char s[]= {'D', 'C', 'A', 'B'};

        System.out.println("Before sorting" + Arrays.toString(s));

        Arrays.sort(s);

        System.out.println("After sorting" + Arrays.toString(s));
    }
}
