package Andrey.SelfStudy;

public class Account {
    public String accountNumber;
    public double balance;
    public String name;  //default access modifier
    protected String phone;
    public Account(){
        this("1234",20.0,"Angelina","1324"); // in account1 object creation this() key word calls the other construction ehich is with patameters
      //  System.out.println("Account class default constructor...");
    }
    public  void depositMoney(double amount){
        balance +=amount;
    }

    public  void withdrawMoney(double amount){
       if(amount>1500){
           System.out.println("daily limit exceeding ");
       }
       if(balance-amount<0){
           System.out.println("insufficient balance : "+ balance);
       }else{
           balance-=amount;
           System.out.println("ney balance is " +balance);
       }
    }

    public Account(String accountNumber, double balance, String name, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.phone = phone;
    }

    public Account(String accountNumber, double balance, String name) {
      /*  this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;  */   // instead of this syntax
        this(accountNumber,balance,name,"no info about phone");
    }

    @Override
    public String toString() {   //a method to get full detail of any obcet created
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
