package JavaPrcatice.JavaPrcatice15feb;
  //STATIC KEY WORD
public class Q02 {
    //type a basic home budget
    public static void main(String[] args) {
      BudgetforQ02 father= new BudgetforQ02();
      //first father should get salary
      father.getSalary(2000);
father.getPocketMoney(300);
     System.out.println(father.pocketMoney);
      System.out.println(BudgetforQ02.familyBudget);
      System.out.println("father = " + father.pocketMoney);

       BudgetforQ02 mother= new BudgetforQ02();
       mother.getPocketMoney(400);
      System.out.println(BudgetforQ02.familyBudget);


    }
}
