package Batch132.JavaTeachingB132mrSuleyman.day07ifstatementternarystatement;

import java.time.LocalDate;
import java.util.Scanner;

public class questionbook {
    private int age2= 13;
    static int age3 =14;
    static char initial = 'j';
    public static void main(String[] args) {
       /* System.out.println('A'>23 && 'A'<'z' ); // (t&&t)=t
        System.out.println();
        System.out.println(5/2.0);
*/
        Scanner input = new Scanner(System.in);
       System.out.println("enter your date of birth");
        int dob= input.nextInt();
        int age = calculateAge(dob);
        System.out.println(age);
      int age1= 12;
        System.out.println(age3+initial);
        //System.out.println("enter your name");
        String day = input.next();
        char ch1= day.charAt(1);
        char ch2= day.charAt(3);
        System.out.println(ch1+ch2);  //A NUMBER
        System.out.println(""+ch1+ch2);// a string


    }
    public static int calculateAge(int dateOfBirth){
        return LocalDate.now().getYear()-dateOfBirth;
    }
}
