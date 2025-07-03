public class TwoDimensionalArray {
    public static void main(String[] args) {
        //declaring array

        //Approach 1
       /* int a[][]= new int[3][2];

        a[0][0] = 100;
        a[0][1] = 200;

        a[1][0] = 300;
        a[1][1] = 4;

        a[2][0] = 500;
        a[2][1] = 600;
        */

        //Approach 2

        int a[][]= {{100,200},
                    {300,400},
                    {500,600}
           };

        //Find size of an array

        System.out.println("lenght of rows: " + a.length);
        System.out.println("lenght of columns: " + a[0].length);

        //System.out.println(a[2][1]);

        //normal for

        for(int r=0; r<=a.length-1; r++){
            for(int c=0; c<=a[r].length-1;c++){
                System.out.println(a[r][c]);
            }
        }

    }
}
