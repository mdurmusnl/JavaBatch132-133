package JavaPrcatice.day28repeatExceptions;

public class E02 {
    public static void main(String[] args) {

    }
    //ex1   create a method to print users age   if the age is negative the age shouldnt be printed
   public static void printAge(int age) {    //throw new IllegalArgumenException handles the exception without try catch block
           if (age < 0) {
               throw new IllegalArgumentException("age can not be negative");// the messaage is optional to type in paranhesis
           } else {
               System.out.println(age);
           }
       }


}
