package JavaQuestionBnak;

import java.util.ArrayList;
import java.util.Arrays;

//ex31
public class Loop08 {
    public static void main(String[] args) {
/*
Each line of input contains one or several words separated with single spaces. Type code to
reverse the order of words except the first and the last words in each line of input, while
preserving the words themselves. The lines of your output should not have any trailing or
leading spaces. Example; Kemal Can Tan Han Kuzu will be converted to Kemal Han Tan Can
Kuzu
 */
String s="Kemal Can Tan Han Kuzu";
  //1st method  bnim yaptigim biraz ilkel yol  ama dogru ve dynamic
  /* String srr[]=s.split(" ");  // uzunlugu 5 olan bir array yaptim
        System.out.print(srr[0]+" ");
        for(int i=srr.length-2;i>=1;i--){
            System.out.print(srr[i]+" ");
        }
        System.out.println(srr[srr.length-1]);  //Kemal Han Tan Can Kuzu    cok guzel        */


       String liness[]=s.split(" ");    //  [Kemal, Can, Tan, Han, Kuzu];
       String lines[]= s.split(System.getProperty("line.separator"));  //[Kemal Can Tan Han Kuzu]     lines.length =1

       for(String w:lines){
           String words[]=w.split(" ");   // words[]= [Kemal, Can, Tan, Han, Kuzu];
           String rev= words[0]+" ";
           for (int i=words.length-2;i>=1;i--){
               rev+=words[i]+" ";
           }
   rev=rev+ words[words.length-1];
           System.out.println(rev);   //  Kemal Han Tan Can Kuzu

       }



    }
}
