package JavaQuestionBnak;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class calisma04 {
    public static void main(String[] args) {
  // EX  type a code to remove the first occurance of a specifi character from a list
        List<String > a=new ArrayList<>();
        a.add("shoes");
        a.add("tv");
        a.add("radio");
        a.add("laptop");
        a.add("shoes");
        a.add("book");
   //  a.remove("shoes");  //reomve method removes only the first occurance
        System.out.println(a);  //[tv, radio, laptop, shoes, book]
        // EX  type a code to remove the all occurance of a specific character from a list
        List<String> c=new ArrayList<>();
        c.add("shoes");
        a.removeAll(c);  // this method is gonna remove all "shoes" in list a
        System.out.println(a); //[tv, radio, laptop, book]
       // a.remove(4);// it removes the element at index4

//  ex3 create an integer list and remove 4th element  index =3
        List<Integer> d = new ArrayList<>();
        d.add(4);
        d.add(31);
        d.add(15);
        d.add(13);
        d.add(54);
      d.remove(3);  //removes element 13
        //when u want to remove the leemet 4 itself    remember  index are primitive  and list work with non primite  so use wrapper class of int 4
        d.remove(Integer.valueOf(4));  //this removes integer for     remmeber List work with non primitive  int =primitive    Integer=non primitive
                 // valueOf method just chanhes the data type  it was primitive then after using valueOf method its non primitive
        //type code to check if a specific element exist or not
        List<Double> g= new ArrayList<>();
        g.add(12.99);
        g.add(5.02);
        g.add(11.23);
        boolean isExist=g.contains(5.02);   // true
        //type code to change the element at index1 to 9.99
        g.set(1,9.99);



    }
}
