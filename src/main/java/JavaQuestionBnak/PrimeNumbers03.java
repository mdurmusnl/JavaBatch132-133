package JavaQuestionBnak;

import java.util.Scanner;

public class PrimeNumbers03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num= input.nextInt();
        for(int i =2;i<=num;i++) {
                 Boolean isPrime=true;
          for(int j=2;j<i;j++){
              if(i%j==0){
                  isPrime=false;
                  break;
              }
          }
          if(isPrime){
              System.out.print(i +" ");
          }
        }










    }
}
