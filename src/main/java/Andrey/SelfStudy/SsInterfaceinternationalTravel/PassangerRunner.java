package Andrey.SelfStudy.SsInterfaceinternationalTravel;

public class PassangerRunner {
    public static void main(String[] args) {
        System.out.println("welcome to Schipol Airport");
        String conditionsOfInternationalTravel="15e tax must be paid, no politicalIssue ,valid visa";
        String warning ="each condition must be provided to have an internationl travel";
        while(true){
            System.out.println(conditionsOfInternationalTravel);
            Passanger newPassanger= new Passanger();
            System.out.println("check for tax");
         if(newPassanger.isGovermentTax()==false){
             System.out.println(warning);
             continue;
         }
            System.out.println("check for politicalIssue");
            System.out.println("");
        if(newPassanger.isGoloiticalIssue()==false){
            System.out.println(warning);
            continue;
        }
            System.out.println("check for visa");
        if(newPassanger.isVisa()==false){
            System.out.println(warning);
            continue;
        }
            System.out.println("each condtion is proveded and u re granted to travel abroad");
        break;
        }
    }
}
