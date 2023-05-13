package Andrey.SelfStudy.Sgs01;

public class study13 {
    public static void main(String[] args) {
        //type a code to find gcf of two integer
        //   gcf(12,18) =6      factor=divisor
      int result=  getGcf(12,18);
        System.out.println(result);//6
    }

    public static int getGcf(int num1,int num2){  //12  18
        int gfc=1;
       int smallest= Math.min(num1,num2);
        for(int i=1;i<=smallest  ; i++){
            if(num1%i==0&& num2%i==0){
               gfc=i;
            }
        }
        return gfc;
    }
}
