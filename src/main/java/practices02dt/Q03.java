package practices02dt;

import org.example.Main;

import java.io.DataOutputStream;

public class Q03 {
    public static void main(String[] args) {
         /*
    String shirtPrice= "$ 12.99";
    String bookPrice= "$ 35.99";
    Type code to find the sum of the shirt and book prices.
     */
// remove $ and space then conver string to double
        String shirtPrice= "$ 12.99";
        String bookPrice= "$ 35.99";
       String shirt= shirtPrice.replace("$ ","");
       String book= bookPrice.replace("$ ","");
      double sd=  Double.valueOf(shirt);
        double bd=Double.valueOf(book);
        System.out.println("total price is "+" "+(sd+bd));


    }
}
