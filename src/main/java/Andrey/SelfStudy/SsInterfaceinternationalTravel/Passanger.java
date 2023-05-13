package Andrey.SelfStudy.SsInterfaceinternationalTravel;

import java.util.Scanner;

public class Passanger implements InternatiolTravelRules {
    private int tax;
    private boolean politicalIssue;
    private boolean visa;
    public  Passanger(){
        Scanner input= new Scanner(System.in);
        System.out.println("please input the amount of tax u paid");
        this.tax=input.nextInt();
        System.out.println("do you have any  politialIssue condition,  yes or no?");
        String pI=input.next();   //pI   politicalIssue
        if(pI.equals("yes")){
            this.politicalIssue=true;
        }else{
            this.politicalIssue=false;
        }
        System.out.println("do u have a valid visa for the country u will travel  yes or no?");
        String v= input.next();
        if(v.equals("yes")){
            this.visa=true;
        }else{
            this.visa=false;
        }
    }
    @Override
    public boolean isGovermentTax() {
    if(this.tax<15){
        System.out.println("please pay the exact amount of 15e");
        return false;
    }else{
        System.out.println("your have completed the tax payment part ");
        return true;
    }}
    @Override
    public boolean isGoloiticalIssue() {
        if(this.politicalIssue==true){
            System.out.println("you have an internation travel ban due to your politicalIssue");
            return false;
        }else{
            System.out.println("you have no international travel ban");
            return true;
        }}
    @Override
    public boolean isVisa() {
        if(this.visa==true){
            System.out.println("you have a valied visa for the country u travel");
            return true;
        }else{
            System.out.println("you have no valid visa ");
            return false;
        }
    }
}
