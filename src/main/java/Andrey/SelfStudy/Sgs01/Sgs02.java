package Andrey.SelfStudy.Sgs01;

public class Sgs02 {
    public static void main(String[] args) {
        // type a code to find addition of 2 integers
        int a=2;
        int b=4;
        int sum =a+b;
        System.out.println(sum);
        addTwoInt(2,3); //return //nothing
        addTwoInt(2,3,4);// return number
        int v=addInt(2,3,4,5,6);
        System.out.println(v);
    }
    public static void addTwoInt(int a,int b){

    }
    public static int addTwoInt(int a, int b,int c){
        return a+b+c;

    }
    public static int addInt(int ... v){
        int sum=0;
        for(int w:v){
            sum+=w;
        }
        return sum;
    }


}
