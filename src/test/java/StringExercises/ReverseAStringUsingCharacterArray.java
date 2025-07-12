package StringExercises;

public class ReverseAStringUsingCharacterArray {

    public static void main(String[] args) {

        String str = "welcome";
        String reverse = "";

        char a[] = str.toCharArray();

        for (int i = a.length - 1; i >= 0; i--) {
            reverse = reverse + a[i];
        }
        System.out.println("Reverse string is: " + reverse);
    }
}
