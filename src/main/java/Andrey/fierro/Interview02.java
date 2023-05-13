package Andrey.fierro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Interview02 {
    public static void main(String[] args) {
        //type a code to check if the given password contains at least one digit.
        String psw="abc2 ?";
        boolean q=psw.replaceAll("[^0-9]","").length()>0;
        System.out.println(q);

        //Q1  String date="09/20/2022";//type a code to print the month of the given date
        //        String datearr[] =date.split("/");

        //Q2  type code to print your name in reverse
        StringBuilder str= new StringBuilder("veli han");
        System.out.println("reverse   "+str.reverse());
        String a="ali can";
        String rev="";
        for(int i= a.length()-1;i>=0;i--){
            char ch =a.charAt(i);
            rev+=ch;
        }
        System.out.println(rev);

        //Q3 can u talk about the difference between Arrays and ArrayList

        //Q4   please remove the element 13 from the given list
        List<Integer> ages=  new ArrayList<>();
        ages.add(12);
        ages.add(13);
        ages.add(7);
        ages.add(32);
        ages.add(1);
        ages.add(55);

        //Q5  what does this return
        List<String> names= new ArrayList<>();
        names.add("christian");
        names.add("Alex");
        names.add("Tommy");
        names.add("Adriana");
        names.add("Tom");
        names.remove(2);   //what does this return?

        //Q6  type a code to check if a specifi element exist or not in the given array, lets check if "Carl" exist or not
        String krr[]={"Ali","Tom","Carl","Angie"};

        //q6 hs 2 ways

        //  Q7 type a code to find the longest word in a string
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




//q9  print the elements in an integer list which are less than 10
        Integer age[]={2,7,15,19,9,7,11};


    }
}
