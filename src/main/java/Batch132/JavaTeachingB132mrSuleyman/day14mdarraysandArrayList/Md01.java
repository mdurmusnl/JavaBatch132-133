package Batch132.JavaTeachingB132mrSuleyman.day14mdarraysandArrayList;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        // ex1 convert 2 dimensional array into 1dimensiona; array
        int a[][]={{5,3},{9,8,7}};
        //first of all find the number of all elements to use as a length of new array
        int sum =0;
        for(int[] w:a) {
            sum += w.length;  //5
        }
// 2nd step  create new one dimensional arrya
            // with new length
            int b[]=new int[sum];
           // 3rd step transfer the each element  with a nested loop
        int indx=0;
            for(int[] w:a) {    //int[]  stands for data type
                  for(int k:w ){
                   b[indx]=k;
                   indx++;
            }
                System.out.println(Arrays.toString(b));   //[5, 3, 9, 8, 7]
                System.out.println(Arrays.deepToString(a));   //[[5, 3], [9, 8, 7]]





        }



    }





}
