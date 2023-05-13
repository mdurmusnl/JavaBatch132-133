package EmreAltunbilek;

import java.awt.*;
import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter your age");
        int age = scanner.nextInt();

        try{
            if(age<0){
                throw new NegativeAgeException("age can not be negative");
            }
        }catch (Exception e){
            System.out.println(e);  //we shall create our own exception called custom exception to be more readible and infor the ussetr whar was wrong

        }


    }

}
class NegativeAgeException extends Exception{
   String messageOfException;

    public NegativeAgeException(String messageOfException) {
        this.messageOfException = messageOfException;
    }

    @Override
    public String toString() {
        return messageOfException;
    }
}
