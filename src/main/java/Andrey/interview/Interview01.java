package Andrey.interview;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Interview01  {

    public static void main(String[] args) {

        //Example 1: Delete all "y"s from a given String
        String s= "Everything is easy if you study";


        //ex2  find the number of letters in the given string
        String pwd = "As1?fdes3";

        //ex3     type a method to fin the sum of  the unique digits of a given integer

        //ex4   Type a code to print your name in reverse

        //ex5  type a code to get the initials of first name and last name
        String ss= "Tom Hanks";

        // ex6 type a code to check if a string enda with "money" or not
        String sss= "learn jaba earn money";
       //ex7  check if the user s password according the the given rules
        String pswrd= "As1? sh! vg";
          /*
               1) password should have at least 8 characters
               2) password should not have "space " character"
               3)password should have at least one uppercase
               4) at least one symbol
           */

        //rule1
        boolean r1=pswrd.length()>7;
        //rule2
        boolean r2 = pswrd.replaceAll(" ","").length()==pswrd.length();
        System.out.println("rule 2  "+r2);
        //another way for rule2
        boolean anotherWayOfRuleTwo=pswrd.replaceAll("[^ ]","").length()==0;   //"[^ ]" means diffetrent than space  its [^ ]and a space
        System.out.println(anotherWayOfRuleTwo);
        //rule3   ***  good question
        boolean r3= pswrd.replaceAll("[^A-Z]","").length()>0;
        //rule4
        boolean r4= pswrd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println(" symbol"+r4);
    }

}
// qQ1   what s the difference between method and construction
//1 methods are for action   constr for object creation
// method

//Q2  what are the diferences between primite and non primitive data types
  //mojor difference is  non primitives days has methods
//heap and stack
//lower case and upper case
//non primitives are infinitly many

//q3  can u explain auto widening and explicitly narrowing and unboxing

//q4 what is the reason java created Wrapper classes

//Q5  What is the differecne between this () and super()
   // this() calls constrution in the class   super() caal the parent const
///alwasy on the top line
// this without paranthesis is for calling variable or a method in the class   cuper withour paranthesis is fore calling variable and mehod from parenrt class
// this nas super without parantehiss can be in ant line the method block

/*
how many methods are there
public static void get int(){}
int age=12;
system.out.println(""helllo");
public boolean isPrime(){}
boolean isPrime=true;

 */