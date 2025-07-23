package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        //Hashset doesn't allow duplicates

        //Declaration

        HashSet myset = new HashSet();

        // Set myset = new HashSet<>();
        // HashSet myset = new HashSet<String>();

        // Adding elements into hashset

        myset.add(100);
        myset.add(10.5);
        myset.add("welcome");
        myset.add(true);
        myset.add('A');
        myset.add(100);
        myset.add(100);

        //Printing hashset
        System.out.println(myset); //duplicates are automatically eliminated

        //Size of hashset
        System.out.println("Size of hashset: " + myset.size());

        //Removing element

        myset.remove(10.5); //10.5 is a value (not an index)

        System.out.println("After removing: " + myset);

        //Inserting element - Not possible

        //Access specific element - Not possible, not directly, but there is a work around

        //Convert HashSet --> ArrayList
        ArrayList al = new ArrayList(myset);
        System.out.println(al);
        System.out.println(al.get(2));

        //Read all the elements using for..each
        for(Object x:myset)
        {
            System.out.println(x);
        }

        //Using iterator

        Iterator it = myset.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //clearing all elements in hashset

        myset.clear();
        System.out.println(myset.isEmpty());
    }
}

