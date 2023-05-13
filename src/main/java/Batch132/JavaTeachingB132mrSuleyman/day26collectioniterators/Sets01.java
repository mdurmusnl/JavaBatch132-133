package Batch132.JavaTeachingB132mrSuleyman.day26collectioniterators;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    /*
    sets are for storing unique data  (email adress)
    there are 3 sets
    i) HashSet  ==>  hashing technique is a technique to create a unique data(code) university id
                                univercity id ==> 9935045 this is an exmaple and makes every id different then other
                               HashSet does not put the elements in any order,  it stores in random order  and save time  HashSet works fast
                               HashSet allows u to store just one null date   bcs remember Set is for unique datas
    ii)LinkedHasSet  puts the element in insertion order

    iii)TreeSet      puts the elements in natural order (takes too much time)   slowest set
                     ascending order in numbers  ,  alphapetic order in string    natural order covers both
     */
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();  // no repeated element, HashSet do not sort      ***  its fast
        hs.add(12);
        hs.add(3);
        hs.add(14);
        hs.add(5);
        hs.add(32);
        hs.add(1);
        hs.add(45);
        hs.add(19);
        System.out.println(hs);  //[32, 1, 3, 19, 5, 12, 45, 14]
 //if we add another existing element java doesnt give erorr and do not make repetation  java just update with new existing one
        hs.add(14);   //the list will be same
        System.out.println(hs);  //[32, 1, 3, 19, 5, 12, 45, 14]

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();  // puts the elements in insertion order    *** its slower than HashSet
        lhs.add(12);                                        // no repetition
        lhs.add(3);                                        // the  only difference is sorting in insertion  and that makes LinkedHashSet works slower
        lhs.add(14);
        lhs.add(5);
        lhs.add(32);
        lhs.add(1);
        lhs.add(45);
        lhs.add(19);
        System.out.println(lhs); //[12, 3, 14, 5, 32, 1, 45, 19]
           //   lhs.toArray();  we can coonvert A LinkedHashSet int o an Arrays if we want to work faster   remember Arrays wokr fast
           //collections are more advanced and have more features compare to Arrays so we prefer to use Collection but interviewr ask Array to do task with less methods
        LinkedHashSet<Integer> myLhs = new LinkedHashSet<>();
        myLhs.add(12);
        myLhs.add(30);
        myLhs.add(14);
        myLhs.add(50);
        myLhs.add(32);
        System.out.println(myLhs);  // [12, 30, 14, 50, 32]
        System.out.println(lhs);  //[12, 3, 14, 5, 32, 1, 45, 19]
       boolean result1= lhs.retainAll(myLhs); // boolean true.  smt like intersection ,or common elements. the method takes the common elements and update lhs
        System.out.println(lhs);  //[12, 14, 32]   its new lhs after reatinall()
        System.out.println(result1);//true
        /* retainAll me is method in List  so can be used by HashSet, LinkedHashSet, TreeSet
        allproductSet=tv,radio, laptop,watch,fridge
        discountedProductSet= radio,laptop,chair
          allproductSet.retainAll(discountedProductSet)= radio,laptop
          */

        TreeSet<Integer> tS= new TreeSet<>();
        tS.add(13);
        tS.add(2);
        tS.add(24);
        tS.add(19);
        tS.add(5);
        tS.add(-3);
        System.out.println(tS);  //  [-3, 2, 5, 13, 19, 24]
        /* interview question
              Q1)what do u use to store unique elments in natural order   ==> TreeSet
              Q2) you know TreeSet is so slow, how to make the tree set faster? ==>  create HashSet and add elements into it then convert HashSet into TreeSet
     ex: store the email addresses in alphabetic order
*/
        //1st answer is  create straight a TreeSet is the answer
        TreeSet<String > ts1=new TreeSet<>();
        ts1.add("bec@gmail.com");
        ts1.add("acd@gmail.com");
        ts1.add("abe@gmail.com");
//2ns way is create a HashSet and then store them by add method whis is so fast then convert HashSet into TreeSet
        HashSet<String > yourHs=new HashSet<>();  //this is the fastest set
        yourHs.add("bec@gmail.com");
        yourHs.add("acd@gmail.com");
        yourHs.add("abe@gmail.com");
        //and then convert this HashSet into TreeSet
        TreeSet <String> ts2= new TreeSet<>(yourHs);   //TreeSet<>() constructor create a TreeSet by using parameter of yourHs





    }
}
