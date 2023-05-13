package JavaQuestionBnak;

import java.util.Scanner;

//page 216
public class PrimeNumber02 {
    public static void main(String[] args) {
     /*
        Type a code that prints all prime numbers less than a given number. Example: if user enters
20 output will be 2, 3, 5, 7, 11, 13, 17, 19
   hint     a prime number has only 2 factrs  1 and itself
      */
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num= input.nextInt();
       int counter=0;
       if(num>1){
           for(int i=1;i<num;i++){
               if(num%i==0){
                   counter++;      //if and only if co=ounter =2 then num is prime
               }
           }
           if(counter==2){
               System.out.println(num+ " is a prime");
           }
       }

    }
}
