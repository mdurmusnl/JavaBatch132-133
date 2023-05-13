package Batch132.JavaTeachingB132mrSuleyman.day11NestedLoopsWhileLoopsdowhilelooops;

import java.util.Scanner;

// while loop    ;first think then action
//do while loop  ; first action then think
public class DoWhileLoop01 {
    public static void main(String[] args) {
        //ex1   whats the difference between while loop and do while loops
        // while loop  : zero time execution is possible   they may be no execution
        int i=1;
        while(i<1){
            System.out.println("i m while loop");  // this will not be executed
            i++;
        }
        System.out.println("*********************************************");
        //if the situation requires at least once a time execution then do while loop
        //do-while loop : zero execution is impossible   loop body will be executed at least once
        int k=1;
        do{   //java does do job bcs there is no condtion in the structure of do while loop
            System.out.println("i m do-while loop"); // this code will be executed once only
            k++;
        }while(k<1);
        System.out.println();
        /*
        ask a user to enter an integer,     if the integer is less than 100, tell user won, otherwise tell user lost
yardim    biz kullaniciyya defalarca tekrar tekrsr mesaj gondermek istiyorska mesajimiz do while loop inide yazilmali
         */
        Scanner input= new Scanner(System.in);

      do {   //we want game keep on  thats why we use do while and we type the message inside de loop
          System.out.println("enter an integer"); //bu mesajiin tekrar tekrar yazilmasini istedigimiz icin bu mesaji loop icine yazdik
          int num = input.nextInt();
          if (num < 100) {
              System.out.println("won");
          } else {
              System.out.println("lost");
//              break;    //  oyunu kaybederse oyunun sonlanmasini istiyorsak breka ile sonlanmasini saglariz|2`1}
                           // break takes us out of loop
          }
          //no inccrement or decrement bcs user does it
          } while (true) ;  //IT MEANS KEEP WORKING    NEVER STOP



    }
}
