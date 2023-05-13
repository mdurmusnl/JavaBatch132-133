package Batch132.JavaTeachingB132mrSuleyman.day07ifstatementternarystatement;

import java.util.Scanner;
//Nested structions use to much time in execution  it lead the app work slow
//not prerpefer but sometimes its mendatory
//if a code has to much execution time  its called time consuming code
//nested = ic ice girmis neslere
//nested time consume to much time
public class NestedIfStatement01 {
    public static void main(String[] args) {
        //Example1 if the worker is male and the age is greater than 65  he will be retired
        //otherwise we should work
        //if the worker is female and the age is 60 she will be retired otherwise retired
        //if the worker doesnt define himself or herself  as male or female print undefined
        Scanner input = new Scanner(System.in);
        System.out.println("enter your gender as male, fenmale or other");
        String gender= input.next();
        System.out.println("enter your age");
        byte age= input.nextByte();

        if(gender.equalsIgnoreCase("Male")){
           if(age>0){
               System.out.println("invcalid age");
           }else if(age<66){
               System.out.println("keep working");
           } else{ //no condition
                System.out.println("he must be retired");
            }
        }else if(gender.equalsIgnoreCase("Female")){
            if(age>0){
                System.out.println("invcalid age");
            }else if(age<61){
                System.out.println("keep working");
            } else{ //no condition
                System.out.println(" she must be retired");
            }
        }else{
            System.out.println("undefined genderclear");
        }


    }
}
