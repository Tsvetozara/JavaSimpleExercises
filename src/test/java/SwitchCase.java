public class SwitchCase {

    public static void main(String[] args) {

        String weekname = "Sunday";

        switch (weekname)
        {
            case "Sunday":
                System.out.println("Number of weekday is 1");
                break;
            case "Monday":
                System.out.println("Number of weekday is 2");
                break;
            case "Tuesday":
                System.out.println("Number of weekday is 3");
                break;
            case "Wednesday":
                System.out.println("Number of weekday is 4");
                break;
            case "Thursday":
                System.out.println("Number of weekday is 5");
                break;
            case "Friday":
                System.out.println("Number of weekday is 6");
                break;
            case "Saturday":
                System.out.println("Number of weekday is 7");
                break;
            default:
                System.out.println("Invalid weekday!");
        }
    }
}
