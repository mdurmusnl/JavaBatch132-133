package JavaPrcatice.mustafamuratcoskun;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ThrowKeyWord {
    public static void ageControl(int age) {
        if(age<18){
            System.out.println("no entrance");
            throw new IllegalArgumentException("you re not allowed to enter the place");

        }else{
            System.out.println("welcome");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age");
        int age =scanner.nextInt();
       try{
               ageControl(age);
       }catch (IllegalArgumentException e){
           System.out.println(" age less than 18 is not allowed");
           System.out.println(e.getMessage());
       }

        System.out.println("hello"); // even if the method ageControl(17) throw exception  java execute this code  bcs we catched the exception

    }
}
