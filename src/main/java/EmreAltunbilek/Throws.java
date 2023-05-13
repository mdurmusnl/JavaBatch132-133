package EmreAltunbilek;

import java.io.IOException;

public class Throws {
    public static void main(String[] args) {
        method();
        System.out.println("hello");
    }

    private static void method() throws NumberFormatException {
        try {
            Integer num = Integer.parseInt("abc");  //throws (NumberFormatException.java:67)
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
