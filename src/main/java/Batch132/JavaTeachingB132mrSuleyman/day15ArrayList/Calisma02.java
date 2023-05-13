package Batch132.JavaTeachingB132mrSuleyman.day15ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Calisma02 {
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
                myList.set(i,77);
            }
        }
        System.out.println(myList);   //[13, 77, 25, 77, 10]
        System.out.println("2nd way with for each loop");
        for(int w:myList){
            if(w<10){      //w  elemanin kendisi   w index degil   asagiya set method icine index yazmalisin  w yazilmaz
                myList.set(myList.indexOf(w),77);
            }
        }
        System.out.println(myList); // [13, 77, 25, 77, 10]



    }
}
