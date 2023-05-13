package Batch132.JavaTeachingB132mrSuleyman.day12ArraysSara;

import java.util.Arrays;

public class Arrays03withMrSuleyman {
    public static void main(String[] args) {
        //ex1   create a string array with 5 element  delete the elements whose length is less than 5
     //   [Orange,blue, yellow, red, brown]  ==>[Orange, Yellow, brown]
        String colors[]= new String[5];
        colors[0]="Orange";
        colors[1]="Blue";
        colors[2]="Red";
        colors[3]="Yellow";
        colors[4]="Brown";
        //first of all    how many elements have greter than or eqaul to 5 chcrahters
        //before we create an array we need to know the length of array
        int counter =0;
        for(String w:colors){
            if(w.length()>=5){
                counter++;
            }
        }
         System.out.println(counter);   //3
//  create an arraty whose length is >=5
        String newArray[]=new String[counter];
        //transfer the elemets whose length are >=5 to the new array
        int indx=0;
        for(String w: colors){
            if(w.length()>=5){
                newArray[indx]=w;
            indx++;
            }
        }
        System.out.println(Arrays.toString(newArray));  //[Orange, Yellow, Brown]


    }
}
