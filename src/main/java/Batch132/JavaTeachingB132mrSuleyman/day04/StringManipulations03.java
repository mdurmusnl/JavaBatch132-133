package Batch132.JavaTeachingB132mrSuleyman.day04;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Example 1: Check the password if it has given rules.
        //           i)It should start with "J"
        //           ii)It should have at least 8 characters
        //           iii)Last 3 characters should be "AVA"

        String pwd= "J12!?AVA";
       Boolean first= pwd.startsWith("J");
        System.out.println(first);

        //           ii)It should have at least 8 characters
       boolean second=  pwd.length()>7;
        System.out.println(second);




        //           iii)Last 3 characters should be "AVA"
pwd.substring(5,8);

    }
}
