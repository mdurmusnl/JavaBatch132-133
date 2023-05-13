package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int accountNumber;
    private int pinNumber;
    private double checkingBalance;
    private double savingBalance;
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
         Scanner input= new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
    private double calculateCheckingBalanceAfterWithdraw(double amount){  //method listemiz sismesin diye baska pakette lazim olmayacak diye private yapiyoruz
        checkingBalance-=amount;
        return checkingBalance;
    }

   private double calculateCheckingBalanceAfterDeposit(double amount){
        checkingBalance+=amount;
        return checkingBalance;
   }
   private double calculateSavingBalanceAfterWithdraw(double amount){
        savingBalance-=amount;
        return savingBalance;
   }
   private double calculateSavingBalanceAfterDeposit(double amount){
        savingBalance+=amount;
        return savingBalance;
   }
   // lets communicate with the customer and customize the methods
    public void getCheckingWithdraw(){
        displayCurrentAmount(checkingBalance);
        System.out.println("please enter the amount u want to withdraw");
        double amount=input.nextDouble();
          if(amount<=0){
              System.out.println("no zero or neagtive amount is witdrawn");
              getCheckingWithdraw();  //recursive method  acayip onemli   if user entered negative or zero then this code calls the method again .   it calls itself
          } else if(amount-checkingBalance<0){
              calculateCheckingBalanceAfterWithdraw(amount);// it means go get your money and reduce the checkingbalance
           displayCurrentAmount(checkingBalance);
          }else{
              System.out.println("insufficient balance ");
          }
    }
    //lets communicate with the customer to deposit money
    public void getCheckingDeposit(){   // no need to create parameter method bcs we communicate with the user
       displayCurrentAmount(checkingBalance);
        System.out.println("please enter the amount u will deposit");
        double amount= input.nextDouble();
         if(amount<=0){
             System.out.println("negatice or zero is not has no meaning of deposit"+ moneyFormat.format(checkingBalance));
             getCheckingDeposit();   //recursive method  this code takes us line86
         }else{
             calculateCheckingBalanceAfterDeposit(amount);
             displayCurrentAmount(checkingBalance);// lets print the remaining account after deposit
         }

    }

    //lets communicate with user for savingaccount
     public void getSavingWithdraw(){
        displayCurrentAmount(savingBalance);  //it prints the balance
         System.out.println("please enter the amount u will withdraw");
         double amount=input.nextDouble();
         if(amount<=0){
             System.out.println("negative or zero is not an amount to be withdrawn");
             getSavingWithdraw();//recurcive method
         }else if(amount-savingBalance<0){
          calculateSavingBalanceAfterWithdraw(amount);
             displayCurrentAmount(savingBalance);
         }else{
             System.out.println("insufficient balance");
         }
     }
   public void getSavingDeposit(){
        displayCurrentAmount(savingBalance);
       System.out.println("enter your amount you will deposit");
       double amount= input.nextDouble();
       if (amount<=0){
           System.out.println("zero or negative deposit is meaningless");
           getSavingDeposit();  //recursive method
       }else {
          calculateSavingBalanceAfterDeposit(amount);
           displayCurrentAmount(savingBalance);
       }

   }

    //lets create an method thats print the remaining balance instead of printing sout in every method
    public void displayCurrentAmount(double balance){   //a dynamic method can be called for checkingBalance and SavingBalance
        System.out.println("your remaining balance in your  account is"+ moneyFormat.format(balance));  //when we call the method we can place checkingBalance instead of balance
    }
    public void transferInCheckingAccount() {

        System.out.println("enter the amount u will transfer");
        int amount = input.nextInt();
        if (amount>0 &&amount < checkingBalance) {
            checkingBalance -= amount;
            savingBalance += amount;
        }else if(amount>checkingBalance){
            System.out.println("insufficient balance");
            transferInCheckingAccount();
        }
        else{
            System.out.println("invalid amount to transfer");
            transferInCheckingAccount();
            displayCurrentAmount(checkingBalance);
        }
    }
    public void transferInSavingAccount(){

        System.out.println("enter the amount u will transfer");
        int amount=input.nextInt();
        if(amount>0&&amount<savingBalance) {
            savingBalance -= amount;
            checkingBalance += amount;
        }else if(amount>savingBalance){
            System.out.println("insufficient balance");
            transferInSavingAccount();
        }else{
            System.out.println("invalid amounbt to transfer");
            transferInSavingAccount();
            displayCurrentAmount(savingBalance);
        }
    }

}
