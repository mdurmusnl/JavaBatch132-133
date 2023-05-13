package Andrey.travelauthorization;

public class PassangerRunner {
    public static void main(String[] args) {
        System.out.println("welcome to Frankfurt Airport");
        String conditionOfInternationTravel = "15e tax must be paid, no political issue, u must have a valid visa";
        String warning = "each condtion must be provided for abroad travel";
        while (true){
            System.out.println(conditionOfInternationTravel);
            Passanger p1= new Passanger();

            if(p1.isGovermentTax()==false){
                System.out.println(warning);
                continue;
            }

            if(p1.isPoloiticalIssue()==false){
                System.out.println(warning);
                continue;
            }

            if(p1.isVisa()==false){
                System.out.println(warning);
                continue;
            }
            System.out.println("have a nice journey");
            break;
        }

    }
}
