package Andrey.SelfStudy.Sgs01;

public class study05 {
    public static void main(String[] args) {
        boolean R=isPrime(2);
        System.out.println(R);
    }
    public static boolean isPrime (int num){
        int counter=0;
        if(num<2){
            return false;
        }else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    counter++;
                }
            }
            if(counter==0){
                return true;
            }else{
                return false;
            }
        }

    }

}
