package Batch132.JavaTeachingB132mrSuleyman.day10forloop;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {
       /*
      username is   admin    password is pwd123
      ask user to enter username and vpassword
      user should see  " enter your user name and password "  message
      if user enters correct credentials, he should get  you re in your account"  message
      otherwisr he should see " enter your username and password" message
      after 3 times he should get " your account is  blocked " message
              */
        Scanner input=new Scanner(System.in);
        int  counter=0;   //sayacagiz  hatali girisleri sayacagiz
        do{
            if(counter==4){
                System.out.println("your account is blocked");
                break;
            }
            System.out.println("please enter your username");  // incase of your input we want this massage repeat*******
            String userName= input.nextLine();
            System.out.println("please entr your paassword");
            String passWord = input.next();
            if(userName.equals("admin") && passWord.equals("psw123")){
                System.out.println("you re in your account");
                break;
  }else{
                System.out.println("your username or your password is wrong");
            }
            counter++;
        }while(true);






    }
}
