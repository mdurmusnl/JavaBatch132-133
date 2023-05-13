package JavaPrcatice.JavaPrcatice15feb.interfacecalculatesalary;

public class CalculateSalary implements Tax,IncreaseSalary{

    @Override
    public double exrtaForYear(int workingYear) {
        System.out.println("extra money for working years"+ workingYear*100);
        return 100*workingYear;
    }

    @Override
    public double extraForHour(int workingHour) {
        if (workingHour > 160) {
            System.out.println("extra money for working hours"+10 *(workingHour - 160));
            return 10 *(workingHour - 160);
        }else{
            System.out.println("no extra money");
            return 0;
        }
    }

    @Override
    public double tax(double grossSalary, int workingYear) {
    if(workingYear>=10){
        System.out.println("tax:"+grossSalary*0.3);
        return grossSalary*0.3;
    }else{
        System.out.println("tax"+grossSalary*0.2);
        return grossSalary*0.2;
    }
    }
    public double netSalary(double grossSalary,int workingYear,int workingHour){  // this method is gonna call other methods
        return grossSalary+exrtaForYear(workingYear)+extraForHour(workingHour)-tax(grossSalary,workingYear);
    }
}
