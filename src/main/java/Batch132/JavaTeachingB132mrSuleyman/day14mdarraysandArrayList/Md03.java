package Batch132.JavaTeachingB132mrSuleyman.day14mdarraysandArrayList;

public class Md03 {
    public static void main(String[] args) {
        //ex1  find the sum of the min and max elements in a md array
        int a[][]={{5,4},{10,6,7}};
        int min=a[0][0];
        int max=a[0][0];
    for(int[] w:a){
        for(int k:w){
            min=Math.min(min,k);
        max= Math.max(max,k);
        }
    }
        System.out.println(min);
        System.out.println(max);



    }
}
