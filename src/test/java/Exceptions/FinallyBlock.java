package Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        String s = null;

        try {
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("Catch block handle exception....");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("You entered into finally block.....");
        }

        System.out.println("Program finished......");
    }
}
