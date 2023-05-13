package Batch132.JavaTeachingB132mrSuleyman.day11NestedLoopsWhileLoopsdowhilelooops;
//aslinda day10 paketinin icindeki son dersin son sorusu ile basliyor
import java.util.Scanner;

public class NestedForLoopsWhileLoops01 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //ex3     type a code to print rectangel star pattern using for loop
        //   ****
        //   ****
        //   ****
        System.out.println("enter the number of rows");
        int numOfRows= input.nextInt();   //3
        System.out.println("enter the number of columns");
        int  numOfColumns=input.nextInt();   //4
        for(int i=1;i<=numOfRows;i++){
            for(int k =1;k<=numOfColumns;k++){
                System.out.print("*");
            }
            System.out.println(); //  bu idafe  pointer imlecini satirin sonundaki yildizin yanindan aliyor asagi satirin basina getiriyor, boylece alt satira gecilmis oluyor
        }






    }
}
