package practices.practice01;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
      /*  //Example 1: Ask user to enter width snd the length of a rectangle, then calculate
//perimeter and the area of the rectangle.
        Scanner input = new Scanner(System.in);
        System.out.println("enter the width and lenght");
        double width = input.nextDouble();
        double length = input.nextDouble();
        System.out.println("perimeter"+(2*width+2*length));

*/

        Scanner input = new Scanner(System.in);

        System.out.println("please enter the first aname, ");
        double radius = input.nextDouble();

        System.out.println("the area of the circle "+ Math.PI*radius*radius);





    }
}
