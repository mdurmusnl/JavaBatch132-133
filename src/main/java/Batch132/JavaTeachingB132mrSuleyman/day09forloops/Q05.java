package Batch132.JavaTeachingB132mrSuleyman.day09forloops;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {


           /*

     Ask user how many fibonacci numbers he wants to see. Then type the code that prints
      these fibonacci numbers.
      Ex: if user enters 6 output will be 112358

       */
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of fibonacci numbers to see");
        int n= input.nextInt();
       int fibo1= 1;
       int fibo2= 2;
        System.out.println(fibo1);
        System.out.println(fibo2);
int fibonacci= 0;
for(int i=1;i<n-1;i++){  //cunku 2tane zeten yazildi   bir ve bir
   fibonacci=fibo1+fibo2;
   fibo1= fibo2;
   fibo2= fibonacci;
    System.out.println(fibonacci+" ");
}

    }
}
