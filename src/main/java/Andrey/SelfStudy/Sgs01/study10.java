package Andrey.SelfStudy.Sgs01;

public class study10 {
    public static void main(String[] args) {
       int x= getAbsolute(-5);
        System.out.println(x);
    }
    public static int getAbsolute(int num){
        if(num<0){
            return -1*num;
        }else{
            return num;
        }
    }
}
