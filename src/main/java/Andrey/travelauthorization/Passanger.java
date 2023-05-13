package Andrey.travelauthorization;

import java.util.Scanner;

public class Passanger implements InternationalTravelAuthorization{
    int tax;
    boolean isPoliticalIssue;
    boolean visa;
    Passanger(){
        Scanner input= new Scanner(System.in);
        System.out.println("please input the amaount of tax u paid");
        this.tax=input.nextInt();
        System.out.println("do you have any political issue , yes or no");
        String pI=input.next();
        if (pI.equals("yes")){
            this.isPoliticalIssue=true;
        }else{
            this.isPoliticalIssue=false;
        }
        System.out.println("do u have a visa yes or no");
        String v=input.next();
        if(v.equalsIgnoreCase("yes")){
            this.visa=true;
        }else{
            this.visa=false;
        }
    }
    @Override
    public boolean isGovermentTax() {
        if(this.tax<15){
            System.out.println("u have to pay 15e");
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean isPoloiticalIssue() {
         if(this.isPoliticalIssue==true){
             System.out.println("you have a travel ban");
             return false;
         }else{
             return true;
         }
    }

    @Override
    public boolean isVisa() {
        if (this.visa == true) {
            return true;
        } else {
            return false;
        }
    }


}
