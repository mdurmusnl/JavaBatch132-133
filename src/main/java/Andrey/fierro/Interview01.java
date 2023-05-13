package Andrey.fierro;

import JavaQuestionBnak.ShapeRunner;

import java.util.Scanner;

public class Interview01 {
    public static void main(String[] args) {
        //1 when we revise java , we dont need to go deep details and we shall not  try to handle advance level questions to use our time effectively
        // As  A Qa we need to know core Java at basic level but firmly and with the logic
        // iINTERVIEW 01 = String manipulation
        // iINTERVIEW 02 = Ternary statement if statement for loop while loop
        // iINTERVIEW 03 = Arrays  - ArrayList
        // iINTERVIEW 04 = inheritance- Polymorphism
        // iINTERVIEW 04 = inheritance- Polymorphism
        // iINTERVIEW 05 = Encapsulation-Abstraction


        // iINTERVIEW 01 = String manipulation
       //q1   get the initials of a given name of a user who has first and last name     "Tom Hanks" ==> TH   // char method
      //Q2   type a code to swap the integers     a=12, b=5==> a=5,b=12
      //q3   get the full name of a user and make all characters in upper case and remove all possible spaces from the beginning and from the end
      //q4   get the first 4 characters of a string   Sting s="Netherland" ==>Net/    //substring method
      //Q5   Check if two strings are equal or not   String r="Java"   String u="java"   //equals methid and ignorequals method
        //examples 1    type a code to check if the 7th charachter of a given string os "a"?
        //1st way:
        String s= "Alabama State";
        //q6 in the pic
                //q7 //Example 1: Check the password if it has given rules.
        //        //           i)It should start with "J"
        //        //           ii)It should have at least 8 characters
        //        //           iii)Last 3 characters should be "AVA"

        String pwd= "J12!?AVA";
        Boolean first= pwd.startsWith("j");


        //           ii)It should have at least 8 characters
        boolean second=  pwd.length()>7;
        System.out.println(second);




        //           iii)Last 3 characters should be "AVA"
        pwd.substring(5,8);

        Scanner input = new Scanner(System.in);

        System.out.println("Please give me a name and last name");

        String output = input.nextLine();


           output= output.toUpperCase();
        char a = output.charAt(0);   //T

        String b = output.split(" ")[1];
           char c=  b.charAt(0);
        System.out.println(a+""+c);








    }
}
