package Batch132.JavaTeachingB132mrSuleyman.day07ifstatementternarystatement;

//ternary does same as if  just the synetex is different
public class Ternary01 {
    public static void main(String[] args) {
        //Example 1   type a code to check if a number is even or not by usung ternary
        int num = 8;
        //1st way
        if(num%2==0){ System.out.println("even"); } else{System.out.println("odd");}
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        //2nd way     ternary
        //1st type condition then put? and then the code will be executed for true condtion
        // //space and ?   it means asking is it true
        String result=num%2==0 ? "even":"odd";
        System.out.println(result);
        //Example 2: Type code to check if a number has 3 digits or not, use ternary
       int n= 143;   //it works
        //  int a =-143   the above code doesnt work
        //so make absolute value
         n=Math.abs(n);
      String result1= n>99 && n<1000 ? "3 digits":"not 3 digits";
        System.out.println(result1);

    }
}
