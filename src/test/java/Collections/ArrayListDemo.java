package Collections;

import ClassExample.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        //Declaration

        ArrayList mylist = new ArrayList(); // stores homegeneous data

        //List mylist = new ArrayList();

        //ArrayList mylist = new ArrayList<Integer>(); //stores only integer types of data

        //ArrayList mylist = new ArrayList<Employee>(); // stores multiple Employee objects

        //Adding data into array list
        mylist.add(100);
        mylist.add(10.5);
        mylist.add("welcome");
        mylist.add('A');
        mylist.add(true);
        mylist.add(null);
        mylist.add(100);

        //Size of arraylist

        System.out.println("Size of an arraylist is " + mylist.size());

        System.out.println("Printing data from an arraylist: " + mylist);

        //Remove element from arraylist

        mylist.remove(5);
        System.out.println("After removing: " + mylist);

        //Insert element in the arraylist

        mylist.add(2, "java");
        System.out.println("After insertion: " + mylist);

        //Modify element in the arraylist (modify/ replace/ change)

        mylist.set(2, "python");
        System.out.println("After replacing: " + mylist);

        //Access specific element from arraylist

        System.out.println(mylist.get(3)); //here 3 is index

        //Reading all the elements from arraylist
        //using normal for loop

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

        //using enhanced for loop (for..each loop)

        for (Object x : mylist) {
            System.out.println(x);
        }

        //Using iterator

        Iterator it = mylist.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        //Checking arraylist is empty or not

        System.out.println("Is array list empty? " + mylist.isEmpty()); //false

        //Removing all the elements from arraylist

        ArrayList mylist2 = new ArrayList();
        mylist2.add(100);
        mylist2.add("welome");

        mylist.removeAll(mylist2);
        System.out.println("After removing muliple elements: " + mylist);

        //Remove all the elements

        mylist.clear();
        System.out.println("Is arraylist empty? " + mylist.isEmpty()); //true
    }
}
