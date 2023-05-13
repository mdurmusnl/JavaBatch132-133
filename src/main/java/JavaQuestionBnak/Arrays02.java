package JavaQuestionBnak;
//page222

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
/*  ex6
Count how many words start with 'a' or 'A' in a given String
 */
        String s = "Apex is an object oriented programming language";
        String ss[]=s.split(" ");
        //System.out.println(Arrays.toString(ss)); //   [Apex, is, an, object, oriented, programming, language]
        int counter=0;
        for(String w:ss){
   if(w.startsWith("a")||w.startsWith("A")){
       counter++;
   }
        }
        System.out.println(counter);  //2
/*
Find the number of vowels in a String
 */
        String a = "Apex is an object oriented programming language";
        a=a.toLowerCase();
        String arr[]=a.split("");   //  [apex, is, an, object, oriented, programming, language]
        System.out.println(Arrays.toString(arr));  //[a, p, e, x,  , i, s,  , a, n,  , o, b, j, e, c, t,  , o, r, i, e, n, t, e, d,  , p, r, o, g, r, a, m, m, i, n, g,  , l, a, n, g, u, a, g, e]
        int counter1=0;
        for(String w:arr){
          switch (w) {
              case "a":
              case "e":
              case "i":
              case "o":
              case "u":
                  counter1++;
          }
        }
        System.out.println(counter1);  //17

/* ex 8
Type code to find array elements whose first and last characters are same
 */
        String[] brr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
for(String w:brr ){
    String p=w.substring(0,1);
    String q=w.substring(w.length()-1,w.length());   // last letter
if(w.startsWith(p)==w.endsWith(q)){
    System.out.print(w+" ");
}

}
        System.out.println();
/*  ex9  type a code to find  if a given lement exist in a given array or not
 */
        String[] prr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
      String l="objectpp";
      int counterP=0;
for(String w:prr){
    if(w.equalsIgnoreCase(l)){
        counterP++;
    }
}
    if(counterP>0){
        System.out.println("it exists");
    }else{
        System.out.println(l+"   does not exist");
    }
    /*  EX10 type a code to find the number of characters of array elements
     */
        String[] hrr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        int summ=0;
        for(String w:hrr){
            summ+=w.length();  //21
        }
        System.out.println(summ);



    }
}
