package Andrey.interview;

import org.w3c.dom.css.CSSStyleSheet;

import java.util.Arrays;
import java.util.List;

public class Interview03Thu {
    public static void main(String[] args) {
        //Convert 2 dimensional array to 1 dimensional array.

        int nums[][] = { {13,3,12}, {8,14} };
        int sum=0;
        for(int[] w:nums){
            sum+=w.length;
        }
        int b[]=new int[sum];
       int inx=0;
        for(int [] w:nums){
            for(int k:w){
                b[inx]=k;
                inx++;
            }
        }
        System.out.println(Arrays.toString(b));

        //Find the number of vowels in a String by using arrays
        String s = "When you type a code!!!";
       // int a=s.replaceAll("[^aeiou]","").length();
         s=s.replaceAll(" ","");
           String crr[]  = s.split("");  //[W,h,e,
        int count =0;
        for(String w:crr){
            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    count++;
            }
        }
        System.out.println(count);








    }
}
