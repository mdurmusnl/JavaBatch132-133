package Batch132.JavaTeachingB132mrSuleyman.day04;

import java.util.Scanner;

public class Scaner01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your full name");
        String fullnName= input.nextLine(); //gets the fullName
       char first = fullnName.charAt(0);  // gets the fisrt letter of fullNmae
        System.out.println(first);
     char last = fullnName.split(" ")[1].charAt(0);  //[1] means the second word last letter
        System.out.println(first+" "+last);




    }
}
