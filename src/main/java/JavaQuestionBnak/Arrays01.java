package JavaQuestionBnak;

import java.util.Arrays;

// Arrays  page 219
public class Arrays01 {
    public static void main(String[] args) {
        /*    ex1
        Find the middle element in an integer array
Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
         */
        int[] a = new int[]{12, 5, 8, 13};
        System.out.println(a[1]);  //5
        System.out.println(a[a.length / 2]);//8
        Arrays.sort(a);  //  first put them in order    [5, 8, 12, 13]
        if (a.length % 2 != 0) {
            System.out.println("thr middle element is" + a[a.length / 2]);
        } else {
            int sum = a[(a.length / 2) - 1] + a[a.length / 2];   //  sum= 8+12
            System.out.println("the middle element is" + sum / 2);   //10
        }
/*  ex2
Find the smallest positive element and greatest negative element in an integer array
Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2
 */
        int[] b = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(b); // [-12,-5,-2,18,23]
        int smallestP = b[b.length-1];  // en sagaki olsun diyoruz
        int biggestN = b[0]; // en soldaki olsub diyoriuz
        for (int w : b) {
            if (w > 0){
                smallestP = Math.min(smallestP, w);
            }if(w<0){
                biggestN = Math.max(biggestN, w);
            }
    }
        System.out.println("smallest positive"+smallestP);  // -12
        System.out.println("the greates negative is  "+biggestN);  //   -2
//2ns way    ***cok guzel
        int[] c = new int[]{-12, 18, -5, 23, -2};
      Arrays.sort(c);  // [-12,-5,-2,18,23]
      for(int i=0; i<c.length;i++){
          if (c[i] < 0 && c[i+1]>=0) {
              int biggestNN= c[i];
              int smallestPP= c[i+1];
          }
      }
/*   ex3
Find the elements whose length is the smallest in a String array
Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
 */
        String[] h = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
          int smallestLength= h[0].length();
          for(String w:h){
            smallestLength=Math.min(smallestLength,w.length());

          }
          String hh="";
        for(String w:h){
            if(smallestLength==w.length()){
            hh+=w+",";   //  Mark Veli

            }
        }
        String hhh=hh.substring(0,hh.length()-1);
        System.out.print(hhh);  //   Mark,Veli   no coma at the end :)
        System.out.println();

        /*   my own question
        type a code to print element in a array whose legth is smaller than array lenth
         */
        String[] f = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
      //  System.out.println(f.length);  //5
for(String w: f){
    if(w.length()<f.length){
       System.out.print(w+" ");  // Mark Veli

/* ex4
Get the initials of the elements in a String array, if the String ends with 'n' or 'k'
Example: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Output is JJM
 */
        System.out.println();
        String[] p = new String[]{"Kemal", "Jonathan", "Mark", "Jackson", "Veli"};
        String initialss = "";
   for(String ww:p){
       if(ww.endsWith("n")||ww.endsWith("k")){
           initialss+=ww.substring(0,1);
       }
   }
        System.out.println(initialss);   //  JMJ
        System.out.println();
        /*   ex5
        Find the total number of characters used in String array elements
Example: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Output is 26
         */
        String[] u = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        System.out.println(Arrays.toString(u));
        int sum = 0;
        for(String ww:u){
            sum+=ww.length();
        }
        System.out.println(sum);  //26



    }
}







    }
}
