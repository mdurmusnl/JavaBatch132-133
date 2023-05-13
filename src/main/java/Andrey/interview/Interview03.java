package Andrey.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Interview03 {
    public static void main(String[] args) {
        //Q2   please remove the element 13 from the given list
        List<Integer> ages=  new ArrayList<>();
        ages.add(12);
        ages.add(13);
        ages.add(7);
        ages.add(32);
        ages.add(1);
        ages.add(55);


        //Q1  what does this return
        List<String> names= new ArrayList<>();
        names.add("christian");
        names.add("Alex");
        names.add("Tommy");
        names.add("Adriana");
        names.add("Tom");
        names.remove(2);   //what does this return?

        //this exm has to ways
        //Q3  type a code to check if a specifi element exist or not in the given array, lets check if "Carl" exist or not
        String krr[]={"Ali","Tom","Carl","Angie"};


        // ex1 put all zero elements at the end of array
        int arr[]={0,2,3,0,12,0};
        int brr[]=new int[arr.length];
        int indx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                continue;
            }else{
                brr[indx]=arr[i];
                indx++;
            }
        }
        //  Q4 type a code to find the longest word in a string
        String s= " i m gonna teach method creation in eglish on monday ";
        String srr[]=s.split(" ");
        int longestLength= srr[0].length();
        for(String w:srr){
            longestLength= Math.max(longestLength,w.length());
        }
        System.out.println(longestLength);
        for (String w:srr){
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

        //1)can u talk about differences between Array and ArrayList
        // 2)if ArrayList has same fetures as Arrays ahs and if ArrayList is more advanced structure then why java keep arrays class
        //2)can u give an example for the reason why java keep arrays class

        //SQL  PLEASE visit page sqlteaching.com and perform number 19


    }
}
