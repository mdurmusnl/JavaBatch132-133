package Batch132.JavaTeachingB132mrSuleyman.day12ArraysSara;

import java.util.Arrays;

public class ArrayscalismapreviousBatch03 {
    public static void main(String[] args) {
        //ex01  type a code to check if a specific element exists in an Array or not
        String srr[]= {"Ali","Tom","Carl","Angie"};
        String x="ali";
        int counter=0;
        for(String w:srr){
            if(w.equalsIgnoreCase(x)){
                counter++;
            }
        }
if(counter>0){
    System.out.println(x+ "exists");
}else{
    System.out.println(x+"is not exist");
}
//2nd way  binarySeach method tell if element exist or not but never tell us the exact index of the lement   bcs we have to sort the array before using binarchSeach method
        // in strings  theres is contains method   in Arrya thete is binarySearch meyhod
        // i) before useing binarySeach  u have to use sort method
        // ii) if the lemenet exists the binarySeach method returnn the index
        Arrays.sort(srr);
        int ind=Arrays.binarySearch(srr,"Carl");

          String s=" Carl";
          s=s.toLowerCase();   //  carl
        System.out.println(s);



    }
}
