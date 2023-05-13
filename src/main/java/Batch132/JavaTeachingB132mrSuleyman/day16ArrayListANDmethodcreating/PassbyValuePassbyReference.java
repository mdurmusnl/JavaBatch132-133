package Batch132.JavaTeachingB132mrSuleyman.day16ArrayListANDmethodcreating;
// methods are active caharacteristic
// variables are passive characteristics
//passbyValue is done by jove with methods to protect the original value  to save the original value
// passbyvalue creates copy or original value   passbyreference create coppy of adress(reference
public class PassbyValuePassbyReference {
    public static void main(String[] args) {
        //saving orignal date we use passbyvalue  with method creation
     int shirtPrice= 100;
      studentShirtPrice(100,10); //90   //itself prints  bcs in the method we typed sout
                                                 // 100 is copy of original value   we save original value of 100
        System.out.println(shirtPrice);   //100
     String n= putExclamation("ali");   //it doesnt print bcs inside the method no sout    its just a value
        System.out.println(n);  // ali!
      double newSalary = increaseSalary(2000);  //its just a value  thats why assign it  store in a container
        System.out.println(newSalary); //2400
        int aaa= getAbsolute(-59);
        System.out.println(aaa);
    }

    public static void studentShirtPrice(int shirtPrice, int discount){  //void returns nothing  thats why we type sout in the method
          int discountedShirtPrice=shirtPrice-discount;
        System.out.println(discountedShirtPrice);

    }
    public static String putExclamation(String name){   //it returns a value
        return name+"!";
    }
    //create a method to increase the salary
    public static double increaseSalary(double salary){
        return salary*1.2;
    }
// create a method to get the absolute value of a given integer\
    public static int getAbsolute (int a) {
        if (a < 0) {
            return -1 * a;
        }else{
            return a;
        }
    }
}
