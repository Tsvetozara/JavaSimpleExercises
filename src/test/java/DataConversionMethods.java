public class DataConversionMethods {

    public static void main(String[] args) {

        //String to int

        String s = "welcome"; //cannot convert to int

        String s1 = "10";  // can convert to int

        String s2 = "20";

        System.out.println(s1 + s2);  //1020 - concatenation

        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));  // 30

        //String to double

        String s3 = "10.5";
        String s4 = "20.0";

        System.out.println(Double.parseDouble(s3) + Double.parseDouble(s4));

        //String to boolean

        String s5 = "true";

        String s6 = "welcome";

        System.out.println(Boolean.parseBoolean(s5));

        System.out.println(Boolean.parseBoolean(s6)); //returns false - anything different than true will return false

        // String to char is not possible

        int a = 10;
        double d = 10.5;
        char c = 'A';
        boolean bool = true;

        // String.valueOf() - method that converts all primitive data types into String format

        String s7 = String.valueOf(a);
        System.out.println(s7);

        String s8 = String.valueOf(d);
        System.out.println(s8);

        String s9 = String.valueOf(c);
        System.out.println(s9);

        String s10 = String.valueOf(bool);
        System.out.println(s10);

    }
}
