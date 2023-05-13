package Batch132.JavaTeachingB132mrSuleyman.day13arraysmultidimensionalarraysMrSuleyman;

import java.util.Arrays;

public class MdArrays01 {
    public static void main(String[] args) {
        // how to create a multidimensional array
        int arr [][]= new int[4][2];
        //how to print md array
        System.out.println(Arrays.deepToString(arr));  //   [[0, 0], [0, 0], [0, 0], [0, 0]]
        //how to add elemets to md array
        arr[0][0]=3;
        arr[0][1]=10;
        arr[1][0]=61;
        arr[1][1]=5;
        arr[2][0]=2;
        arr[2][1]=11;
        arr[3][0]=81;
        arr[3][1]=23;
        System.out.println(Arrays.toString(arr[1])); //   just an array   [61,5]
        //how to print array elements one by one
        //  arr[2][1] is an integer  no need deeptostring method
        System.out.println(arr[2][1]);  //11
//how to use different number of elements in innner aaray
        int brr[][]={{12,45},{33},{76,3,21}};
// ex 1   type a code to find the sum of all elements in an integer md array
   int crr[][]={{5,34},{12,98,-7}};
   int sum=0;
   for(int[] w: crr){      //{5,34  }   is an integer array  we must use int[]     ww bir array   crr uzerinde geziyor
       for(int u:w){   //w   array elementinin temsil ediyor  u ise  array icindeki bir integer i temsil ediyor     u bir sayi  array w nin icinde geziyor
  sum+=u;
       }
   }
        System.out.println(sum);   //142

    }
}
