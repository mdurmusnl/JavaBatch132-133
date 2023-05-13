package atmproject;

import org.w3c.dom.ls.LSOutput;

import javax.swing.text.html.Option;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account {
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
    boolean flag= true;
    //lets create a HashMap to store accountNumber(unique) and pinNumber of user in a DataBase
     HashMap <Integer,Integer> data= new HashMap<>();

    public void login(){
        System.out.println("welcome ome to ATM ");
        int counterSecurty=0;
        do{
            data.put(12345,123);
            data.put(23456,234);
            data.put(34567,345);
            try {
                System.out.println("please enter your accountNumber");
                setAccountNumber(input.nextInt());
                System.out.println("enter your pin number");
                setPinNumber(input.nextInt());
            }catch (Exception e){
                System.out.println("please enter only digit charachters, or exit with Q");
                input.nextLine();  //input isleminde alt satira gecmek icin   nextInt() den sonra next() islemi karismasin diye
                String exit = input.next();
                   if(exit.equalsIgnoreCase("q")){
                       flag =false;
                   }
            }
            int counter=0;
            for (Map.Entry<Integer,Integer> w:data.entrySet()){   //data.entrySet() returns a Set and w go through on it
                 if(w.getKey().equals(getAccountNumber())&& w.getValue().equals(getPinNumber())){
                     getAccountTypes();  //go to account choosing and doing operations
                 }else{
                     counter++;
                 }
            }
            if(counter==data.size()){
                counterSecurty++;
                System.out.println("wrong password or wrong account number");
                System.out.println("press any key to continue or press q to exit");
                String exit=input.next();
                if(exit.equalsIgnoreCase("q")){
                    flag=false;
                }
            }

            if(counterSecurty==3){
                System.out.println("incorrect try and the account has been suspended");
                flag=false;
            }
        }while(flag);
    }
    Scanner input =new Scanner(System.in);
    //operations on checkingAccount
    public void checkingOprations(){
        //do while loop ile musteri diledigi gibi islemler uzerinde gezinebilecek exit demedigi surece
        do{
        displayMessage();
        int option=input.nextInt();
     if(option==4){
         break;
     }
     switch (option){
         case 1:
             System.out.println("your checking account balance is"+moneyFormat.format(getCheckingBalance()));
             break;
         case 2:
             getCheckingWithdraw();  //it is filtered full performance method
             break;
         case 3:
             getCheckingDeposit();
             break;
         case 5:
             transferInCheckingAccount();
             break;
         default:
             System.out.println("invalid option please choose an option 1-4");
             break;
     }

    }while (true);
        getAccountTypes();// // it is for user to choose an account type after he i done with operations in checking account,  maybe we wants t oswift to another account of him
}
    public void savingOperations(){
        do{
            displayMessage();
            int option = input.nextInt();
            if(option==4){
                break;
            }
            switch (option){
                case 1:
                    System.out.println("your saving accunt balance is "+moneyFormat.format(getSavingBalance()));
                    break;
                case 2:
                    getSavingWithdraw();
                    break;
                case 3:
                    getSavingDeposit();
                    break;
                case 5:
                    transferInSavingAccount();
                    break;
                default:
                    System.out.println("invalid option");
            }
        }while (true);
        getAccountTypes();  // its for user to choose an account type after he id done with operations in saving account
    }

    //lets create a method to let the user chose an account
    public void getAccountTypes(){
        System.out.println("please choose the account you would like to operate with ");
        System.out.println("1: checking Account");
        System.out.println("2: saving Account");
        System.out.println("3: quit");
        int typeOfAccount= input.nextInt();
        switch (typeOfAccount){
            case 1:
                System.out.println("your checking account is active in use");
                checkingOprations();
                break;
            case 2:
                System.out.println(" your saving account is avtice in use");
                savingOperations();
                break;
            case 3:
                System.out.println("thank u  you for using out bank");
                flag =false;
            default:
                System.out.println("invalid type ");
        }

    }


    //kullanici icin islem secenekleriini surekli yazmayalim diye bu silemleri method ile cagiracagiz her defasinda
 public void displayMessage(){
     System.out.println("choose an option");
     System.out.println("1: view balance");
     System.out.println("2: withdraw ");
     System.out.println("3: deposit");
     System.out.println("4: quit");
     System.out.println("5: tranfer ");
 }

}
