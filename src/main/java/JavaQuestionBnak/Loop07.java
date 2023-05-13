package JavaQuestionBnak;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.DoubleStream;

//page 217
public class Loop07 {
    public static void main(String[] args) {
        /*
        Each line of input contains one or several words separated with single spaces. Type code to
reverse the order of words in each line of input, while preserving the words themselves. The
lines of your output should not have any trailing or leading spaces.
Example; Kemal Can Kuzu will be converted to Kuzu Can Kema
         */
      //  String q="Kemal";     ///ogrenmek icin yazilmis bvir calisma   cevapla ilgili degil
    // String [] qq=q.split(" ");  // [Kemal]
       // String [] qqq=q.split("");   //[K, e, m, a, l]

        String s="Kemal Can Kuzu";
        String ss=s.split(" ")[1];   //Can
        String rev="";
        String []lines= s.split(System.lineSeparator());    //[Kemal Can Kuzu]
       for(String w:lines ){     //w bir string  lines uzerinde geziyor
           String []words=w.split(" ");   //  mesela w= [Kemal]    bu islem bir string ifadeyi tek lelemanli bir array yapiyor
     for(int i=0;i<words.length;i++){
         if(i!=0){
             rev=rev+words[i]+" ";
         }else{
             rev=rev+words[i]+" ";
         }
     }
           System.out.println(rev);
           rev="";
       }


        System.out.println("2nd way for loop ile");
  String a= " Virgil van Dijk";

  String [] arr=a.split(System.lineSeparator());   // arr[] = [ Virgil van Dijk]   tek elemanli bir array olarak goruyor







        String [] revArr= new String[arr.length];
      int inx=0;
  for(int i= arr.length-1;i>=0;i--){    //bu calismadi
      revArr[inx]=arr[i];
      inx++;

  }
       // System.out.println(Arrays.toString(revArr));
      //  System.out.println(Arrays.toString(arr));


//page 217  soru 30    **** super oldu
// kac kelime oldugunu bul  o kadar defa z.split yap
  String z="Lee Brown James";
  String zzz= z.split(" ")[2];   //James
      int counter=0;
      for(int k=0;k<z.length();k++){
          char ch=z.charAt(k);
          if(ch==' '){
counter++;
          }
        }
        System.out.println("number of words in a string  "+counter);  //kelime sayisi 3

  String zzzz= z.split(" ")[0];   // Lee
        String az= z.split(" ")[2];   //James
        System.out.println(az);
for(int i=counter;i>=0;i--){
    System.out.print(z.split(" ")[i]+" ");    //James Brown Lee
}
String d= "zeynep sude durmus";
String dd[] = d.split(" ");//[zeynep, sude, durmus]

        System.out.println("*****************");
// bu en harikasi oldu
        String p= "Safa Aydin Aksoy ";
        String pp[]=p.split(" ");  //[Safa, Aydin, Aksoy]
        System.out.println(pp.length);   //3

        for(int i=pp.length-1;i>=0;i--){
            System.out.print(pp[i]+" ");       //  Aksoy Aydin Safa
        }






    }
}
