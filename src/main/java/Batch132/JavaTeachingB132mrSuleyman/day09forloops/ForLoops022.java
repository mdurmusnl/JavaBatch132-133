package Batch132.JavaTeachingB132mrSuleyman.day09forloops;

import java.util.Scanner;

public class ForLoops022 {
    public static void main(String[] args) {
        //Example 1: Put * between 2 consecutive characters and to the end in a String.
        //           For example; "Java" ==> J*a*v*a*




        String s= "Java";

        for(int i=0;i<s.length()-1;i++){
            System.out.print(s.charAt(i)+"*");
        }
        System.out.println("*********");
//ex  type a code to print uique characters in a string
        String ss= "Hello";
        for(int i=0;i<ss.length();i++){
            char ch=ss.charAt(i);
            if(ss.indexOf(ch)==ss.lastIndexOf(ch)){
                System.out.print(ch);
            }

        }
        System.out.println();
        //acayip onemli interview sorusu
//ex  type a code tp print a string in reverse
        String sss= "Andrey van Dijk";

        for (int i= sss.length()-1;i>=0;i--){
          char  ch1=sss.charAt(i);
            System.out.print(ch1);
        }
        System.out.println();
//ex  type a code to find the sum of 3 to 7
        int sum=0;
        for(int i=3;i<8;i++){
            sum+=i;

        }
        System.out.println("the sum is"+sum);
        //Example 1: Type code to select the minimum one of two integers
         int a= 11;
        int b= 12;
         int  result= (a<b)?(a):(b);

        int a1 =12;
        int b1= 55;
        String c1=a1<b1? "Minimum":"Not minimum";
        System.out.println(c1);
        System.out.println("***************");

//Example 2: Type code to calculate absolute value of an integer
int c=12;
 int reslt= c<0?(-1*c):(c);

        //Example 3:If two integers are positive return the multiplication
        //         Otherwise, give a message like "I do not know how to multiply"
        //         3 and 4  ==> 12   -   -3  and -4 =>"I do not know how to multiply"
int q=12;
int w=23;
Object result1=(q>0 && w>0)? (q*w):("i dont know how to multipple ") ;

//Type code to check if an integer has 3 digits or not==> Boundary Value Analysis--> -1000, -999, 100, -99, 0, 99, 999, 1000
int y= -245;
int y1= Math.abs(y);
      String result2= (y1>99 && y1<1000)? ("3digits"):("not");
        System.out.println(result2);

        //Ask user to enter a character, if it is vowel print 'Vowel 'or if it is not vowel 'Not Vowel'
        Scanner inpuT= new Scanner(System.in);


    }


}
