package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        //declaration

        //HashMap hm = new HashMap();
        //Map hm = new Hashmap();

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        //Adding pairs
        //no duplicates are allowed

        hm.put(101, "John");
        hm.put(102, "Tsveti");
        hm.put(103, "Boris");
        hm.put(104, "Mihi");
        hm.put(105, "David");

        System.out.println(hm);

        System.out.println("Size of hashmap: " + hm.size());

        //Remove pairs

        hm.remove(105); // 105 is key of the pair

        System.out.println("After removing pair: " + hm);

        //Access value of the key

        System.out.println(hm.get(101)); //101 is a key

        //Get all the keys or values from the hashmap

        System.out.println(hm.keySet()); //keys
        System.out.println(hm.values()); //values
        System.out.println(hm.entrySet()); // keys and values

        //Reading data from hashmap

        //Using for..each

        for(int k: hm.keySet())
        {
            System.out.println(k+ "   "+hm.get(k));
        }


    }
}
