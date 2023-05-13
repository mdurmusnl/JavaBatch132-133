package Batch132.JavaTeachingB132mrSuleyman.day09forloops;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
         /*
           If the gender is "Male" and the age is less than 13 print "Boy" otherwise print "Man".
        If the gender is "Female" and the age is less than 13 print "Girl" otherwise print "Woman".
        If the gender is different from "Male" and "Female" print "No information".
        If you put another statement into an if statement you need to use 'nested if'
        //to prevent any difference cause any problem with the enterance of the data
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter your gender");
        String gender= input.next().toLowerCase();
        System.out.println("enter your age");
        byte age= input.nextByte();
       if (gender.equals("male")){
           if(age<0){
               System.out.println("invalid age");
           }else if(age<13){
               System.out.println("boy");
           }else{
               System.out.println("man");
           }

       }else if(gender.equals("female")){
           if(age<0){
               System.out.println("invalid age");
           }else if(age<13){
               System.out.println("girl");
           }else{
               System.out.println("woman");
           }


       }else{
           System.out.println("invalid gender");
       }






    }
}
