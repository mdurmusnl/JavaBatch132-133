package Andrey.SelfStudy.Ssencapsulation.studywithmrertugrul;

public class PassangerRunner {
    public static void main(String[] args) {

        System.out.println("welcome to Frankfurt Airport");
        String conditionOfInternationTravel = "15e tax must be paid, no political issue, u must have a valid visa";
        String warning = "each condtion must be provided for abroad travel";
        while (true) {
            System.out.println(conditionOfInternationTravel);
            Passenger p1 = new Passenger();

            if (p1.isGovermantTax() == false) {
                System.out.println(warning);
                continue;
            }

            if (p1.isPoliticalIssue() == false) {
                System.out.println(warning);
                continue;
            }
            if (p1.isVisa() == false) {
                System.out.println(warning);
                continue;
            }
            System.out.println("sysetem check for visa");
            break;
        }
        System.out.println("you provided all conditons  u re free to fly, safe journey...");
    }
}



