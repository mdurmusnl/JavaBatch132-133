package Batch132.JavaTeachingB132mrSuleyman.day27enumsandexceptions;

public class E01 {
    /*
       1) exception means unexpected issue in coding
       2)when we have an exception then we have 2ways
                i) we can handle the exception by using  "try- catch " block   // this is fixing the issue
               ii) we throw an exception and block the code (like atm machine of a bank ,if the user input his password incorrect then we shall block the work
     3) we handle the exception mostly, if you dont handle the exception
               i) execution will be stopped
               ii) application will be blocked
                     */
    public static void main(String[] args) {
        System.out.println(divide(8, 6));
        System.out.println(divide(8, 0));  // 	at day27enumsandexceptions.E01.main(E01.java:15)    it throws aritmetic exception   its   divide by zero    java tells it
        System.out.println("hi everyone");  //this code line will not be executed,  its like the tire is flat then u must fix it to move further
    }

    // ex   create a method divede two doubles
    public static int divide(int a, int b) {
        int result = 0;
        try {
            return a / b;       //  Exception in thread "main" java.lang.ArithmeticException: / by zero
          //  System.out.println("hi mustafa");    this is unreachable statement, the upper code is exception then java sttaight goes catch block
        } catch (ArithmeticException e) {   //ArithmeticExpection can handle any kind of aritmetic issue
            System.out.println("do not use zero as a divisor");  //if try block do not throw exception then jabva doesnt use catch block
        }
        return result;
    }
}
