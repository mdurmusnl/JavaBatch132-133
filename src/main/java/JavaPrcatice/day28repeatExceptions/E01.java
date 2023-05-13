package JavaPrcatice.day28repeatExceptions;

public class E01 {
    public static void main(String[] args) {
        String s1="240";
      System.out.println(divide(s1));
        String s2=null;
      System.out.println(divide(s2));  //throws .NumberFormatException
        String s3="ab23c";
       System.out.println(divide(s3)); // NumberFormatException
        String s4="2";   //length is one   but b-1=0
        System.out.println(divide(s4));  //ArithmeticException
    }
    //ex1  create a method that divides an integer converted from a string by the one less than the length of the string
    //1st way by multiple catch block
    public static int divide(String s) {
        int result=0;
        try {
            int a = Integer.valueOf(s);   //NumberFormatException is possible
            int b = s.length();   // NullPointerException is possible
            return result= a / (b - 1);   //  b-1=0 so  ArithmeticException is possible

        }catch (NumberFormatException e){
            System.out.println(" most probably u typed non digit characters"+ e.getMessage());
        }catch (NullPointerException e){
            System.out.println("most probably the string is null"+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("division by zero is not defined"+e.getMessage());
        }
        return result;
    }
    //2nd way  by single catch block
    public static int divide2(String s){
        int result=0;
        try {
            int a = Integer.valueOf(s);   //NumberFormatException is possible
            int b = s.length();   // NullPointerException is possible
            return result= a / (b - 1);   //  b-1=0 so  ArithmeticException is possible
        }catch (Exception e){
            System.out.println("an exception occured"+e.getMessage());
        }
        return result;
    }
    //3rs way   is one specific exceptionvlike ArithmeticException  and Exception
    // but ArithmeticException must be at top  and Exception down   other wise child exception will be useless unreachable code
}
