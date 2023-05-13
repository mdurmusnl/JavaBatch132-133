package practices02dt;

import org.example.Main;

public class Q01 {
    public static void main(String[] args) {
        //Type code to check if a String does not have any space character at the beginning and at the end
        //Example==> ' Ali ' should print false on the console
        //            'Ali' should print true on the console


        //Example==> ' Ali ' should print false on the console
        String str= " Tom ";
        String trimmedString =str.trim();
        boolean result=str.equals(trimmedString);

        System.out.println(" is there any space at he begninnig or at the end "+" "+!result);
        System.out.println(str);


    }
}
