package practices02dt;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class study01 {
    public static void main(String[] args) {
        int a=2;
        int b=5;
        int sum=0;
        sum=a+b;
        System.out.println(sum);
       addTwoInt(2,8);
   int summ=  addTwoInt(2,3,5);
        System.out.println(summ);  //10
        multiply(2,5);//10

    int ert=   addInt(2,4,5,4);
        System.out.println(ert);

    }
//no variable method
 public static void addTwoInt(int a,int b){
     System.out.println(a+b);
 }
 public static int addTwoInt(int a, int b, int c){
   return a+b+c;
 }

 public static void multiply(int a,int b){
     System.out.println(a*b);
 }
 public static int addInt(int ... v){  //v=3,4,5
   int sumV=0;
    for(int w:v){
        sumV+=w;
    }

    return sumV;
 }



}
