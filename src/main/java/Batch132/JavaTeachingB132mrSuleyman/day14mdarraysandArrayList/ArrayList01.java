package Batch132.JavaTeachingB132mrSuleyman.day14mdarraysandArrayList;

import java.util.*;

public class ArrayList01 {
    public static void main(String[] args) {
        /*
        1  Arrays works super fast but the datas must be fixed like month of year , t uses less memory
        2 ArrayList is flexible with its length, advantage to add or remove an element  but ArrayList more memory
        3  ArrayList IS Enhanced structure  it has many methods   Array has less method   thats why intinterviw they ask u Array to seee the ablity with less methods
        4  ArrayList can store NON PRIMITIVE data type
        array store primitive and reference of non primitive,
         */
        ArrayList<Integer> ages= new ArrayList<>();
        List<Integer> prices=new ArrayList<>();
        System.out.println(ages);
        ages.add(13);
        ages.add(9);
        ages.add(21);
        System.out.println(ages);
       ages.add(1,44);    //puts 44 at the index 1
        prices.add(300);
        prices.add(550);
        prices.add(770);
       // ages.addAll(prices);
        //  System.out.println(ages);  //[13, 44, 9, 21, 300, 550, 770]
        ages.addAll(2,prices);
        System.out.println(ages);  //  [13, 44, 300, 550, 770, 9, 21]
        //    ages.clear(); //removes  ALL  elements
        //how to check if a specific elemet exist or not
       boolean r1= ages.contains(44);  //boolean   true   bcs it  exist
        System.out.println(r1); //true
        boolean r2=ages.containsAll(prices);
        System.out.println(r2);  // true     but each element of pricers should ezxist  alllll
    // how to check if two lisr are same or not
    List<String> names2= new ArrayList<>();
    names2.add("Tom");
    names2.add("Angie");
        List<String> names1= new ArrayList<>();
        names1.add("Tom");
        names1.add("Angie");
       boolean r3= names1.equals(names2);   // if same element in the same index it return true  otherwise it return false

        //ex1    type aa code to check if two list have same element  same elements can be in different indexes
        List<Character> m=new ArrayList<>();
        m.add('A');
        m.add('B');
        m.add('A');
        List<Character> n=new ArrayList<>();
        n.add('B');
        n.add('C');
        n.add('A');
        // ***  If it was Arrays   use use sort() method put them in ascendong order
        // for ArrayList we use Collection framework SORT mETHOD()
        Collections.sort(m);
        Collections.sort(n);
        boolean r4=n.equals(m);   // now it returns true     but if the size is dif  or the orders are diffretnet it returns false



    }
}
