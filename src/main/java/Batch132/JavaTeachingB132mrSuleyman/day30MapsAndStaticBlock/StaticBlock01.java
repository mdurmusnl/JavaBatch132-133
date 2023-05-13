package Batch132.JavaTeachingB132mrSuleyman.day30MapsAndStaticBlock;

import java.time.LocalDate;

public class StaticBlock01 {
    /*
         1) other name of the " static variable" is class variable
              because"Java Class Loader" loads the static variables together with the class.
              so static variables are created when the class was created
         2) Non-static variables I mean Instance or Object variables are created when you create an Object
         3)to initialize "static variable" we have 2 options
                  i) initialize directly like this ==>  public static int price=10;
                  ii) initialize by using "Static Block"
                why do we need "Static block" to initialize a static variable??
         i)sometime to intiliaze a static variable we need to tpye codes and , every codes is not available to type out of method so we use static block to type code
   ***   ii)  static blocks are executed before everything in the class even before main method, bcs  static variables are loaded together with class
     4) There is non-static block=instance block as well as static block

     */
    public static int price;  // its created whne calss is created   bcs its calss variable
    public int year;  // when u crreate an object then java create a container fo this variable
    static {    //we initialized a static variable which varies to month   if its feb then price is 1000 otherwise price is 2000
        LocalDate d= LocalDate.now();  //date of today  2023-02-22
        if(d.getMonthValue()==2){
            price=1000;
        }else{
            price=2000;
        }
        System.out.println("i m static block");
    }
  //we dont have to put main method    we put it to see which runs first
   // public static void main(String[] args) {  //STATIC BLOCK IS EXECUTED BEFORE EVERYTHING EVEN BEFORE MAIN MATHOD BCS static things are created when class is created
     //   System.out.println(" i m MAN METHOD");
    //}
  public int age; // non-static variable= instance variable
    //non-static block =instance block
  {
      System.out.println(" i am non static block");
  }
 public StaticBlock01(){  //cdefault cont
     System.out.println("i m first cont");
 }
public StaticBlock01(int year){
    System.out.println("i m second const");
}

}
