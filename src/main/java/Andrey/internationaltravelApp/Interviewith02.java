package Andrey.internationaltravelApp;

import Andrey.interview.Interview01;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interviewith02 {
    public static void main(String[] args) {

        //Question 1 : Type code to go back to the date when you were born.
        LocalDate currentDate=LocalDate.now();
         LocalDate myBirthday= currentDate.minusYears(42).minusMonths(1).minusDays(10);
        System.out.println(myBirthday);
        //Question 2: Remove the duplicated elements in an Integer list
        List<Integer> yourList = new ArrayList<>();
        yourList.add(11);
        yourList.add(12);
        yourList.add(11);
        yourList.add(2);
        yourList.add(9);
        yourList.add(12);
        yourList.add(5);
        System.out.println(yourList); //[11, 12, 11, 2, 9, 12, 5]
       for(int i=0;i<yourList.size();i++){
         Integer   a= yourList.get(i);  // List work with Wrapper class
           if(yourList.indexOf(a)!=yourList.lastIndexOf(a)){
               yourList.remove(a);
               i--;
           }
       }
        System.out.println(yourList);
//2nd way
        List<Integer> copyList=new ArrayList<>();

        for (Integer w:yourList){   //[11, 12, 11, 2, 9, 12, 5]
          if(!copyList.contains(w))
            copyList.add(w);
        }
        System.out.println(copyList);  //[11, 2, 9, 12, 5]
      //3rd way






        //Question 3: Create a method which reverse a sentence by using StringBuilder
        // I love Java
        StringBuilder str = new StringBuilder("I love Java");
        getReverse(str);
        System.out.println("with second method");
        System.out.println(reverse(str));
     //   4)What is the difference between pass-by-value and pass-by-reference?   ****



    }
       public static void getReverse(StringBuilder s){
           System.out.println(s.reverse());
     }
     public static StringBuilder reverse(StringBuilder s){
       return s.reverse();
     }
}
