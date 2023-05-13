package mry_small_project.login;

import java.util.Scanner;

public class LoginMain {
     /*
        Project:       design a webpage where a user can register and log in
        menu:          display the menu for user to choose an operation
        registration: get name , username and email and a password from a user
                            store the user name email and the password in a list
                            dublicated username or dublicated email is not allowed
        Login :      user inputs his/her email or username  and password
                          if  username or email is not exist , display a notifitaction "this user is not exist please register"
                          if username and emmail are both exist and the password matches then let the user access the webpage
       email validstion  : no space
                           must contain @
                           must ends with gmail.com or hotmail.com
                           lower case or upper case letter or a digit or the symbols  (- . _) are allowed to use before @notation
      password validation   : no space
                             min 6 characters
                             must have at least one lower case letter
                             must have at least one upper case letter
                             must have at least a digit
                             must have at least a symbol

         */

    public static void main(String[] args) {

start();


    }
    public static void start(){
        Scanner input =new Scanner(System.in);
        UserService userservice = new UserService();
        int select;
        do{
            userservice.showMenu();
            select=input.nextInt();
            switch (select){
                case 1:
                    userservice.register();
                    break;
                case 2:
                    userservice.login();
                    break;
                case 3:
                    System.out.println("have a lovely day see you again");
                    break;
                default:
                    System.out.println("unsuccessful  log in , please try again");
            }

        }while(select!=3);   //it means do-while loop will keep running until user input 3,  if user enter 3 then java will break the loop



    }
}
