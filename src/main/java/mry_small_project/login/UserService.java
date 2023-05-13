package mry_small_project.login;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class UserService {  //we will have the methods to be called
   List<String > usernameList= new ArrayList<>();
   List<String > emailList= new ArrayList<>();
   List<String > passwordList= new ArrayList<>();
public void showMenu(){ // i can not access this non ststic method in main method
                // but i can create a static method in main class(LoginMain) and i can access this showMenu with an object
    System.out.println("welcome to TechProEd");
    System.out.println("1- register");
    System.out.println("2- log in");
    System.out.println("3- log out");
    System.out.println("your choice is : ");
}
public void register(){
    Scanner input =new Scanner(System.in);
    System.out.println("please enter your full name");
    String name= input.nextLine();

    String username;  //only one condtion   that should be unique
    boolean isExistUsername;
    do{
        System.out.println("please input your username");
        username=input.nextLine();
              isExistUsername=usernameList.contains(username);   //ifit s false then java breaks the loop
              if(isExistUsername){
                  System.out.println("this username is being used, please try a new username");
              }
    }while(isExistUsername);   //if isExistUsername is true this d0-while will keep running

    String email;  //we have 2 major conditions to check
    boolean isValidEmail;   //some requirements to be matched  ,,we will validate the input email by a specific method
    boolean isExistEmail;   //unique
    do{
        System.out.println("please input your email");
        email=input.nextLine().trim();
        isValidEmail=validateEmail(email);   //we did validation by a method  we will chech if its valid or not by a specific method
        isExistEmail=emailList.contains(email);
        if(isExistEmail){
            isValidEmail=false;
            System.out.println(" this email is being used , please try another email ");
        }
    }while (!isValidEmail);

     String password;
     boolean isValidPsw;  //only one condtion  remeber it can be axist
    do{
        System.out.println("input your password");
        password=input.nextLine();
        isValidPsw=validatePassword(password);   //if metho returns true then java breaks loop

    }while(!isValidPsw);// this while loop will run unless  validatePassword() method is true

      User user =new User(name,username,email,password);  //we created a user after registration is succesfull   thats wyh we type this code after registration
           usernameList.add(name);
           emailList.add(email);
           passwordList.add(password);
    System.out.println(user);   //user class has toString method  so we can print the object detail
    System.out.println("congratulation, registration is successful");
    System.out.println("you can access the web site by your username/email and password");
}

  public void login(){
    Scanner input =new Scanner(System.in);
      System.out.println("please input your username/email");
      String usernameOrEmail=input.nextLine();
  boolean isEMail=emailList.contains(usernameOrEmail);
  boolean isUsername=usernameList.contains(usernameOrEmail);
     if(isEMail || isUsername){   //if username or email exists in the system then ask user to enter the password
        while (true){
            System.out.println("input your password");
            String password=input.nextLine();
            int indx;
            if(isUsername){
                indx=usernameList.indexOf(usernameOrEmail);
            } else {
                indx=emailList.indexOf(usernameOrEmail);
            }
            if (passwordList.get(indx).equals(password)){
                System.out.println("u had succesfull log in");
                break;
            }else{
                System.out.println("log in is unsuccessful , please try your password again");
            }
        }
     }else{
         System.out.println("No such username exist");
         System.out.println("check your username/email and paswwrod or please  register before log in");
     }

  }


public static boolean validateEmail(String email){
    boolean isValid;
    boolean isSpace= email.contains(" ");
    boolean isContainAt=email.contains("@");   //@ means at the rate sign
    if(isSpace){
        System.out.println("no space is allowed");
        isValid=false;
    }else if(!isContainAt){
        System.out.println("there suppose to be @ symbol");
        isValid=false;
    }else{
        String firstPart=email.split("@")[0];
        String secondtPart=email.split("@")[1];
      boolean checkBeginning =firstPart.replaceAll("[a-zA-Z0-9_.-]","").length()==0;
      boolean checkEnd=  secondtPart.equals("gmail.com")|| secondtPart.equals("hotmail.com");
      if(!checkBeginning){
          System.out.println("an email can not consist of different thann number ,digitr or ymbols _.-");
      } else if (!checkEnd) {
          System.out.println("email must end with gmail.com or hotmail.com");
      }
isValid=checkEnd&&checkBeginning;

    }
    return isValid;
}
public static boolean validatePassword(String password){
    boolean isValid;
     boolean space=password.contains(" ");
     boolean lenghtGrt6=password.length()>=6;
     boolean existUpper=password.replaceAll("[^A-Z]","").length()>0;
     boolean existLower=password.replaceAll("[^a-z]","").length()>0;
     boolean existDigit=password.replaceAll("[^0-9]","").length()>0;
     boolean existSymbol=password.replaceAll("[\\P{Punct}]","").length()>0;    // [\\P{Punct}] removes different from  punctuations
       if(space){
           System.out.println("no space is allowed in a password");
           
       } else if (!lenghtGrt6) {
           System.out.println("password must contain at least 6 character");
       } else if (!existUpper) {
           System.out.println("password must contain at least one upper case letter");
       } else if (!existLower) {
           System.out.println("password must contain at least one lower case letter");
       } else if (!existDigit) {
           System.out.println("password must contain at least one digit");
       } else if (!existSymbol) {
           System.out.println("password must contain at least one symbol");
       }
     isValid=!space&&lenghtGrt6&&existUpper&&existLower&&existDigit&&existSymbol;
       if(!isValid){
           System.out.println("try again");
       }
       return isValid;
}


}
