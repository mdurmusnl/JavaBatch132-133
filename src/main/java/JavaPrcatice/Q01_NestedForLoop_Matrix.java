package JavaPrcatice;
   //JavaPrcatice09feb2023;
import java.util.Scanner;

public class Q01_NestedForLoop_Matrix {
    //ex1     ask user enter number and print on the console     input:10
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("enter an integer");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                //  System.out.print("*");
                System.out.print((int) (Math.random() * 5) + " ");
            }
            System.out.println();
        }


    }
*/
    public static int getFactorial(int num) {
        int factoriual=1;
        if (num < 1) {
            System.out.println("no factorial consept for numbers less than 1");
        } else {
  for(int i=1;i<=num;i++){
      factoriual*=i;
  }
        }
 return factoriual;
    }
}
