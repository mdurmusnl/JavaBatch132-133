package Batch132.JavaTeachingB132mrSuleyman.day16ArrayListANDmethodcreating;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        // ex 1    fin two closest element in a given array
        //it mean the two elements wtih smallest difference
        List<Integer> nums= new ArrayList<>();
        nums.add(12);
        nums.add(15);
        nums.add(10);
        nums.add(14);

        Collections.sort(nums);    //put them in ascending order
        int minDifference= nums.get(1)-nums.get(0);
        for(int i=1;i<nums.size();i++){
           minDifference= Math.min(minDifference,nums.get(i)- nums.get(i-1));
        }
        for(int i=1;i<nums.size();i++){
            if(nums.get(i)- nums.get(i-1)==minDifference)
                System.out.println(nums.get(i-1)+" and"+ nums.get(i));
        }
/*  ex2

 */







    }
}
