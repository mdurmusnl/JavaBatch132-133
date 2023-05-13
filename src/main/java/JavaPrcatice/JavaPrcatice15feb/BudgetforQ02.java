package JavaPrcatice.JavaPrcatice15feb;

public class BudgetforQ02 {
    public static int familyBudget;
    public int pocketMoney;
    public void getPocketMoney(int money){   //we get an amoount of money form the budget that decreases budget and increases pocketmoney
        if(familyBudget>=0) {
            familyBudget -= money;  //decrease the family budget
            pocketMoney += money;  //increase the pocket money
        }
    }
    public void  getSalary(int salary){  //if we increase the familybudget with the salary then every class meber get benefit means affected
        familyBudget+=salary;
    }
    public static void spendFamilyBudget(int money){
        familyBudget-=money;
    }
    public void spendPocketMoney(int money){
        pocketMoney-=money;
    }
}
