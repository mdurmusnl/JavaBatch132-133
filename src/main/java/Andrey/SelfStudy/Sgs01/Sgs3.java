package Andrey.SelfStudy.Sgs01;

import java.util.Scanner;

public class Sgs3 {
    public static void main(String[] args) {
        greetings();
        greetings();
        getFactorial();
    }
    public static void greetings(){ //no parameter
        System.out.println("hi everyone welcome to this tutorial");
        System.out.println("each teaching lasts 40min");
    }
    public static void getFactorial(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a positive integer");
        int number=input.nextInt();
        int factorial =1;
        while(number>0){
            factorial*=number;
            number--;
        }
        System.out.println(factorial);

    }
}
