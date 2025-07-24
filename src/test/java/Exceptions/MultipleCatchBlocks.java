package Exceptions;

public class MultipleCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Program is started......");

        String s = null;

        //Exception is Null Pointer Exception

        try {
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Handle exception....");
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Handle exception....");
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Handle exception....");
            System.out.println(e.getMessage());
        } catch (
                Exception e) //if you don't know what type of exception you will get you can use - Exception e - it will handle all types of exceptions
        {
            System.out.println("Handle exception....");
            System.out.println(e.getMessage());
        }

        System.out.println("Program finished......");
    }
}
