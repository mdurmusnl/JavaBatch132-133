package Batch132.JavaTeachingB132mrSuleyman.day21Inheritance;

public class VehicleRunner {
    public static void main(String[] args) {
        Civic myCivic=new Civic();// when this run then it work all const in each parent classes first grand parent class const
                         // vehicle constructor
                        //Honda constructor
                        //civic constructor
       myCivic.move();
       myCivic.engine();
      myCivic.ecoSystem();

        int hashcode=myCivic.hashCode();  //default method in Object class
        String a=myCivic.toString(); // defauly method exist in java crreated by java in object class
//1.11/13 is important
        Civic myCivic2=new Civic(true);  // this another constructor with boolean parameter
        //*** inside Ciciv(boolen hybrid) method there is super() at the top of code blog anf it runs first and
        //it goes one upper class and find nonparamter construtor bcs super is non paramter   again in the upper class conts  there is super and it runs first and goes one upper class cont
      // Civic myCivic4=new Civic();
    }
}
