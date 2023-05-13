package Andrey.SelfStudy.Sgs01;

public class study11 {
    public static void main(String[] args) {
       greetings();
       //discount 10e
        // 10%
        double a= discoutShirt(100,10);
        System.out.println(a);
        String s="Tom Hanks";
          s=   s.toLowerCase().substring(0,1);
         int aa= getAbsolute(-9);
        System.out.println(aa);
        System.out.println(getAbsolute(-9));
    }
    public static void greetings(){
        System.out.println("hello");
        System.out.println("success");
    }
    //type a code to make a discount in a shirt prince
    public static double discoutShirt(double shirtPrice,double discount){
        return shirtPrice-discount;
    }
    // type a code to get Absolute value of an integer
     public static int getAbsolute(int num){
        if(num<0){
            return -1*num;
        }else{
            return num;
        }
     }



}
