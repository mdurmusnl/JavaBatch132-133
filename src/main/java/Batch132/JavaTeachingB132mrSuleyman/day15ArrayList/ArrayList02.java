package Batch132.JavaTeachingB132mrSuleyman.day15ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        // ex1   create an ineteger list add 5 elements, change the elements less than 10 to 77

        List<Integer> myList=new ArrayList<>();
        myList.add(13);
       myList.add(8);
        myList.add(25);
        myList.add(2);
        myList.add(10);
        System.out.println(myList);//[13, 8, 25, 2, 10]
        for(int i=0;i<myList.size();i++){
            if(myList.get(i)<10){
                myList.set(i,77);   //   in set method ==>     for example   myList.set(index,value)
            }
        }
        System.out.println("with for loop  "+myList);   // [13, 77, 25, 77, 10]
        System.out.println("for each loop");

        // 2nd way  with for each loop
        for(Integer w: myList){
            if(w<10){
                myList.set(myList.indexOf(w),77);
            }
        }
        System.out.println(myList);   //  [13, 77, 25, 77, 10]

        System.out.println("ex2");
        //ex2     //Example 2: Create an integer list and remove the duplicated elements  == how many different elementes ?
//  very commen interview question     anothwer way of asking      find unique elements

        List<Integer> yourList = new ArrayList<>();
        yourList.add(2);
        yourList.add(3);
        yourList.add(2);
        yourList.add(2);
        yourList.add(5);
        System.out.println(yourList);
   //1st way   but way gives answer with a new list   doesnt update the given list
        // once bos bir liste olusturuyoruz
        List<Integer> noDublication= new ArrayList<>();     // an empty list
       for(int w: yourList){
            if(!noDublication.contains(w)){
                noDublication.add(w);
            }
        }
        System.out.println("with duplication list "+noDublication);  // 2,3,5

//2ns way  with foe loop    better than first way  it updates the given list

for(int i=0;i<yourList.size();i++){
    int num=yourList.get(i);
   if(yourList.indexOf(num)!=yourList.lastIndexOf(num)){
       yourList.remove(num);
       i--;     //we update the list so the indexes must be updated as well in every removing action
    }
}
        System.out.println("solution with updaying the given list"+yourList);   // [2, 3, 5]
















    }
}
