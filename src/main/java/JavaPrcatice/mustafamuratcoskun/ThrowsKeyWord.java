package JavaPrcatice.mustafamuratcoskun;

import java.io.IOException;
import java.util.Scanner;

// throw nd throws are different concept
// throw   un-check exeption   such as Arithemtic exception such as age less than 18     java doesnt check   dev must handle
//throws   checked execption
public class ThrowsKeyWord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age");
        int age =scanner.nextInt();
        try {
            ageControl(age);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void ageControl(int age) throws IOException {   //We handled the IOException by ourself in main method
        if(age<18){                                                // it was also possible to type main method throws IOException and leave the other user catch the exception
            System.out.println("no entrance");
            throw new IllegalArgumentException("you re not allowed to enter the place");

        }else{
            System.out.println("welcome");
        }
    }

}
