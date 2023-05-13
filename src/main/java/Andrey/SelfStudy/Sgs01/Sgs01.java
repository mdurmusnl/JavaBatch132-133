package Andrey.SelfStudy.Sgs01;

public class Sgs01 {
    public static void main(String[] args) {
        //ex1 type a code to check if a given number is a prime nuber or not
        //ex2  tyhe a code to print all prime numbers between 2 and 100
        for(int i=2;i<100;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

        System.out.println();
 boolean r=isPrime(9);
        System.out.println(r);
    }
    public static boolean isPrime(int num){
      if(num<=1){
          return false;
      }else {
          for (int i = 0; i < num; i++) {   // yanilis bir kod
              if (num % 2 == 0) {
                  return false;
              }
          }
      }
        return true;
    }

}
