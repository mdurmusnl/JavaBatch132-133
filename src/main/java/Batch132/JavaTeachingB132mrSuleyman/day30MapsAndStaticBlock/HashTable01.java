package Batch132.JavaTeachingB132mrSuleyman.day30MapsAndStaticBlock;

import java.util.Hashtable;

public class HashTable01 {
    /*
       1)  HashTable is "Thread-safe" and syncronized  ( mutiple task with HashTable is possible***)  as a result of more functionality hashTable works slower
       2)  HashTable put the entries in random order just like HashMap
       3) HashTable do not accept  "null"  in key and value part
       4) HashTable is slower than HashMap

     */
    public static void main(String[] args) {
        Hashtable<String ,Integer> ht=new Hashtable<>();
        ht.put("USA",400000000);
        ht.put("germany",83000000);
        ht.put("Belgium",12000000);
        ht.put("Albania",30000000);
        ht.put("Turkey",81000000);
    //   ht.put(null,200000);   throws RuntimeException   null can not be used as key or value
        System.out.println(ht);  // {USA=400000000, Albania=30000000, germany=83000000, Turkey=81000000, Belgium=12000000}
    }
    }
