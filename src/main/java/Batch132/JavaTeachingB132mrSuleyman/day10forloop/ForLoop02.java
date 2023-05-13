package Batch132.JavaTeachingB132mrSuleyman.day10forloop;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {
        //ex1   type a code to find the sumof unique digits in a integer
        // 12335==>  1+2+5=8
        Scanner input= new Scanner(System.in);
        System.out.println("enter a number");
        String num=input.next();
        int sum=0;
        for(int i = 0;i<num.length();i++){
            String ch= num.substring(i,i+1);  //first character   yani ilk rakam
         if(num.indexOf(ch)==num.lastIndexOf(ch)){
             sum=sum+Integer.valueOf(ch);
         }

        }
        System.out.println("the sum of unique digits is  "+sum);
/*
ex2   type a code to get output like
week:1
   day 1
   day2
   day 3
   ....
 week :2
   day1
   day2
   day3
   ...

 */
        //in this 2 loops, the time complexity is square of 2   its 4/     if it was 3 loops then time complexity is cube of 3  it means 27
 for(int i=1;i<=5;i++){    //nested loops arte time consuming
     System.out.println("week"+i);   // its time complexity
     for(int k = 1;k<=8;k++){
         System.out.println("day"+k);
     }
 }
        System.out.println();
        //ex3     type a code to print rectangel star pattern using for loop
        //   ****
        //   ****
        //   ****
        System.out.println("enter the number of rows");
        int numOfRows= input.nextInt();
        System.out.println("enter the number of columns");
        int  numOfColumns=input.nextInt();
        for(int i=1;i<numOfRows;i++){
            for(int k =1;k<=numOfColumns;k++){
                System.out.print("*");
            }

        }





    }
}
