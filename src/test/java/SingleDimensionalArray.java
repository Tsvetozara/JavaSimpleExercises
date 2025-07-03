public class SingleDimensionalArray {

    public static void main(String[] args) {

        //declaring array

        //Approach 1

    /* int a[] = new int[5];

    a[0]=100;
    a[1]=200;
    a[2]=300;
    a[3]=400;
    a[5]=500;
     */

        //Approach 2

        int a[] = {100, 200, 300, 400, 500};

        //find length of an array

        System.out.println("Length of an array:" + a.length);

       // System.out.println(a[4]);

        //reading all the values from array

        for(int i=0; i<=a.length-1; i++){
            System.out.println(a[i]);
        }
    }

}
