package Batch132.JavaTeachingB132mrSuleyman.day11NestedLoopsWhileLoopsdowhilelooops;

import java.util.Scanner;

//almost no difference between for loop and while loop   there is no significant difference
//while loop is more readable
public class WhileLoops01 {
    public static void main(String[] args) {
        //ex1  tyoe a code to print integers from4 to 7
        //1st way with for loop
        for(int i= 3;i<8;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("***********");
//2ns way with while loop
        int i=3;
        while(i<8){
            System.out.print(i+" ");

            i++;
        }
//ex2   type a code to print odd numbers from 12 to 67 in the same line with a space in between
        int a= 12;
        while(a<68){
            if(a%2!=0){
                System.out.print(a+" ");
            }
            a++;
        }
        System.out.println();
//ex3   type a code to find the sum integers from 12 to 15
        int k= 12;
        int sum =0;
        while(k<15){
            sum+=k;
            k++;
        }
        System.out.println("the sum is   "+sum);
        System.out.println();
        // ex4:  type a code by using while loop
        // write a program that prompts the users to input an integer
        // it should then find the sum of the digits of that number
        // 123==> 1+2+3=6
        Scanner input= new Scanner(System.in);
        System.out.println("enter a number");
        int num= input.nextInt();
        num= Math.abs(num);
        int sumOfDigits=0;
        while(num>0){
            sumOfDigits=sumOfDigits+num%10;

            num=num/10;
        }
        System.out.println("the sum of digits of is  " +sumOfDigits);
        System.out.println();
 //ex5 :  // ex4:  type a code by using while loop
        //       write a program that prompts the users to input a number
        //       it should print the multiplication table of that number
        //3x1=3   3x2=6   3x3=9 .....  2x10=30
        System.out.println("enter a positive number for a multiplication table");
        int n= input.nextInt();
        int j=1;
        while(j<11){

            System.out.println( n+"x"+j+"="+(n*j));
            j++;
        }
        System.out.println();



    }
}
