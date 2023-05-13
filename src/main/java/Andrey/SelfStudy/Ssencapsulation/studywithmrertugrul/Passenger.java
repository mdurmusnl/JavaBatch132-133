package Andrey.SelfStudy.Ssencapsulation.studywithmrertugrul;

import java.util.Scanner;

public class Passenger implements Itr {
     int tax;
    boolean politicalIssue;
    boolean visa;
  Passenger(){
      Scanner input= new Scanner(System.in);
      System.out.println("please input the amaount of tax u paid");
      this.tax=input.nextInt();
      System.out.println("do you have any political issue , yes or no");
     String pI=input.next();
     if(pI.equals("yes")){
         this.politicalIssue=true;
     }else{
         this.politicalIssue=false;
     }
      System.out.println("do u have a valid visa  yes or no");
     String v=input.next();
     if(v.equalsIgnoreCase("yes")){
         this.visa=true;
         System.out.println("true");
     }else{
         this.visa=false;
     }
  }


    @Override
    public boolean isGovermantTax() {
    if(this.tax<15){
        System.out.println("please go back pay the exact amount of 15e");
        return false;
    }else{
        return true;
    }
    }

    @Override
    public boolean isPoliticalIssue() {
 if(this.politicalIssue==true){
     System.out.println("you can not travel");
     return false;
 }else{
     return true;
 }
    }

    @Override
    public boolean isVisa() {
   if(this.visa==true){
       System.out.println("you have a visa");
       return true;
   }else{
       return false;
   }
    }
}
