package JavaPrcatice.JavaPrcatice15feb.interfacecalculatesalary;

public class Runner {
     // type code to calculate net salary (use interface)
    //salary criteria:  increase gross salary by 100e each year based on the employees totsl years of employment
    //                 increase gross salary by 10 for every hour over 160 hours based on the employees mothly working hours
    //               deduct 30% tax from the salaries of employees with 10 or more working years and 20%from others
     public static void main(String[] args) {
         CalculateSalary cs=new CalculateSalary();
        double NetSalaryOfJohn= cs.netSalary(5000,2,200);
         System.out.println(NetSalaryOfJohn);
         System.out.println("******");
         CalculateIncome albert= new CalculateIncome();
         double incomeOfAlbert= albert.netIncome(5000,2,200);
         System.out.println(incomeOfAlbert);

     }
}
