package Batch132.JavaTeachingB132mrSuleyman.day11NestedLoopsWhileLoopsdowhilelooops;

public class NestedForLoop01 {
    public static void main(String[] args) {
        /*
        ex1    type a code to get outpu like
        1
        12
        123
        1234
        12345
        pay attention  number od row and the last digit are same
        or  we can say number of craw and number of digits in each row are same
         */
      //  Scanner input= new Scanner(System.in);
     //   System.out.println("enter number of rows");
    //    int numOfRows= input.nextInt();
        int numOfRows=5;
        for(int i =1;i<=numOfRows;i++){
            for(int k =1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();// inner loop da k=2 olunca inner loop bitiyor bu idafe pointer i  asagiya aliyor en basa geciliyor  = empty sout
        }





    }
}
