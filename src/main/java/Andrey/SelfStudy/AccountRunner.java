package Andrey.SelfStudy;

public class AccountRunner {
    public static void main(String[] args) {
    //Account account1= new Account();  //Account class default constructor...
        //if we want we can call each varible in the other construction in the smae class with the help of this() key word
        //go to Account class  type this() in the default constructor

       Account account1=new Account();  //now nothing prints but already created an account in the name of Angelina end other details
        System.out.println(account1.name);  //Angelina
        System.out.println(account1.balance);  //20.0

        Account account2= new Account("123455",2300,"TOM HANKS","346673");
        account2.depositMoney(600);
        System.out.println(account2.balance); //2900.0
        account2.withdrawMoney(3100);  //insufficient balance : 2900.0
        Account account3=new Account("344",350.0,"peter");  //in this contruction we skip the info about phone number
        System.out.println(account3.balance);  //350.0
        System.out.println(account3.phone);  // no info about phone
        System.out.println( account3.toString());
    }
}
