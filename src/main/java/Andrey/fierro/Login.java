package Andrey.fierro;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Login {
    private String username;
    private int psw;

    public Login(String username, int psw) {
        this.username = username;
        this.psw = psw;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPsw() {
        return psw;
    }

    public void setPsw(int psw) {
        this.psw = psw;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Login login = new Login("veli",123);
        int numberOfTry=3;
        try {
            while (true) {
                System.out.println("enter your user name");
                String username = input.next();
                System.out.println("enter your password");
                int psw = input.nextInt();

                if ( login.getUsername() == username && login.getPsw() == psw) {
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
