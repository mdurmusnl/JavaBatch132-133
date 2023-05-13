package Andrey.fierro;

public class Exc {
    public static void main(String[] args) {
        //Create a method divides an integer converted from a String by 1 less than the number of characters of the String
        String s = "120";
        System.out.println(divide(s)); //NumberFormatException, NullPointerException,ArithmeticException

    }

    public static int divide(String s) {
        int a = s.length();
        int result=0;
        try {

            return result = Integer.valueOf(s) / (a - 1);

        } catch (NullPointerException e) {  //s=null

        } catch (ArithmeticException e) { //divisor is zero

        } catch (NumberFormatException e) {  //s= "12d"

        }
        return result;
    }
}