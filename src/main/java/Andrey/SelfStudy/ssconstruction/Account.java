package Andrey.SelfStudy.ssconstruction;

public class Account {
    public String accountNumber;
    public double balance;
    public String name;
    protected String phone;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(String accountNumber, double balance, String name, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.phone = phone;
    }
    public void depositMoney(double amount){
             balance+=amount;
        System.out.println("the new balance is : " + balance);
    }
    public double withdrawMoney(double amount ){
     if(balance>=amount){
      balance-=amount;
    }
        return balance;
}
}

