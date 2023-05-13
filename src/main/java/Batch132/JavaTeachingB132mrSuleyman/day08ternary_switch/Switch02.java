package Batch132.JavaTeachingB132mrSuleyman.day08ternary_switch;
//inside switch u can use  int  byte  short   char   string
//inside switch   u can not use long  float   double   boolean
//id u have a condition with boolean  or float or double data type u have to user if statemnet
import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
    /*
            If user enters 9 the code will print September, October, November, December
            If user enters 5 the code will print May, June, July, August, September, October, November, December
         */
        Scanner input= new Scanner(System.in);
        System.out.println("enter month number");
        byte monthNum= input.nextByte();
        switch (monthNum){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
        }
//Example 1: Create a simple calculator which does addition, subtraction, multiplication, division, percentage calculation
        System.out.println("enter the first number");
        double num1= input.nextDouble();
        System.out.println("enter second number");
        double num2= input.nextDouble();
        System.out.println("enter operation symbol such as +,-,*, /");
        char operationSign= input.next().charAt(0);
        switch (operationSign){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println("multiplication result is: "+(num1*num2));
                break;
            case '/':
                System.out.println("division result is: "+(num1/num2));
                break;
            case '%':   //mojulis degil   basit yuzde hesaplama oalrak kullaniliyor
                System.out.println("percentage result is: "+(num1*num2)/100);
                break;
            default:
                System.out.println("enter a valid operation");
        }



//Example 1:  Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain,
// Bulgaria, Albania, France"
//Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"
        System.out.println("enter a country name amaong \"America, England, Germany, Turkey, India, Peru, Spain,");
        String country= input.next().toLowerCase();
        switch (country){
            case "america":
                System.out.println("US");
            case "england":

        }



    }
}
