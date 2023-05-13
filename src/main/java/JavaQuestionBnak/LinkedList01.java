package JavaQuestionBnak;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> aa=new LinkedList<>();
        aa.add("A");
        aa.add("B");
        aa.add("C");
        aa.add("B");
        aa.add("D");
        System.out.println(aa);  //[A, B, C, B, D]
       // System.out.println(aa.remove(2));
   /// aa.add(1,"Ali");
    //    System.out.println(aa);  //  [A, Ali, B, C, B, D]
      aa.addFirst("Ali");
        System.out.println(aa);//  [Ali, A, B, C, B, D]
        aa.addLast("veli");
        System.out.println(aa); //[Ali, A, B, C, B, D, veli]
        aa.add("kemal");
        System.out.println(aa);
       aa.remove();  //removes the first element
        aa.removeLast();// removes the last element
        Collections.sort(aa);//  [A, B, B, C, D, veli]
        aa.set(0,"X");
        System.out.println(aa);
        Collections.reverse(aa);  // [veli, D, C, B, B, X]

        List<String > m=new ArrayList<>();
        m.add("A");
        m.add("C");
        m.add("B");
        Collections.reverse(m); //if dont sort with Collection.sort()  then reverse() method print from last input to first input
        System.out.println(m);
        //m.removeAll(m);
        //System.out.println(m);  // []
        System.out.println(m.removeAll(m));
    }
}
