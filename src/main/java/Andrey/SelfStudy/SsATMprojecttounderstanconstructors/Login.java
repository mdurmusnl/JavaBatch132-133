package Andrey.SelfStudy.SsATMprojecttounderstanconstructors;

import java.util.Scanner;

public class Login {
    public boolean  login(Account account){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a user name");
        String userName= input.nextLine();
        System.out.println("enter your password");
        int password= input.nextInt();
     if(account.getUserName().equals(userName)&&account.getPassword().equals(password)){
         return true;
     }else{
         return false;
     }
    }

}
