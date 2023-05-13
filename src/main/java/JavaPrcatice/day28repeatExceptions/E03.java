package JavaPrcatice.day28repeatExceptions;

public class E03 {
    public static void main(String[] args) {

    }
    //create a method to do division   the method should print " the mmission is completed even an exception is thrown
       public static int division(int a,int b){
        int result=0;
              try{
                  result=a/b;
              }catch (ArithmeticException e){
                  System.out.println("divisor must be non zero "+e.getMessage());
              }finally {
                  System.out.println("the mission is completed");
              }
              return result;
       }

}
