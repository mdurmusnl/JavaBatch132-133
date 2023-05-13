package Batch132.JavaTeachingB132mrSuleyman.day14mdarraysandArrayList;

public class Md02 {
    public static void main(String[] args) {
        //ex1   type code to find the multiplication of all elements of a md array
   int a[][]={{5,4},{10,6,3}};
   int product=1;
   for(int[] w:a){
       for(int k:w){
           product=product*k;
       }
   }
        System.out.println(product);





    }
}
