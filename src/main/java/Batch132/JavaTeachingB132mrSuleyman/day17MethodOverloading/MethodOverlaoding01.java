package Batch132.JavaTeachingB132mrSuleyman.day17MethodOverloading;
//creating a method with same name in different parameters its called method overloading
//method name and method paramethers are called method signiture****
// chaniging the order of parameter also make the method overloaded
//in overloading , access modifiers, static or non static has no role
public class MethodOverlaoding01 {
    public static void main(String[] args) {

    }
    // create a method multiple two integers
    public static int mutiply(int a, int b){
return a*b;
    }
    //create  a method mutpliy an integer and a double
    public static double multiply(int a, double b){
        return a*b;
    }
    //create a method to mutiply three integers
    public static int multiply(int a,int b,int c){
        return a*b*c;
    }

}
