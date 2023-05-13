package practices02dt;

import java.util.Scanner;

public class primenumbersgeb {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a positive number");
        int number=input.nextInt();
        int counter =0;
        if(number>1){
            for(int i=1;i<=number;i++){
               if(number%i==0){
                   counter++;
               }
            }
            if(counter==2){    // a prime number is divisible by 1 and by itsel so a prime number has only 2 divisor
                System.out.println(number+" is a prime number");
            }else{
                System.out.println(number+" is not a prime number");
            }
        }else if(number==1){
            System.out.println("it is not a prime number");
        }else{
            System.out.println("please enter a positive number");
        }


    }
}
