package Andrey.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Aa {
    public static void main(String[] args) {
      //  Create an integer list and remove the duplicated elements./find how many different elements are there in a list? ==> very common interview question

        List<Integer> yourList = new ArrayList<>();
        yourList.add(2);
        yourList.add(3);
        yourList.add(2);
        yourList.add(2);
        yourList.add(5);
        System.out.println(yourList);
         List<Integer> copy=new ArrayList<>(); //empty
       /* for(Integer w: yourList){
            if(!copy.contains(w)){
                copy.add(w);
            }
        }
        System.out.println(copy);
        System.out.println(copy.size());
*/
        ListIterator<Integer> lst=yourList.listIterator();
        while(lst.hasNext()){
            int a=lst.next();
            if(!copy.contains(a)){
                copy.add(a);
            }
        }
        System.out.println(copy);

    }
}
