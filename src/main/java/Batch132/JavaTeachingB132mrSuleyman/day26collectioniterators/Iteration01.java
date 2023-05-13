package Batch132.JavaTeachingB132mrSuleyman.day26collectioniterators;

import java.util.*;

public class Iteration01 {
 /*   Iterator= loop without infinite loop risk
       1) Iterators do the same with loops
       2) loops have infinite loop risk but iterators do not have such risk
       3) there is no performance difference between loops and iterators
       4) Iterators are more successfull in removing elements and updating elements in a collection
       5) there are 2 types of Iterator
          i) iterator : it can remove the elements it is impossible to update (a bank account my ssn can not be updates buy can be deleted if i close my account)
                        it works from left to right  just like for each loop    (but in "for loop"  u can start from last to fist)
         ii) ListIterator : it can remove and update the element.
                           it works from left to right and aldo form right to left both direction
                           its like for loop
         */
 public static void main(String[] args) {
     List<String > myList= new ArrayList<>();
     myList.add("Tom");
     myList.add("Jim");
     myList.add("Clara");
     myList.add("Angie");
     myList.add("Mark");
     System.out.println(myList);  // [Tom, Jim, Clara, Angie, Mark]
     //iterator() method convert myList into a myItr object,  iterator() method changes the structure of myList
     Iterator<String> myItr= myList.iterator();  //iterstor() method just removes the element  does not update, it does not add new element
     while(myItr.hasNext()){ // boolean ==>hasNext() method is like a question , is there an element after the pointer?  if yes then the while loop keep running
         myItr.next();       //next() method moves the pointer to the next element and gives the element
         myItr.remove();       // removes the element
     }                        // this while loop keep working unitl there is no element after pointer
     System.out.println(myList);  //  [ ]

//now lets us see the behaviour of ListIterator
     List<String > yourList= new ArrayList<>();
     yourList.add("Tom");
     yourList.add("Jim");
     yourList.add("Clara");
     yourList.add("Angie");
     yourList.add("Mark");
     System.out.println(yourList); //[Tom, Jim, Clara, Angie, Mark]
     // remember ListIterator removes and updates,   it focus on
  ListIterator<String > yourListItr=yourList.listIterator();   // listIterator() method will convert yourList into yourListItr object
      while(yourListItr.hasNext())  {                  // listIterator can add and remove,  it works from both direction (left to right or right to left)
             String el=yourListItr.next();   //next() method moves the pointer to the next element ang gives the element ,  then there is assignment
            yourListItr.set(el+"!...");      ///set () method updates

      }
     System.out.println(yourList);  // [Tom!..., Jim!..., Clara!..., Angie!..., Mark!...]

     //ex   print the elements of  yourList  on the console from the last element to the first element in the same line with a space in between
     List<String > herList= new ArrayList<>();
     herList.add("Lee");
     herList.add("Brown");
     herList.add("James");
     herList.add("Angie");
     herList.add("Mark");
  ListIterator<String > herListItr=herList.listIterator();    //   ***  attention
     //following loop will move the pointer to the very end
  while (herListItr.hasNext()){    // pointer is at the begining as a default   so  if u wanna start form last then u have to send the pointer to the last
      herListItr.next();
  }                                // this while loop will move the pointer from beginnig to the end of the list  so then we can work form right to left
     //following loop will work from end to the begining
 while ((herListItr.hasPrevious())){
     String el=herListItr.previous();
     System.out.print(el+" ");
 }       // Mark Angie James Brown Lee



 }
}
