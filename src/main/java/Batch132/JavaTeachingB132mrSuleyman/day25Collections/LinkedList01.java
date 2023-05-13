package Batch132.JavaTeachingB132mrSuleyman.day25Collections;

import java.util.LinkedList;

public class LinkedList01 {
    /*
        1)Removing operation needs too many tasks for Java,
          that is why if we need too much removing operation
          we do not prefer to use ArrayLists
        2)Adding element/s into an ArrayList makes Java reindex,
          this is too many tasks for Java, that is why
          we do not prefer ArrayLists in adding operations
        3)LinkedList does not use indexes, LinkedList works with "nodes"
          Nodes have two parts i)Data Part ii)Pointer Part
          Pointer points the next element
          Last node is called as "Tail" and LinkedList has head points the first node
        4)When you remove any element Java changes just the pointers,
          does not touch the other elements. This is not too many tasks
          that is why we prefer to use "LinkedList" in removing operations.
        5)When you add any element Java changes just the pointers,
          does not touch the other elements. This is not too many tasks
          that is why we prefer to use "LinkedList" in adding operations.
        6)ArrayList uses indexes, indexes are like addresses.
          When you have address, it is so easy to find the element.
          Because of that, ArrayLists are so successful in "search operations"
        7)LinkedList does not use indexes, it means "nodes" do not have addresses.
          When you do not have address, it will be so difficult to find the node.
          Because of that, linkedLists are not successful in "search operations"
        8)If you create a functionality to add and remove museum visitors in an app, use "LinkedList"
          If you create a functionality to add zipcodes and find zipcodes for specific areas in an app, use "ArrayList"

          As a summary; LinkedList is successful in "adding" and "removing" operations but not successful in "search" operation
          ArrayList is successful in "search" operation but not successful in "adding" and "removing" operations
     */

    public static void main(String[] args) {

        LinkedList<String > names= new LinkedList<>();  //add o remove operation in LinkedList is faster compare to ArrayList
        names.add("Ali");
        names.addLast("Brad");  //it just put the last of the list for the time of adding
        names.add(2,"Jim");   //there is no index in LinkedList but Java understand index 2 as  3rd node,   in this moment jim is 3rd node
        names.addFirst("Angie");
        names.add("kemal");  //now kemal is the last ,  last element keep changing every after adding
       names.add("Ali");
        System.out.println(names);  //[Angie, Ali, Brad, Jim, kemal, Ali]
        //remove() method with no parameter returns String
        //retrieves and removes the first ele e t of the list (cut +paste)  cuts for mthe list and keep in the memory for futher use
        String f1=names.remove();  //removes the first method   it gives a string  its a string container
        System.out.println(f1); //Angie
        System.out.println(names); // [Ali, Brad, Jim, kemal, Ali]

         // remove("Jim") method with a parameter removes the first occurance of the element if it exists, if its not exists then the method odes nothing
       boolean r1=  names.remove("Brad");  // it returns true if the element exist if the element does not exist then it returns false
        System.out.println(r1);
        System.out.println(names);  //[Ali, Jim, kemal, Ali]
       //remove(1) method with an index it remove the inex and gives the element its like a double check
        String r2=names.remove(1);
        System.out.println(r2); //Jim
        System.out.println(names);  //[Ali, kemal, Ali]
        //removeLast() method remove the last element from the list
        String r3= names.removeLast(); //returns a string  and returls the last element   if u print it it prints Ali
        System.out.println(r3); //Ali
        System.out.println(names); //[Ali, kemal]
        names.removeFirstOccurrence("Ali"); //return boolean
        names.removeLastOccurrence("Kemal");  // //return boolean

        LinkedList<String > students= new LinkedList<>();
        students.add("Ali");
        students.addFirst("Brad");
        students.add(2,"Jim");
        students.addLast("Brad");
        students.addFirst("Angie");
        students.addLast("Brad");
        students.addLast("Ali");
        System.out.println(students); //[Angie, Brad, Ali, Jim, Brad, Brad, Ali]
        // pop() method   removes and returns the first element of the list
        // this methos is equivalent to removeFirst() ,   if the list is empty then java throws NoSuchElementException
        students.pop();
        System.out.println(students);//[Brad, Ali, Jim, Brad, Brad, Ali]
    //poll() method retrieves and removes the first element from the list if it exists
        // return the head of the list   if the  list is empty then it return null
         students.poll();


        System.out.println(students);  // [Ali, Jim, Brad, Brad, Ali]
         //elemenet()  method retrieves but do not remove the first it form the list, if the list is empty then java gives erorr
    String r5=    students.element();  //return the first element  shall be put unt o string container
        System.out.println(r5); //  Ali
        System.out.println(students); //[Ali, Jim, Brad, Brad, Ali]
        //peek() method retrieves but doesnt remove the first element on the list, if the list is empty  it gives null

        //set() method is in the parent List interface,  both ArrayList class and LinkedList MUST use
       students.set(1,"Jhon");

    }

}


