package Batch132.JavaTeachingB132mrSuleyman.day13arraysmultidimensionalarraysMrSuleyman;

import java.util.Arrays;

public class Revise01 {
    public static void main(String[] args) {
        //ex1  create an integer aarray and print elements less than 10 on the console
        int ages[]=new int[7];
        ages[0]=13;
        ages[1]=6;
        ages[2]=19;
        ages[3]=-8;
        ages[4]=10;
        ages[5]=2;
        ages[6]=87;
        Arrays.sort(ages);  //[-8,2,6,10,13,19,87]
        //1st way   is ok but it must check possible millions of elements  this method takes time
        for( int w: ages){
            if(w<10){
                System.out.print(w+" ");
            }
        }
        System.out.println();
        //2ns way   best way
        for(int w: ages){
            if(w>=10){
                break;
            }else{
                System.out.print(w+" ");
            }
        }
        System.out.println();
//3rd way    array  in asceding order    //[-8,2,6,10,13,19,87]   bu calismadaki 2. ve 3. yol ayni
        for(int w: ages){
            if(w<10){
                System.out.print(w+" ");
            }else{
                break;
            }
        }
        System.out.println();
        System.out.println("*************");
        //ex2   create an integer array and print the elements greater than 10
        int nums[]=new int[7];
        nums[0]=13;
        nums[1]=6;
        nums[2]=19;
        nums[3]=-8;
        nums[4]=10;
        nums[5]=2;
        nums[6]=87;
        //1st way   ilkel
        for(int w: nums){
            if(w>10){
                System.out.print(w+" ");
            }
        }
//2nd way  good way
        System.out.println(Arrays.toString(nums));   // [13 19 87 [13, 6, 19, -8, 10, 2, 87]
Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));   //[-8, 2, 6, 10, 13, 19, 87]
   for( int i=nums.length-1;i>=0;i--){
       if(nums[i]>10){     // nums[i]=87  ***  w gibi egil
           System.out.print(nums[i]+" ");  //   87 19 13
       }else{
           break;
       }
   }
        System.out.println();
        System.out.println("with continue method");
//[-8, 2, 6, 10, 13, 19, 87]
        for(int w: nums){
            if(w<=10){
                continue;
            }else{
                System.out.print(w+" ");
            }
        }







    }

}
