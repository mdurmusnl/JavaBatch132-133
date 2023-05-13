package Batch132.JavaTeachingB132mrSuleyman.day14mdarraysandArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        //  ex1    type a code t0 print the Elements of a list if the elements is greater than number of elemets in a list

        List<Integer> nums= new ArrayList<>();
        nums.add(5);
        nums.add(9);
        nums.add(13);
        nums.add(4);
        nums.add(6);
        int numOfEl= nums.size();   //5    array  length  but  lisT.SIZE()
        List<Integer> newNums= new ArrayList<>();

        for(int w:nums){
            if(w>numOfEl){
                newNums.add(w);     ///   mr suleyman did this  sout(w+"")   also works
            }
        }
        System.out.println(newNums);   //[9, 13, 6]

    }
}
