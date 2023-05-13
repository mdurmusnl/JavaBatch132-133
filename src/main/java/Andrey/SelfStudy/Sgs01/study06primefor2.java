package Andrey.SelfStudy.Sgs01;

public class study06primefor2 {
    public static void main(String[] args) {
   boolean r=isPrime(2);
        System.out.println(r);

        //type a code to print number between 2 and 100
        for(int i=2;i<100;i++){
            if(isPrime(i)){
                System.out.print(i+", ");
            }

        }
    }
    public static Boolean isPrime(int num){
        int counter=0;
        if(num>1){
            for(int i=1;i<=num;i++){
                if(num%i==0) {
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
