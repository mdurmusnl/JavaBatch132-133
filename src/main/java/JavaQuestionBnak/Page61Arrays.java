package JavaQuestionBnak;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.SplittableRandom;

public class Page61Arrays {
    public static void main(String[] args) {
      //ex2
        int arr[]={1,23,12,2,3};
        Arrays.sort(arr);  //[1, 2, 3, 12, 23]
       System.out.println(Arrays.toString(arr));  //[1, 2, 3, 12, 23]
        // to search an lement exist or not, first Arrya must be sort ****
        System.out.println(Arrays.binarySearch(arr,5));   //-4
        System.out.println(Arrays.binarySearch(arr,12));  //3

        //ex7
        String a= "Hello Welcome to TechPro Education";
        String aa[]= a.split(" ");
        String aaa[]=a.split("X");
        String aaaa[]= a.split("W");
        System.out.println(Arrays.toString(aa));  //[Hello, Welcome, to, TechPro, Education]    aa.length =5
        System.out.println(Arrays.toString(aaa));  //  [Hello Welcome to TechPro Education]    aaa,length =1
        System.out.println(Arrays.toString(aaaa));  //[Hello , elcome to TechPro Education]     aaaa.length =2

        //ex9
        String z="Hello Welcome to TechPro Education";
   String zz[]=z.split("");
   String zzz[]=z.split(" ");
        System.out.println(Arrays.toString(zz));  //  [H, e, l, l, o,  , W, e, l, c, o, m, e,  , t, o,  , T, e, c, h, P, r, o,  , E, d, u, c, a, t, i, o, n]
        System.out.println(Arrays.toString(zzz));  //  [Hello, Welcome, to, TechPro, Education]
        //ex10
        String w= "Java, I like Java";
        String ww[]= w.split("a");
        System.out.println(Arrays.toString(ww));  //[J, v, ,I like J, v]   her a dan sonra virgul koyup yeni element yapiyor,  a siliniyor




    }
}
