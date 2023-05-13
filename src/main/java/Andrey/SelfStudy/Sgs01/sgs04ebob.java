package Andrey.SelfStudy.Sgs01;

public class sgs04ebob {
    public static void main(String[] args) {
        int gcf= findGcf(12,18);
        System.out.println("gcf is"+gcf);
    }
    public static int findGcf(int a, int b){
        int gcf=1;
        int smaller=Math.min(a,b);
        for(int i=1;i<smaller;i++){
            if(a%i==0 && b%i==0){
                gcf=i;
            }
        }
        return gcf;
    }


}
