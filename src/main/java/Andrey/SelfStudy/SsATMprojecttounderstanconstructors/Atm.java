package Andrey.SelfStudy.SsATMprojecttounderstanconstructors;

import java.util.Scanner;

public class Atm {
    public void generate(Account account){
        Login login1= new Login();
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to BANK ING");
        System.out.println("user login");
        int numberOfLogin=3;
        while (true){
            if(login1.login(account)){
                System.out.println("welcome");
                break;
            }else{
                System.out.println("unsuccesfull");
                numberOfLogin--;
                System.out.println("num of login availabe is "+numberOfLogin);
            }
            if(numberOfLogin==0){
                System.out.println("exit");
                return;
            }
        }
        System.out.println("******");
        String operatoins="1. Display the Balance\n" +
                "2.Deposit Money\n" +
                "3. Wirthdraw Money \n" +
                "4. wuit witg q  ";
        System.out.println(operatoins);
        while (true){
            System.out.println("enter an operation");
            String operation=input.nextLine();
              if(operation.equalsIgnoreCase("q")){
                  break;
              }
              else if(operation.equalsIgnoreCase("1")){
                  System.out.println(account.getBalance());
              }
              else if(operation.equalsIgnoreCase("2")){
                  System.out.println("please enter the amount u want to deposit");
                  int amount =input.nextInt();
                       input.hasNextLine();
                      account.depositMoney(amount);
              } else if (operation.equals("3")) {
                  System.out.println("enter the amount u want to withdraw");
                  int amount =input.nextInt();
                  account.withdrawMoney(amount);
              }else{
                  System.out.println("invalid operation");
              }
        }

    }
}
