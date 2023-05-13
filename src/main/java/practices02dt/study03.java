package practices02dt;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class study03 {
    //type a code to get factorial of a number      3!=1*2*3  5!= 1*2*3*4*5
    public static void main(String[] args) {
     int f=  getFactorization();
        System.out.println(f);
    }

public static int getFactorization(){
    Scanner input=new Scanner(System.in);
    System.out.println("enter a positive integer");
    int num= input.nextInt();   //num=1
    int factorial=1;  //120
    while(num>0){
        factorial*=num;
        num--;
    }
   return factorial;
}

}
