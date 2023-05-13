package Batch132.JavaTeachingB132mrSuleyman.day05;

public class StringManipulations01 {
    public static void main(String[] args) {

        //examples 1    type a code to check if the 7th charachter of a given string os "a"?
        //1st way:
        String s= "Alabama State";
        boolean result1 = s.charAt(6)=='a';
        System.out.println(result1);
        System.out.println("***********************");
        //2nd way
       boolean q= s.startsWith("a",6);
        System.out.println(q);
        System.out.println("&&&&&&&&&&&&&&&&&&");
        //Example 2  typre a code to check if a string ends with "money" or not
      //1st way
        String t= "Learn Java earn money";
        boolean w=t.substring(21-5).equals("money");
        System.out.println(w);
        System.out.println("^^^^^^^^^^^^^^^^^^^^");
        boolean aa= t.endsWith("money");
        System.out.println(aa);

        //example 3:  type a code  to convert money to dollar
        String qq= t.replace("money","dollar");
        System.out.println(qq);

        System.out.println("@@@@@@@@@@@@@@@@@");
        //example 4   type a code to convert "a" to "*"
       String z=  t.replace("a","*");   // 'a'   '*'   also possible in this way
        System.out.println(z);
        System.out.println(t);

        //example 5  type a code convert "earn" to "win"
       String zz= t.replace("earn","win");



    }
}
