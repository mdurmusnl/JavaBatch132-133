package JavaPrcatice.JavaPrcatice15feb.interfacecalculatesalary;

public class CalculateIncome implements Tax,IncreaseSalary{{

}

    @Override
    public double exrtaForYear(int workingYear) {
        return 100*workingYear;
    }

    @Override
    public double extraForHour(int workingHour) {
        return 10*(workingHour-160);
    }

    @Override
    public double tax(double grossSalary, int workingYear) {
    if(workingYear>=10){
        return grossSalary*0.3;
    }else{
        return grossSalary*0.2;
    }
    }

    public double  netIncome(double grosSalary,int workingYear,int workingHour){
       return grosSalary+exrtaForYear(workingYear)+extraForHour(workingHour)-tax(grosSalary,workingYear);
    }
}
