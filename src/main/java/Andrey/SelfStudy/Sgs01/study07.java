package Andrey.SelfStudy.Sgs01;

public class study07 {
    public static void main(String[] args) {
   //type a code to find the gfc of two int
        int result=findFcf(12,24);
        System.out.println(result);
    }
    public static int findFcf(int num1,int num2){
        int gfc=1;
        int smallest =Math.min(num1,num2);
        for(int i=1;i<=smallest;i++){
            if(num1%i==0&& num2%i==0){
                gfc=i;
            }
        }
        return gfc;
    }
}
