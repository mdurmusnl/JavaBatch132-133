package Andrey.SelfStudy.Sgs01;

public class Study12 {
    public static void main(String[] args) {
        //type a code to check if a number is prime or not
        //prime is divisible by itself and by 1        12is not   7is prime
        //prime number has two divisor  , 1 and itself
//prime 2,3,5,7,
 boolean result=   isPrime(19);
        System.out.println(isPrime(19)); //true
        System.out.println("is it prime "+result);
        // type a code print all prime numbers lees than 100
       for(int i=0;i<100;i++){
           if(isPrime(i)){
               System.out.print(i+" ");
           }
       }
    }
    public static boolean isPrime (int num){      //12         1 2 3 4
        int counter=0;
        if(num>1){
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    counter ++;
                }
            }
        }
        if(counter==2){
            return true;
        }else{
            return false;
        }
    }

}
