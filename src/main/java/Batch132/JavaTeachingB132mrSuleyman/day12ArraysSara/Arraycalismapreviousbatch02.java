package Batch132.JavaTeachingB132mrSuleyman.day12ArraysSara;

import java.util.Arrays;
import java.util.Comparator;

public class Arraycalismapreviousbatch02 {
    public static void main(String[] args) {
        // get string from user and type a code to find number of words in the string
      //  Scanner input= new Scanner(System.in);
      //  System.out.println("enter a sentence");
      //  String s= input.nextLine();
     //  String srr[] =  s.split(" ");
      //  System.out.println(srr.length);
        //ex3 count the number of words start with "a" in a string
        String q= "I like to study Java and it Help to make big amount of money";
        String qrr[]=q.toLowerCase().split(" ");
        System.out.println(Arrays.toString(qrr));  //[i, like, to, study, java, and, it, help, to, make, big, amount, of, money]
    int flag=0;
        for (String w:qrr){
        if(w.startsWith("a")){
           flag++;
        }
    }
        System.out.println(flag);  //2

//type a code to find the longest word in a string
        String a= " i m gonna teach method creation in eglish on monday ";
        String arr[]=a.split(" ");
        int longestLength= arr[0].length();
        for(String w:arr){
           longestLength= Math.max(longestLength,w.length());
        }
        System.out.println(longestLength);
for (String w:arr){
    if(w.length()==longestLength){
        System.out.println(w+" is the longest lenth");
    }
}
  //2nd way mr suleyman teach  ccomperator method
        String aa= " i m gonna teach method creation in eglish on monday ";
           String aarr[]=aa.split(" ");
    Arrays.sort(aarr, Comparator.comparingInt(String::length));   //this methos compares each element in length  in the given array  and then sorth
        System.out.println(Arrays.toString(aarr));  //  [, i, m, in, on, gonna, teach, method, eglish, monday, creation]
        System.out.println(aarr[aarr.length-1]+" is the longest lenth");
        System.out.println(aarr[0]+" is the shortest lenth");
 //ex



    }
}
