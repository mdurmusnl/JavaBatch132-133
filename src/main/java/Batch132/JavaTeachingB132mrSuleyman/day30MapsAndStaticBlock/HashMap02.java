package Batch132.JavaTeachingB132mrSuleyman.day30MapsAndStaticBlock;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        String s="Java, Java I love Java. ";

        System.out.println(getOccurance(s));  //{a=6, e=1, v=4, I=1, J=3, l=1, o=1}  as u see  HahMap puts the entriesin random order
    }
    //ex1:  create a method to display the number of occurance of letters in a sentence
    //ex"   Java, Java I love Java.  ==> J=3, a=6,v=4,I=1, 0=1,e=1
    //since we look for a list in the form of entries we will use Map

    public static HashMap<String ,Integer> getOccurance(String s){
        s=s.replaceAll("[^a-zA-Z]","");  //rREMOVES ALL NON LETTERS ,   we shall remove punctuations and also spaces *

        HashMap<String,Integer> occurance=new HashMap<>();  // empty Map for storeing entries like J=3, a=6, etc...
        String  letters[] =s.split("");  //this method put each charachtr in to an array  [J, a, v, a,  , J, a, v, a,  , I,  , l, o, v, e,  , J, a, v, a]
       for(String w:letters){
           Integer numOfOccurance=occurance.get(w);//  returns the number of occurance of a charachter(w) in Map occurance
                                                         //if the charachter is non existing the get method returns null
           if(numOfOccurance==null){
               occurance.put(w,1);  //if the charachter is not existing then add it with apperance of 1  like this(J,1)
           }else{                    //otherwise  add the characther with updating the aooerance   like (J,2)
               occurance.replace(w,numOfOccurance+1);
           }
       }



        return occurance;
    }
}
