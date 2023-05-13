package practices02dt;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
  // ask use to enter an integer then print even number on the console  if the number is even
/*
        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer");
          int number = input.nextInt();
          Boolean isEven= number %2==0;
        System.out.println(" is the given number even"+ " " +isEven);

*/
        // check a number if its odd or not
        Scanner input2= new Scanner(System.in);
        int checkOdd = input2.nextInt();
        boolean isOdd = (checkOdd%2!=0);
        System.out.println("is the number odd"+" "+ isOdd);
    }
}
