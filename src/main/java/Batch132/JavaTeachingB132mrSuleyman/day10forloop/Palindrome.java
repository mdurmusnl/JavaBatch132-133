package Batch132.JavaTeachingB132mrSuleyman.day10forloop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a string");
        String s =input.next();
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            char ch= s.charAt(i);

                    reverse=reverse+ch;

        }
        if(s.equals(reverse)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        System.out.println("%%%%%%%%");
        //ex   ********** advanced  *********  type a code to find the sumof unique digits in a integer
        // 12335==>  1+2+5=8
        Scanner input1= new Scanner(System.in);
        System.out.println("enter a number");
        String num=input1.next();
        int sum=0;
        for(int i=0;i<num.length();i++){
            String  st= num.substring(i,i+1);
            if(num.indexOf(st)==num.lastIndexOf(st)){
                sum=sum+Integer.valueOf(st);
            }
        }
        System.out.println(sum);

    }
}
