public class CountDigitFive {

    public static void countFives(long number) {
        String numStr = Long.toString(Math.abs(number)); // Handle negative numbers
        int count = 0;

        for (char c : numStr.toCharArray()) {
            if (c == '5') {
                count++;
            }
        }

        System.out.println("\"5\" is used " + count + " times");
    }

    public static void main(String[] args) {
        countFives(125458951);  // Output: "5" is used 3 times
    }
}
