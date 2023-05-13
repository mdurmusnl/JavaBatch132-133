package Batch132.JavaTeachingB132mrSuleyman.day15ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {
        /*
        ask use to enter a letter
        if the letter exist in the list convert it to "x"
        otherwise add the element user entered into the list
 */
        Scanner input= new Scanner(System.in);
        System.out.println("enter a letter ...");
        char letter=input.next().charAt(0);
        List<Character> myList= new ArrayList<>();
        myList.add('J');
        myList.add('A');
        myList.add('V');
        myList.add('A');
        //MY OWN WAY
     /*   if(myList.contains(letter)) {
            for (int i = 0; i < myList.size(); i++) {
                if (myList.get(i) == letter) {
                    myList.set(i, 'X');
                }
            }
        }
     else{
         myList.add(letter);
            }
        System.out.println(myList);
        System.out.println("mr suleymans solution");   */
  //MR Suleymans solution way    HATA VAR
      if(myList.contains(letter)){
          myList.set(myList.indexOf(letter),'X');    //set method only add in the first occurance index   [J, X, V, A]
      }else{
          myList.add(letter);
      }
        System.out.println(myList);




    }
}
