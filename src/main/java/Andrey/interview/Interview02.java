package Andrey.interview;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Interview02 {
    public static void main(String[] args) {
        String date="09/20/2022";//type a code to print the month of the given date
        String datearr[] =date.split("/");
    //five    create a method that prints the sum of ascii values of characters of a string

//six   what makes a method different from another method
        //seven   why do we need method overloading in java

     //   for being well organised
        //ex eight     which method java pick  from the pic and why?

        //type code to get current date in your local area
        LocalDate myDate=  LocalDate.now();    //2023-03-13

        //ex type a code to get current time
        LocalTime myTime = LocalTime.now();  //21:03:45:


//ex 1 type code to print the name of the curent month
        //sout myDate.getMonth();   March

       //first    type a code to get the local time in Amsterdam
        System.out.println(LocalTime.now(ZoneId.of("America/Toronto")));//

        //in a flight ticket application ,which method do u use to notify a user in case he or she accidentaly place departure is later than arrival
           //for exaple user input 20june is going for a vocation and 18june is coming back to home

//second  create a method to add unknown number of integers, a method which is able to add sometimes five integers another time its able add 17 integers

  //third can we use another paramteter after varargs in a method
        //no bcs it will be unreachable parameter  bcs vararags are endless


        //ex  java has string class to create a string  java java provide StringBuilder class
        //answer   string class is immutable , when we need mutable strings then we create a string by  stringBuilder  or another way is assign
           ///immutable  can not be updated  but there is a way by assigning
//why is the reason we build constructor


        //four    how can u reverse  a string
        StringBuilder str= new StringBuilder("veli han");
        System.out.println("reverse   "+str.reverse());
        String a="ali can";
        String rev="";
        for(int i= a.length()-1;i>=0;i--){
            char ch =a.charAt(i);
            rev+=ch;
        }
        System.out.println(rev);
    }
    public static int getSumOfAscci(String s){
        int sum=0;
        for(int i=0;i<s.length();i++) {
            sum+=s.charAt(i);
        }
        return sum;
    }
    public static int add(int ... v){
        int sum=0;
        for (int w:v){
            sum+=w;
        }
        return sum;
    }
}
