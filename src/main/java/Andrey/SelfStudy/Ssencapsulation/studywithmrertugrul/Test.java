package Andrey.SelfStudy.Ssencapsulation.studywithmrertugrul;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /* Ask username, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
        (Check credit card number, if there aren't 16 digit print "Invalid credit card number"
        Input :
        John White 1234234534561478
        Output :
        Name : J*** W****
        CCN  : **** **** **** 1478      */
        String ccNumber= " 1234234534561478";
        String a="Lee Brown James";
        String arr[]=a.split(" ");
        System.out.println(Arrays.toString(arr)); //[Lee, Brown, James]
        String name= "John White";
        String nameFirst=name.split(" ")[0];  //John
        String nameLast=name.split(" ")[1];  //White
        System.out.println(nameLast);
        System.out.println(nameFirst);
        System.out.print(name.substring(0,1));
        for(int i=0;i<nameFirst.length()-1;i++){
            System.out.print("*");
        }
        System.out.print(" ");
        System.out.print(nameLast.substring(0,1));
        for(int i=0;i<nameLast.length()-1;i++){
            System.out.print("*");
        }
        System.out.println();   //to go lower line in the console
        for(int i=0;i<3;i++){
            for(int k=0;k<4;k++){
                System.out.print("*");
            }
            System.out.print(" ");
        }
   System.out.print(ccNumber.substring(13,17));
    }
}
