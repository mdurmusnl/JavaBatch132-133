package practices02dt;

import java.util.Random;
import java.util.Scanner;

public class calismaa {


    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
     Random random=new Random();
      System.out.println("enter your id");
       String ssn=input.next();
      String a=ssn.replaceAll("[^0-9]","");
       System.out.println(a);
        if(a.length()==11){
           int ticketnumber= random.nextInt(100);
           System.out.println(ticketnumber);
       }else{
           System.out.println("please input only digits");
       }


        System.out.println("enter number of row");
       int row=input.nextInt();
         for(int i=0;i<=row;i++){
             for(int j=0;j<=i;j++){
                 System.out.print(j);
             }
             System.out.println();
         }










    }
}
