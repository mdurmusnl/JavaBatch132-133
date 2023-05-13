package Andrey.fierro;

import java.util.Scanner;

public class Login2 {
    static String username="veli";
   static int psw=123;
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Login2 login = new Login2();
        int numberOfTry=3;
        try {
            while (true) {
                System.out.println("enter your user name");
                String username2 = input.next();
                System.out.println("enter your password");
                int psw2 = input.nextInt();

                if (username.equals(username2)&&psw==psw2 ){
                    System.out.println("welcome");
                    break;
                }else{
                    System.out.println("please try again");
                    numberOfTry--;

                }
                if(numberOfTry==0){
                    System.out.println("please contact with your customer service");
                    break;
                }
            }
        }finally {
            System.out.println(" good bye");
        }
    }
}
