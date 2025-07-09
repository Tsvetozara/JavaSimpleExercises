public class ReverseAString {
    public static void main(String[] args) {

        //Approach 1 - lenght(), charAt()

        String s = "selenium";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println("Reverse string is: " + rev);


        //Approach 2 - without using string methods

        String str = "welcome";
        String reverse = "";

        char a[] = str.toCharArray();

        for (int i = a.length - 1; i >= 0; i--) {
            reverse = reverse + a[i];
        }
        System.out.println("Reverse string is: " + reverse);

        //Approach 3 - Using StringBuffer Class

        //StringBuffer b = new StringBuffer("welcome");

        //.out.println("Reverse string is: " + b.reverse());

        //Approach 4 - using StringBuilder Class

        StringBuilder b = new StringBuilder("welcome");
        System.out.println("Reverse string is: " + b.reverse());
    }
    }
