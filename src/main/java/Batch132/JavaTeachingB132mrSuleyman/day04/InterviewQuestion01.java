package Batch132.JavaTeachingB132mrSuleyman.day04;

public class InterviewQuestion01 {
    public static void main(String[] args) {
       // example 1   type code to swap two integers
        // a=12  b=5      a = 5  b=12
        int a= 12, b=5;
        int temp =0;
        temp =a;
        a = b;
        b= temp;
        System.out.println(a+" "+b);

//2nd way, without usuing a 3rd temp variable
        a=a+b;
        b=a-b;  //here a=17 b=5
        a=a-b;


    }
}
