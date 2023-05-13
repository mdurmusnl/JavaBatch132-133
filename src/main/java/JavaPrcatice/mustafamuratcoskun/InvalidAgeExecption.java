package JavaPrcatice.mustafamuratcoskun;

import java.util.Arrays;
import java.util.Scanner;

public class InvalidAgeExecption extends ArithmeticException{
    public InvalidAgeExecption(String message) {
  super(message);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age");
        int age=scanner.nextInt();
       try {
            ageControl(age);  //java could figure out the exception  if we dont handle than java will give run time error  bcs the class extend an execption
        }catch (InvalidAgeExecption e){
           System.out.println("age is no ok");
           e.printStackTrace();
       }
    }
 public static void ageControl(int age){
        if(age<18){
            throw new InvalidAgeExecption("not a valid age");
        }else{
            System.out.println("age is ok");
        }
 }

    @Override
    public void printStackTrace() {
        System.out.println("invalid age exception is overriden");
    }
}
