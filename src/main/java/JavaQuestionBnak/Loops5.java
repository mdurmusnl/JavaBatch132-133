package JavaQuestionBnak;

import java.util.Scanner;

// ex23  page 211
public class Loops5 {
    public static void main(String[] args) {
        /*
Ask the user to enter an integer to check if it is a prime number or not. Example: if user
enters 43 output will be “43 is a prime number”, if user enters 120 output will be “120 is not a
prime number”, if user enters negative integers output will be “Enter a positive integer”

         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter a positive number to check if its prime or not");
        int num = input.nextInt();
        int counter = 0;
        if (num > 0) {
            if(num==1){
                System.out.println("is not a prime number");
            }else{
                for (int i = 2; i < num / 2; i++) {
                    if (num % i == 0) {
                        counter++;
                    }
                }
                if(counter==0){
                    System.out.println("prime");
                }else{
                    System.out.println("not prime");
                }
            }
        } else{
            System.out.println("enter a positive number");
        }

        /*
        Ask the user how many fibonacci numbers he wants to see. Then write the code that prints
these fibonacci numbers. Example: if user enters 6 output will be 1 1 2 3 5 8
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("How many fibonacci number do you want to see?");
        int number = scan.nextInt();
        int fibo1=1;
        int fibo2=1;
        int fibonacci=0;
        System.out.print(fibo1+" ");
        System.out.print(fibo2+" ");
        for(int i=1;i<number;i++){
            fibonacci=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fibonacci;
            System.out.print(fibonacci+" ");
        }
        System.out.println();
        /*  ex 25
        A number is called an Armstrong number if it equals the sum of the cube of its every digit.
For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which equals the
cube of every digit. Type a code to check if the given number is the Armstrong number or
not.
         */
        System.out.println("amstrong");
        System.out.println("Enter an integer to check if it is Armstrong number or not");
        int n = input.nextInt();
        int temp=n;  // we stored the number
   int sumN=0;
   int digit=0;
   for(int i=n;i>0;i=i/10){
       digit=i%10;
       sumN+=digit*digit*digit;
   }
if(temp==sumN){
    System.out.println("its an amstrong number");
}else{
    System.out.println("its not");
}
/*
my own question
if a number is equal to the sum of sqaure of digits of it  then its called hattori number
 */
int m=145;
int tep=m;
int dig=0;
int sumOfSquare=0;

while(m>0){
    dig=m%10;
    sumOfSquare=dig*dig;
    m=m/10;
}
if(tep==sumOfSquare){
    System.out.println("hattori");
}else{
    System.out.println("not hattori");
}


        }
    }