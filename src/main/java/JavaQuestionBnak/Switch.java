package JavaQuestionBnak;

import java.sql.SQLOutput;

public class Switch {
    public static void main(String[] args) {
   /*
   Use switch statement to print
a) "Winter" for December, January, February
b) "Spring" for March, April, May
c) "Summer" for June, July, August
d) "Fall" for September, October, November
e) "Invalid month name" for all the others
    */
        String monthName = "June";
        monthName = monthName.toLowerCase();
        switch(monthName) {
            case "december":
            case "january":
            case "february":
                System.out.println("Winter");
                break;
            default:
                System.out.println("invalid name of a month");
        }
/*
Print "Boy" if the gender is "Male" (Ignore cases)
Print "Girl" if the gender is "Female" (Ignore cases)
Print "Others" if the gender is different from "Male" and "Female"
 */
String gender="Male";
switch (gender.toLowerCase()){
    case "Male" :
        System.out.println("Male");
        break;
    case "Female":
        System.out.println("female");
             break;
    default:
        System.out.println("other");
}
/*
Type a code to display the number of days in a given month of a given year.
Example: The number of days in February of 2000 was 29.

 */
        int month = 2;
        int year = 2001;
        int numDays = 0;
        switch (month){
            case 1: case 3: case 5: case 7: case 8 : case 10 : case 12:
                System.out.println(numDays =31);
                break;
            case 2 :
                if((year%4==0&&year%100==0)||year%400==0){
                    System.out.println(numDays=29);
                }else{
                    System.out.println(numDays=28);
                    break;
                }

            case 4: case 6: case 9 : case 11:
                System.out.println(numDays=30);
                break;
            default:
                System.out.println("invalid month");
                break;
        }
        System.out.println("number of days "+numDays);
//ex6
        System.out.println();
        double a=10.2;
        double b= 5;
        String operator ="+";
        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println( );
        //ex7
        double mile = 10;
        double seconds = 7200;
        double fahrenheit = 83;
        String convertor = "fahrenheitToCelsius";

switch (convertor){
    case "fahrenheitToCelsius":
        System.out.println((fahrenheit-32)*5/9);
        break;
    case "mileToKm":
        System.out.println(mile*1.6+"km");
        break;
    case "secondstohours" :
        System.out.println(seconds/3600);
        break;
        default:
            System.out.println("invalid operation");
}
        System.out.println( );
//ex8
  String browser =Browsers.CHROME.toString();
  switch (browser){
      case "CHROME":
          System.out.println("i m using CHROME");
          break;
      case "SAFARI":
          System.out.println("i m using SAFARI");
          break;
      default:
  }
//ex9
        //easy
        //ez10



    }
    public enum Browsers{
        CHROME,SAFARI,IE,FIREFOX,YANDEX
    }
}
