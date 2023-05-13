package Batch132.JavaTeachingB132mrSuleyman.day13arraysmultidimensionalarraysMrSuleyman;

import java.util.Arrays;

public class revise02 {
    public static void main(String[] args) {
        //ex1   create an array add 6 elements and find the sum
        int ages[]=new int[6];
        ages[0]=13;
        ages[1]=24;
        ages[2]=12;
        ages[3]=19;
        ages[4]=34;
        ages[5]=21;
        System.out.println(Arrays.toString(ages));   //[13, 24, 12, 19, 34, 21]
        int sum =0;
        for(int w: ages){
            sum+=w;
        }
        System.out.println(sum);
//ex 2   create an integer array to find the sum of the mind and max value
        //  [12,45,9,56]  ==>9+56=65
        //1st way is simple   put in ascending orden then the zero index is smallest and last index is bgiggest
        //2nd way  with comparion
        int num[]=new int[4];
        num[0]=12;
        num[1]=45;
        num[2]=9;
        num[3]=56;
        //put them in ascending orfer    the first is the smallest  the last is the biggest
        Arrays.sort(num);   // put the list in ascending order
        int minValue= num[0];
        int maxValue=num[0];  //aslinda 0. indexteki elemenanin en buyuk oldugunu iddia etmiyoruz    as sonra java MAth class ile compariosn yapacak
        for(int w: num){
            minValue=Math.min(minValue,w);
            maxValue=Math.max(maxValue,w);
        }
        System.out.println(minValue);   //9
        System.out.println(maxValue);  //56











    }
}
