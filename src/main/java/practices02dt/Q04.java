package practices02dt;

import org.example.Main;

public class Q04 {
    public static void main(String[] args) {
         /*
Create a String variable and find the sum of ASCII values of the first and the last characters of the String.
String s= "Miami";
 */
        String s= "Miami";
       int asciiLast= s.charAt(s.length()-1) ;
        System.out.println(asciiLast);
        int asciiFirst= s.charAt(0);
        System.out.println(asciiFirst);
        System.out.println(asciiFirst+asciiLast);

        //my personal example
        String a= "Ali";
        int ascciA = a.charAt(0);
        System.out.println(ascciA);
    }
}