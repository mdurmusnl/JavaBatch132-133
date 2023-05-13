package Andrey.SelfStudy.ssconstruction;



public class AccountRunner {
    public static void main(String[] args) {
        Account account1= new Account("123",230.0);
        System.out.println(account1.accountNumber);//123
        System.out.println(account1.name);
        System.out.println(account1.phone);
      account1.depositMoney(200); //the new balance is : 430.0
        System.out.println(account1.withdrawMoney(10)); //420
    }
}
