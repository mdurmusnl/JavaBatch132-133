package Andrey.fierro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Interview03 {
    public static void main(String[] args) {
        //Q1  find the number of letters in the given string
        String pwd = "As1?fdes3";
        int a= pwd.replaceAll("[^a-zA-Z]", "").length();
        System.out.println(a);

        //Q2  type a code to get the initials of first name and last name
        String ss= "Tom Hanks";
        String ssArray[]=ss.split(" ");
        String firstInitial=ssArray[0].substring(0,1);
        System.out.println(firstInitial);
        String secondInitial=ssArray[1].substring(0,1);
        System.out.println(secondInitial);
        System.out.println(firstInitial+secondInitial);


        //Q3  what are the diferences between primite and non primitive data types
        //mojor difference is  non primitives days has methods
//heap and stack
//lower case and upper case
//non primitives are infinitly many

        //q4 type a code to print the sum unique elements of an integer given in a string container
        String num="22387";

        //q5  can u print the ascii value of letter 'd'
        System.out.println((int)'d');

        //Q6 print the elements before "Fierro" in the given array
        String arr[]=new String[5];
        arr[0]="Tom";
        arr[1]="Andrey";
        arr[2]="Fierro";
        arr[3]="John";
        arr[4]="Peter";
        System.out.println(Arrays.toString(arr));
        for(String w:arr){

       if(w.equals("Fierro")){
           break;
       }
            System.out.println(w);
   }

        //Q7  print the lements different from "Fierro"
        for (String w:arr){
            if(w.equals("Fierro")){
                continue;
            }
            System.out.print(w+" ");
        }
        System.out.println();
        //Q8  Type a code to count the number of word starts with  "a" in a string
        String s="I am from Azerbaijan ";
        String srr[] =s.split(" ");
        System.out.println(Arrays.toString(srr));//[I, am, from, Azerbaijan]
        int counter=0;
     for(String w:srr){
         if(w.startsWith("a")){
             counter++;
         }
     }
        System.out.println(counter);

//q9 type a code to find the longest word in the give sentence
        String str=" I want to go to university to learn more about Java";
       String strArray[]= str.split(" ");
       int longestLength=strArray[0].length();
          for(String w:strArray){
             longestLength =Math.max(longestLength,w.length());

          }
        System.out.println(longestLength);
        for(String w:strArray){
            if(w.length()==longestLength){
                System.out.println(w);
            }
        }

       //2nd way is easier
       Arrays.sort(strArray);
        Arrays.sort(strArray, Comparator.comparing(String::length));
        System.out.println(strArray[strArray.length-1]);






    }
}
