package Batch132.JavaTeachingB132mrSuleyman.day04;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {


//Example 1: Get the full name of the user and make all characters in upper case.
//
        Scanner input = new Scanner(System.in);
       /* System.out.println("enter full name");
        String fullName = input.nextLine().toUpperCase();
        System.out.println(fullName);
*/

//Example 2: Get the full name of the user, make all characters in upper cases and remove spaces
// from the beginning and from the end
        String name= input.nextLine().toUpperCase().trim();
        System.out.println(name);

    //trim method just remove the spaces from the very begingin and at the end

      //example 3   get a string from a user  and get the number of charachter
        System.out.println("enter a senctence");
        String s= input.nextLine();
        int numOfChars=s.length();
/*
  odev   get the correect number of charahter
  odev    get the fullname with no space between
*/


    }
}
