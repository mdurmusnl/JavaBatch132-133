package Andrey.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class interviewIterator {
    public static void main(String[] args) {
        List<String > myList= new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);  // [Tom, Jim, Clara, Angie, Mark]
        //iterator   only remove operarion and its like for each loop on direction
        Iterator<String > myItr= myList.iterator();
        while (myItr.hasNext()){
            myItr.next();
            myItr.remove();
        }
        System.out.println(myList);//[]


        //ListIterator   remove and update or add all are possible its by direction like for loop
        List<String > yourList= new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList);  // [Tom, Jim, Clara, Angie, Mark]
ListIterator<String > yourListItr=yourList.listIterator();   //pointer is always at the beginning as default
        while(yourListItr.hasNext()){
            yourListItr.next();
        }
   //now the pointer is at the end  now yourlist is ready to work from end to beginning
        while (yourListItr.hasPrevious()){
            String element=yourListItr.previous();
            System.out.print(element+"!... ");   //Mark!... Angie!... Clara!... Jim!... Tom!...
        }



    }
}
