package practices02dt;
// prime 2,3,5,7,11,13,
public class study04 {
    public static void main(String[] args) {
        // type a code the check if a number is prime or not         6 ==>1,2,3,6   7=prime
   boolean r=isPrime(2);
        System.out.println(r);
        isPrime(20);
    }
    public static boolean isPrime(int num){  //num2

       int counter=0;
        if(num<=1){
           return false;
        }else{
            for(int i=2;i<num;i++){
                if(num%i==0){  //
                   counter++;
                }
            }
            if(counter>0){
                return false;
            }else{
                return true;
            }
        }
    }


}
