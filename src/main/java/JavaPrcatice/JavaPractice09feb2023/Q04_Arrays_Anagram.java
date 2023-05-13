package JavaPrcatice.JavaPractice09feb2023;

import JavaPrcatice.abstraction.Area;

import java.util.Arrays;
import java.util.Collections;

public class Q04_Arrays_Anagram {
    public static void main(String[] args) {
        String s1= "dormitory";
        String s2= "dirty room";
        s2=s2.replaceAll(" ","");
        System.out.println(s2);  //dirtyroom
       String s1rr[]= s1.split("");
        System.out.println(Arrays.toString(s1rr));//[d, o, r, m, i, t, o, r, y]
        String s2rr[]=s2.split("");
        System.out.println(Arrays.toString(s2rr)); //[d, i, r, t, y, r, o, o, m]
        Arrays.sort(s1rr);
        System.out.println(Arrays.toString(s1rr)); //[d, i, m, o, o, r, r, t, y]
        Arrays.sort(s2rr);
        System.out.println(Arrays.toString(s2rr));//[d, i, m, o, o, r, r, t, y]
        if(Arrays.equals(s1rr,s2rr)){
            System.out.println("anagram");
        }else{
            System.out.println("not");
        }
        System.out.println("***");
        System.out.println(isAnagram(s1,s2));
    }
    //ex   type a code if two strings are Anagram or not
    // a word or phase made by using the letters of another word or phase in a different order
    //ex  dormitory   and dirty room
 public static boolean isAnagram(String s1, String s2){
        String arr1[]= s1.replaceAll(" ","").split(""); //first remove the space then keep each letter in an array list
     String arr2[]= s2.replaceAll(" ","").split("");
     Arrays.sort(arr1);
     Arrays.sort(arr2);
     if(Arrays.equals(arr1,arr2)){
         return true;
     }else{
      return false;
     }

 }

}
