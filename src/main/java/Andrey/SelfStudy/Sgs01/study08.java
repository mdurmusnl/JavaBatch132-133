package Andrey.SelfStudy.Sgs01;

public class study08 {
    public static void main(String[] args) {
  boolean r=isPrime(9);
        System.out.println(r);
        // type a code to print prime between 2 and 100
        for(int i=1;i<100;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int num){
        int counter=0;
        if(num>1){
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    counter++;
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
