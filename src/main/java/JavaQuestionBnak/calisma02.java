package JavaQuestionBnak;

import java.util.Arrays;

public class calisma02 {
    public static void main(String[] args) {

        /*
        Find the smallest positive element and greatest negative element in an integer array
Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2
         */

        int[ ] a = new int[ ]{-12, 18,-5,23,-2};   //a.length =5
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));   // [-12, -5, -2, 18, 23]
       Integer minPositive= a[a.length-1];   // we dont mean its true,  java is gonna check in the first for loop, we just assume as it is
       Integer maxNegative=a[0];     //we can even say          Integer maxNegative=a[a.lenggth-1];   this is assumtion for the comparision
        for(Integer w: a ){
            if(w>+0){
                minPositive=Math.min(minPositive,w);   // here is the comparion run and decide whichever is smaller then is it put in the minPositive container
            }
            if (w<0){
                maxNegative=Math.max(maxNegative,w);  // this method compare each w   with maxNegative then that mathod put biggest value in maxNegative container
            }
        }
        System.out.println(minPositive);   //18
        System.out.println(maxNegative);   //-2






    }
}
