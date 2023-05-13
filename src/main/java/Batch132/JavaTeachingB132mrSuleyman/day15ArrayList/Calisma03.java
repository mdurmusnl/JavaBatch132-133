package Batch132.JavaTeachingB132mrSuleyman.day15ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calisma03 {
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
        //in the scenario of input is 'A'  the code doesn't work efficiently
        if(myList.contains(letter)){
            myList.set(myList.indexOf(letter),'X');    // you taught us , set method() only add a new element  in the first occurance of a given index   [J, X, V, A]
        }else{
            myList.add(letter);
        }
        System.out.println(myList);    //  [J, X, V, A]






    }
}
