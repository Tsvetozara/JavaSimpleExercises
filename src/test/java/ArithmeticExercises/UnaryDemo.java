package ArithmeticExercises;

class UnaryDemo {

    public static void main(String[] args){
        // result is now 1
        int result = +1;
        System.out.println(result);
        // result is now 0
        result--;
        System.out.println(result);
        // result is now 1
        result++;
        System.out.println(result);
        // result is now -1
        result = -result;
        System.out.println(result);
        boolean success = true;
        // true
        System.out.println(success);
        // false
        System.out.println(!success);
    }
}
