package Batch132.JavaTeachingB132mrSuleyman.day13arraysmultidimensionalarraysMrSuleyman;

import java.util.Arrays;

//day13    17 january2023
public class Arrays01MrSuleyman {
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
        //1st way   is ok but it must check possible millions of elements  this method takes time
        for(int w: ages){
            if(w<10) {
                System.out.print(w + " ");   //6 8 2    soyle de olabilidi  newArray[indx]=w;  onceden indx=0; olusturulurdu
            }
        }
        System.out.println();
//2nd way  best way
        Arrays.sort(ages);  //form this moment Array is [-8, 2, 6, 10, 13, 19, 87]
        for(int w: ages){
            if(w>=10){
                break;  //with the help of this break java odesnt need to check the all list   java stop when the check is bigger or equal to 10
            }else{
                System.out.print(w+" "); //-8 2 6
            }
        }
        System.out.println();
        //ex2   create an integer array and print the elements greater than 10
        int nums[]=new int[7];
        nums[0]=13;
        nums[1]=6;
        nums[2]=19;
        nums[3]=-8;
        nums[4]=10;
        nums[5]=2;
        nums[6]=87;
        //1st way
        System.out.println("####");
        for (int w:nums) {  // this method consume time
            if (w > 10) {
                System.out.print(w + " ");
            }
        }
        System.out.println();
        System.out.println("%%%%%%%%%%%%");
        System.out.println();
Arrays.sort(nums);   //  [-8, 2, 6, 10, 13, 19, 87]      sort method always puts the elements in ascending order
        //  "for each loop" always start from the first element
        //if we start from the first elemet ad the greterthan10 elemnts are very few at the end  then time is a big issue
        //we will not use foe each loop
        //descending yapmayi ogrenince for each loop kullanabilirsin
        //we will use for loop   *****************
            for(int i=nums.length-1;i>=0;i--) { //we just check the bigggest by starting from biggest to smallest
                if (nums[i] > 10) {    // nmu[i] gives the value    ex   nums[7]=87;
                    System.out.print(nums[i] + " ");
                } else {
                    break;
                }
            }
        System.out.println();
        System.out.println("with continue method");
 //3rd way  we will use escending order and for each loop   again this is not the best way    just teach us with continue
//3rd way   if element is <=10  then skip it by continue
        for(int w: nums){
            if(w<=10){
                continue;   // skip the element go next
            }else{
                System.out.print(w+" ");
            }
        }
        System.out.println();
        //ex









    }
}
