package Batch132.JavaTeachingB132mrSuleyman.day13arraysmultidimensionalarraysMrSuleyman;

public class Revise03 {
    public static void main(String[] args) {
// ex 1   type a code to find the sum of all elements in an integer md array
        int crr[][]={{5,34},{12,98,-7}};
        int sum =0;
        for(int[] w: crr){
            for(int u: w){
                sum+=u;
            }
        }
        System.out.println(sum);



    }
}
