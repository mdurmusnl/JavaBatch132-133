package JavaQuestionBnak;

import java.sql.SQLOutput;
import java.sql.SQLRecoverableException;

// ex12   page 201
public class Loops03 {
    public static void main(String[] args) {
        /*   ex 12
        Type code to draw the following image by using a for loop.
A A A A A A A A
A X X X X X X A
A X X X X X X A
A A A A A A A A
         */
        int rows=4;
        int columns= 8;

        for(int i=1;i<=rows;i++){
            String ss="";
                if(i==1 || i==rows) {
                    for (int j = 1; j <= columns; j++) {
                     ss=ss+"A";
                    }
                    System.out.println(ss);

                } else{
                    ss=ss+"A";
                    for(int k=2;k<columns;k++){
                        ss=ss+"X";
                    }
                    ss=ss+"A";
                    System.out.println(ss);
                }
        }

        System.out.println();
        System.out.println("ex 12 with while loop");
        int roww=4;
        int columnn= 8;
  int i=1;

  while(i<=roww){
      String s="";
      if(i==1||i==roww){   //row 1 ve row 4 te bu if durumundaki bu dongu calisacak
         for(int y=1;y<=columnn;y++){
          s=s+"A";
         }
          System.out.println(s);
      }else {    // row2 ve row 4 tw bu bu else durumundaki dongu calisacak
          s=s+"A";    //once A yazdir sonra donguye gir
          for(int t=2;t<columnn;t++){
              s=s+"X";
          }    //donguden cik  yine A YAZDIR
          s=s+"A";
          System.out.println(s);
      }
      i++;
  }
        System.out.println();
        System.out.println("ex13");
       //the sum of integers from 3 to 14
       int summ=0;
       for(int b=3;b<15;b++){
           summ+=b;
       }
        System.out.println(summ);
        System.out.println();
   /*
   Type code to find the multiplication of the integers from 3 to 9
    */
int product=1;
for(int q=3;q<6;q++){
    product*=q;
}
        System.out.println("the product is"+product);
//2ns wAY
        System.out.println("ex14 with while loop");
       int x=3;
       int prd=1;
       while(x<6){
           prd*=x;
           x++;
       }
        System.out.println(prd); //60

/*
Type code to print characters from 'C' to 'A' on the console by using do-while loop
 */
       String aa= "";
       for(char q='C';q>='A';q--){
           aa+=q;
       }
        System.out.println(aa);
        System.out.println();
        /*
        Type all characters before the first occurrence of 'm' in a String
         */
  String w="Christmas";
  int indxOfM=w.indexOf('m');  //6
        String ww= w.substring(0,6);  //6.karakter harc
        System.out.println(ww);  // Christ
//2nd way
        System.out.println("ex16 with for loop");
        String qq="Christmas";
        int indx=qq.indexOf('m');  //6
        String newqq= "";
        for(int r=0;r<qq.length();r++){
            String ch= qq.substring(r,r+1);
            if(r>=indx){
                break;
            }else{
                newqq+=ch;
            }
        }
        System.out.println(newqq);



    }
}
