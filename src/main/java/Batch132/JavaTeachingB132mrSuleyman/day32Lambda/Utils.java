package Batch132.JavaTeachingB132mrSuleyman.day32Lambda;

public class Utils {
    //whenever we need some strings to be printed in the same line with space then type this code in a method and call it, and it does what is needed
    public static void printInTheSameLineWithSpace(Object s){   // if the parameter was String then the method does not wor k with integers
        System.out.print(s+" ");
    }
    public static int getSquare(int n){
        return n*n;
    }
}
