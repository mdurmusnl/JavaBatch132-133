package Batch132.JavaTeachingB132mrSuleyman.day28Exceptions;

public class E03 {
    /*
       1) finally blcok is used to execute to some codes under every condtion
       2) finally block can be used with try- catch ot  just with "try"
       3) try block can not be used alone (try   then u must complete the task or sentence  say smt  after try)
          "try block " can be sued with    I)single catch ii)multiple catch
                                          iii)single catch and finally block
                                          iv0 multiple cath and finally
                                           v) finally block only
   4) finally block can be used once , no repetation consecutively
   interview question
   explain final, finally and finalize  key words
   finalize is a process java does before throwing unused things from memory to trash
   finaly ...
     */
    public static void main(String[] args) {
        System.out.println(divide(6,2));
    }
    //ex1  create a method to do division ,  the metho should print "the mission is completed"  even exception thrown or not
    public static int divide(int a, int b){
      int result=0;
      try{
          return a/b;
      }catch (ArithmeticException e){
            System.out.println(e.getMessage());

        }finally {
          System.out.println("the mission is completed");   // it works in every condition  exception is thrown or not  finally block always work
      }
      return result;
    }



}
