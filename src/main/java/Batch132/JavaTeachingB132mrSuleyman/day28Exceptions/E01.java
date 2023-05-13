package Batch132.JavaTeachingB132mrSuleyman.day28Exceptions;

public class E01 {
    /*
       1) to handle multiple exceptions u can use multiple catch blocks or single catch block
       2) if u prefer to use single catch block then use "Exception" in catch method parenthesis
       3) when u use multiple catch blocks the order of the catch block is not mTatter  if and only if  the exception class do not have
                                                 parent class relationship among them if there is child parent relation  the child must be first
     */
    public static void main(String[] args) {
        String s1="240";
       // System.out.println(divideByNumOfChar(s1)); //240/3=80   no error at all
        String s2=null;
     //  System.out.println(divideByNumOfChar(s2));//  NullPointerException
        String s3="2a40c";
       //System.out.println(divideByNumOfChar(s3));//   NumberFormatException
        String s4="2";
       System.out.println(divideByNumOfChar(s4));//  N ArithmeticException
        System.out.println("******");
        //lets work with second methosd    dividebynmuof char2 method
  //      String s5="240";
         System.out.println(divideByNumOfChar2(s1)); //240/3=80   no error at all
        String s6=null;
     //   System.out.println(divideByNumOfChar2(s2));//  NullPointerException
        String s7="2a40c";
        System.out.println(divideByNumOfChar2(s3));//   NumberFormatException
        String s8="2";
       // System.out.println(divideByNumOfChar2(s4));//  N ArithmeticException

    }
    // ex1 : create a method divides an integer converted from a string by the one less than thenumber of characters of the string
         // for ex    String s =" 240"  -->   240/3
    //first convert into integer then get number of character then divide
    public static int divideByNumOfChar(String s) {  //we have 3 possible exception can occur
        int result =0;
        try {
            int numOfChar = s.length();   // NullPointerException
            int num = Integer.valueOf(s);  // NumberFormatException
          result=num / (numOfChar - 1);     // ArithmeticException
        }catch ( NullPointerException e){
            System.out.println(" most probably the string is null");// non tecnical mesaage
            System.out.println(e.getMessage());   // tecnical messAGE
        }catch ( NumberFormatException e){
            System.out.println("most probably the string contains non digit caharacters");
            System.out.println(e.getMessage());// tecnical mesaage
        }catch ( ArithmeticException e){
            System.out.println("most prpbablt the divisor is zero");
            System.out.println(e.getMessage());  //
        }
        return result;
    }
//2nd way   how to handle multuple exceptions by using just a single catch block
    public static int divideByNumOfChar2(String s){
        int result=0;
        try{
            int numOfChar = s.length();   // NullPointerException
            int num = Integer.valueOf(s);  // NumberFormatException
            result=num / (numOfChar - 1);     // ArithmeticException
        }catch (Exception e){
            System.out.println("an exception occured");   //nontecnical
            System.out.println(e.getMessage()); // tecnical message
        }
        return result;
    }
    //3rd way   how to handle multuple exceptions by using just a  catch block and Exception class catch block
    public static int divideByNumOfChar3(String s){
        int result=0;
        try{
            int numOfChar = s.length();   // NullPointerException
            int num = Integer.valueOf(s);  // NumberFormatException
            result=num / (numOfChar - 1);     // ArithmeticException
        } catch (ArithmeticException e){                                         //  child class expection must be typed first
            System.out.println("there is arithemtic eror");   //nontecnical
            System.out.println(e.getMessage()); // tecnical message
        }
        catch (Exception e){
            System.out.println("an exception occured");   //nontecnical
            System.out.println(e.getMessage()); // tecnical message
        }
        return result;
    }
}
