package Andrey.interview;

import java.util.*;

public class Interview05 {


    public static void main(String[] args) {
        //q1 could u please explain Collections
   //answer  Collections is categorized in 3 parts
   //i List    ii Queue   iii Set
   //list has 2 child concrete clases     LinkedList and ArrayList
        // Queue has 2 child concrete classes  LinkedList and PriorityQueue and one child interface Deque
        //Set has 3 concrete child class HashSet LinkedHashSet ans TreeSet and  one child interface SortedSet

       //q2   which List is better to use when u add or remove elements several times?
        LinkedList<String > names= new LinkedList<>();
        names.add("Ali");
        names.add("Brad");
        names.add(2,"Jim");
        names.addFirst("Angie");
        names.add("Ali");
        names.add("Brad");
        System.out.println(names);
        names.remove();  //QUESTION 1:  what does this code do?
      //   the method returns a String that we remove // paste         cut
        //answer   it removes the first elemenet   ==>Retrieves and removes the head (first element) of this list.
        System.out.println(names.remove());// Angie  //return a string that we remove
        //SO remote() method does 2 things  remove Angie and returns Angie


//very detail question
        //Q3   There is pop() method and poll() method in LinkedList  and both removes and return the element(node)
        // when shall we  use pop() method , when shall we use poll() method?
        //answer  if the requriment docusments instruct that if the app  returns NoSuchElement exception when  the element is not exist then we use pop()
                                               //if the app  returns null  when  the element is not exist then we use poll()

//q4 when do we prefer to use Set
      //we use Set to store unique datas such as email    //salad in your shoes :)
//can u please talk about HashSet structure and mechanism
//answer is HashSet stores element with Hashing technique that makes each element are unique
        //HashSet puts element in random order  that makes HashSet superfast
        //hashSet allows single null bcs it is a Set

        //q5 remove the elements from the LinkedHashSet lhs1 which are not exist in LinkedHashSet lhs2
        LinkedHashSet<String > lhs1= new LinkedHashSet<>();
        lhs1.add("tv");
        lhs1.add("radio");
        lhs1.add("fridge");
        lhs1.add("table");
        LinkedHashSet<String > lhs2= new LinkedHashSet<>();
        lhs2.add("chair");
        lhs2.add("radio");
        lhs2.add("computer");
        lhs2.add("fridge");

        //anser is
        lhs1.retainAll(lhs2);
        System.out.println(lhs1);  //[radio, fridge]

        //q6  store elements in natural order and make sure it works as fast as possible
        //answer : store the elements in a hashset then convert into treeset
      //another addition qustion to Q6   can u type the code to convert a HashSet into a TreeSet
        HashSet<String > hs1=new HashSet<>();
        TreeSet<String> ts1=new TreeSet<>(hs1);// it convert a treeSet into a HashSet

        //Q7 IF your code focus on FIFO OR LIFO  structure, which constructer or constrcutors can we use?
        //answer: LinkedList or PriorityQueue  both are class and implements Queue interface
        //answer  LinkedList use insertion order   but PriorityQueue stores elements in a wierd order  in a way we dont know   java does it
      // q7**** ask this*** crete a collection in which we can store data's in insertion order and that collection focus on FIFO     or LIFO
        //ANSWER   Duqeue<String > queList= new LinkedList<>();

        //iterator just does remove operation in better way without risk , it work in one way like for each loop











        List<String > myList= new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);  //[Tom, Jim, Clara, Angie, Mark]
        for(int i=myList.size()-1;i>=0;i--){

            myList.remove(i);
        }
        System.out.println(myList);//[]
        List<String > yourList= new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
    for(int i=0;i>yourList.size();i++){
yourList.remove(i);
    }
        System.out.println(yourList);//[Tom, Jim, Clara, Angie, Mark]  ????


    }
}
