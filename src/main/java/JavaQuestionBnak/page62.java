package JavaQuestionBnak;

import java.util.Arrays;

public class page62 {
    public static void main(String[] args) {
   //ex5
   //a
        String s= "I like to move it move up";
        String arr[]=s.split(" "); // [I, like, to, move, it, move, up]
        System.out.println("length of brr is  "+arr.length);  //7

     //b
        String brr[]=s.split("move"); //I like to
        System.out.println(brr[0]);  // I like to
        System.out.println(brr[1]);   //  it
        System.out.println(brr[2]);  // up
        //c
        String crr[]=s.split("it");
        System.out.println(Arrays.toString(crr));  // [I like to move ,  move ]





    }
}
