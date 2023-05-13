package Batch132.JavaTeachingB132mrSuleyman.day30MapsAndStaticBlock;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
String s= "Java is easy, and Java is OOP , OOP makes Java easy.";

    }
    //ex1:   type code to find the number of occurances of word in a sentence
    //ex  Java is easy, and Java is OOP , OOP makes Java easy. ==>  JAVA =3  easy=2 is=2 OOP =2  makes =1  as u see each String is unique
    //    please be carefull easy, and easy. are not same in java language so we must remove all punctuation mark first by replaceAll("\\p{Punct}","");
    // notice we have string and integer   its like key and value  so we will use Map
    //my methos will retunr a Map

    public static HashMap<String ,Integer> getNumOfOccurance(String s){  // since we will work on a sentence so we shall give a sting sentece to the method
          s=s.replaceAll("\\p{Punct}","");  //this method removes all punctuations and   notice strings are inmutable  whne we say s=s.replaALL  THEN WE DID UPDATE THE ORIGINAL PONE
                                                      // s = "Java is easy and Java is OOP  OOP makes Java easy"   no punctuation
          // lets create a HashMap container to store each word as a key and the occurance as a value
        HashMap<String,Integer> occurances=new HashMap<>();  // occurance is an empty Map  will be filled by entries in the for each loop
          // we shall use split method to store each word into an Array
          String words[]=s.split(" ");  // [ Java, is, easy, and, Java, is, OOP, OOP, makes, Java, easy]   now each word is an element
             for(String w:words){   //w will go through on words array
           Integer numOfOccurances=occurances.get(w);  //  get() method gives null if the word is not exist ,
                       // at the begining our Map container is fully empty   for example  w will take first word "Java"
                      // if the word " Java " is non existing then method returns null and go lower code and add the entry(Java,1) bu using replace method
           if(numOfOccurances==null){
               occurances.put(w,1);  //for ex  in the first time w="Java" then put method retunr null , replace method put (Java,1) as an entry in occurance Map
           }else{
               occurances.replace(w,numOfOccurances+1);
           }
   }
return occurances;
    }

}
