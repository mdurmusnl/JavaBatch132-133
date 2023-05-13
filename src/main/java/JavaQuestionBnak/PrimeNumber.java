package JavaQuestionBnak;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a positive number to check if its prime or not");
        int num = input.nextInt();
        int counter = 0;
        if(num>0){
            if(num==0){
                System.out.println("its not prime");
            }else{
   for(int i =2;i<num/2;i++){
       if(num%i==0){
           counter++;
       }
   }
                if(counter==0){
                    System.out.println("prime");
                }else{
                    System.out.println("not prime");
                }
            }
        }else{
            System.out.println("enter a postive number");
        }

    }

}
