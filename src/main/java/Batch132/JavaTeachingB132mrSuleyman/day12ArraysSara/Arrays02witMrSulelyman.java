package Batch132.JavaTeachingB132mrSuleyman.day12ArraysSara;

import java.util.Arrays;

public class Arrays02witMrSulelyman {
    public static void main(String[] args) {


//ex 2   create an integer array to find the sum of the min and max value
        //  [12,45,9,56]  ==>9+56=65
        int num[]=new int[4];
        num[0]=12;
        num[1]=45;
        num[2]=9;
        num[3]=56;
        //put them in ascending orfer    the first is the smallest  the last is the biggest
        Arrays.sort(num);   // put the list in ascending order
        System.out.println(Arrays.toString(num));  //[9, 12, 45, 56]
int min=num[0];
int max= num[num.length-1];
        System.out.println(min+max);  //65    sara hoca 18 ocak aksam burda durdu
  //2nd way      karsilastirma yaparak min ve max bulma
   int numbers[]=new int[4];
        numbers[0]=12;
        numbers[1]=45;
        numbers[2]=9;
        numbers[3]=56;
   int minValues= numbers[0];  //burda aslinda oyle oldugunu bilmiyoruz oylesine esitledik ve basladik tekrarli kiyaslamalara
        int maxValues= numbers[0];
        for(int w:numbers){
       minValues=Math.min(minValues,w);   //w  surekli gezen bir eleman
       maxValues=Math.max(maxValues,w);
   }
        System.out.println(minValues);
        System.out.println(maxValues);
        System.out.println(minValues+maxValues);   //65






    }
}
