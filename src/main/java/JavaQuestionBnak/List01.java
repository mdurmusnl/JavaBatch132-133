package JavaQuestionBnak;

import java.lang.management.MemoryType;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// page 228
public class List01 {
      public static void main(String[] args) {
          //ex1 find the sum of all list elements in an integer list
          List<Integer> myList= new ArrayList<>();
          myList.add(12);
          myList.add(31);
          myList.add(7);
          myList.add(13);
          myList.add(10);
          int sum =0;
          System.out.println(myList);   //[12, 31, 7, 13, 10]
          for(int w:myList){
              sum+=w;
          }
          System.out.println(sum);
/*
ex2   find the sum all list elements before the first occurance of 13 in an intger list
 */
          List<Integer> myyList= new ArrayList<>();
          myyList.add(1);
          myyList.add(3);
          myyList.add(7);
          myyList.add(13);
          myyList.add(10);
          int summ=0;

          for(int w: myyList){
              if(w==13){
                  break;
              }else{
                  summ+=w;
              }
          }
          System.out.println(summ);
          //2nd way
          List<Integer> myyyList= new ArrayList<>();
          myyyList.add(1);
          myyyList.add(3);
          myyyList.add(7);
          myyyList.add(13);
          myyyList.add(10);
          int summm=0;
          System.out.println(myyList.indexOf(13)); //3
          for(int i=0;i<myyyList.indexOf(13);i++){
              summm+=myyyList.get(i);
          }
          System.out.println(summm);//11
    /*
    ex3  find the multiplicationof all even list elements in an integer list
     */
          List<Integer> yourList = new ArrayList<>();
          yourList.add(24);
          yourList.add(1);
          yourList.add(17);
          yourList.add(3);
          yourList.add(10);
          int m = 1;
for(int w:yourList){
    if(w%2==0){
        m*=w;
    }
}
          System.out.println(m);  //240
          /*
          Check if elements are in descending order in a list
Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
(Yellow, Red, Green, Blue) ==> Output: It is in descending order
           */    // KOPYA OLAN LISTEYI ASCENDNIG YAP    KOYA OLAN ILE ORGINAL LISTEYI CAPRAZ ES MI BAK  ES ISE DESCENDING
          List<String> e = new ArrayList<>();
          e.add("Yellow");
          e.add("Red");
          e.add("Green");
          e.add("Blue");
          List<String > f=new ArrayList<>();
          f.addAll(e);
          Collections.sort(f);  // kopya olan listeyi sirala
          System.out.println(e);  //[Yellow, Red, Green, Blue]
          System.out.println(f);   //[Blue, Green, Red, Yellow]  kopya olan liste
          int counter=0;
          int size=e.size();
     for(int i=0;i<e.size();i++){
  if(f.get(i).equals(e.get(size-1-i))){
      counter++;
  }
     }
   if(counter==size){
       System.out.println(e+" is in descending order");
   }else{
       System.out.println("not");
   }
/*
EX5  If the list has 15 as element, change all 15s to 51
Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
 */   //my own way
          List<Integer> g = new ArrayList<>();
          g.add(12);
          g.add(11);
          g.add(15);
          g.add(34);
          g.add(15);
          g.add(43);
          System.out.println(g);   //[12, 11, 15, 34, 15, 43]
for(int w:g){
    if(w!=15){
        continue;
    }else{
        g.set(g.indexOf(15),51);
    }
}
          System.out.println(g);  //  [12, 11, 51, 34, 51, 43]
//2nd way in the book
          List<Integer> h = new ArrayList<>();
          h.add(12);
          h.add(11);
          h.add(15);
          h.add(34);
          h.add(15);
          h.add(43);
          System.out.println(h);  //[12, 11, 15, 34, 15, 43]
          if (h.contains(15)){
              for(int w:g){
                  if(w==15){
                      int indx= g.indexOf(15);
                      g.set(indx,51);
                  }
              }
              System.out.println(g);
          }else{
              System.out.println("there is no 15 as an element");
          }
/*  ex6
If a list has 15 or 13, remove them.
Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)
 */
          List<Integer> hh = new ArrayList<>();
          hh.add(10);
          hh.add(31);
          hh.add(15);
          hh.add(13);
          hh.add(54);
          hh.add(13);
          System.out.println(hh);
    //   hh.remove(hh.indexOf(13));   index yazmaliyiz ve first occurance is removed
          System.out.println(hh);
        if(!hh.contains(15)&&!hh.contains(13)){
            System.out.println(" the list doesnt contain 13 or 15");
        }else{
            for(int i=0;i<hh.size();i++){
                if(hh.get(i)==15){
                    hh.remove(hh.indexOf(15));
                    i--;   // bcs list size is updated
                } if(hh.get(i)==13){
                    hh.remove(hh.indexOf(13));
                    i--;   // bcs list size is updated
                }
            }
            System.out.println(hh);   //[10, 31, 54]
          }
/*  ex7
Find the closest 2 integers in an Integer List
Example: (12, 31, 15, 13, 54) ==> Output is 12 and 13
 */
          List<Integer> d = new ArrayList<>();
          d.add(12);
          d.add(31);
          d.add(15);
          d.add(13);
          d.add(54);
  Collections.sort(d);
          System.out.println(d);  // [12, 13, 15, 31, 54]
      int smallestDifference=d.get(1)-d.get(0);
      for(int i=1;i<d.size();i++){
         smallestDifference= Math.min(smallestDifference,d.get(i)-d.get(i-1));
      }
          System.out.println(smallestDifference);
  for (int i=1;i<d.size();i++){
      if(d.get(i)-d.get(i-1)==smallestDifference){
          System.out.println(d.get(i)+" "+d.get(i-1));   // 12 ,13
      }
  }
/* ex8
Increase the value of every element except 7 and 10 by 2 in a List
Example: (12, 31, 7, 13, 10) ==> Output is (14, 33, 7, 15, 10)
 */
          List<Integer> k = new ArrayList<>();
          k.add(12);
          k.add(31);
          k.add(7);
          k.add(13);
          k.add(10);
          for(int w:k) {
              if (w == 7 || w == 10) {
                  continue;
              }else {
                  k.set(k.indexOf(w), w + 2);
              }
          }
              System.out.println(k);   //[14, 33, 7, 15, 10]
/*   ex9
Find the sum of all prices given in a String list
Example: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
 */
          List<String> myListP = new ArrayList<>();
          myListP.add("$12.99");
          myListP.add("$23.60");
          myListP.add("$54.45");
          double sumOfPrices=0;
          System.out.println(myListP); // [$12.99, $23.60, $54.45]
          for(String w:myListP){
          sumOfPrices+=Double.valueOf(w.replace("$",""));
          }
          System.out.println(sumOfPrices);








      }

}
