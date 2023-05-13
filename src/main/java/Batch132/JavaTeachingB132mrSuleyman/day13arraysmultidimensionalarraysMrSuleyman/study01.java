package Batch132.JavaTeachingB132mrSuleyman.day13arraysmultidimensionalarraysMrSuleyman;

import java.util.Arrays;

public class study01 {
    public static void main(String[] args) {
        //first of all    how many elements have greter than or eqaul to 5 chcrahters
        String colors[]= new String[5];
        colors[0]="Orange";
        colors[1]="Blue";
        colors[2]="Red";
        colors[3]="Yellow";
        colors[4]="Brown";
        System.out.println(colors[4]);  //Brown
        int counter =0;
        for(String w:colors){
            if(w.length()>=5){
                counter++;
            }
        }
        System.out.println(counter);
        String newArray[]= new String[counter];
        int indx=0;
        for(String w: colors){
            if(w.length()>=5) {
                newArray[indx] = w;
                indx++;
            }
        }
        System.out.println(Arrays.toString(newArray));   //[Orange, Yellow, Brown]
//ex2  benim cozumum   amma ikinci yolu izle
        int ages[]=new int[7];
        ages[0]=13;
        ages[1]=6;
        ages[2]=19;
        ages[3]=8;
        ages[4]=10;
        ages[5]=2;
        ages[6]=87;




    }
}
