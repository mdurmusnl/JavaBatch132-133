package Batch132.JavaTeachingB132mrSuleyman.day07ifstatementternarystatement;

public class StringManipulations01 {
    public static void main(String[] args) {
   //Example 1: Type code to find the index of the first occurrence of 'a' in a given String
            //           Alabama ==> 2
            String s = "Alabama";

            //indexOf('a') will give you the index of first occurrence of 'a'
            int idxA = s.indexOf('a');
            System.out.println(idxA);// 2
        System.out.println("###################");
            //Example 2: Type code to find the index of the first occurrence of 'java' in a given String
            //           "java is easy to learn, java is common in the market, java is OOP" ==> 2

            String t = "Java is easy to learn, java is common in the ar, java is OOP";

            //indexOf("java"); will give you the index of first character of the first occurrence of "java"
            int idxJava = t.indexOf("java");
            System.out.println(idxJava);

            //Note 1: If you use "non-existing character or characters" in indexOf() method, it will give you "-1"
            //Note 2: indexOf() method can be used with "char" and "String" data types

            //Example 3: Type code to find the index of the last occurrence of 'a' in a given String
                 String w= "java is a befeficitial language";
          int w1=w.lastIndexOf("a");
        System.out.println("last occurance of a is"+w1);

        //Example 4: Type code to find the index of the last occurence of 'earn' in a given string
       String q= "Learn JAVA earn MONEY";
       int q1= q.lastIndexOf("earn");
        System.out.println("last occurance of \\earn\\is " + " "+q1);
//********************************************************************************************************
        System.out.println("*******************************");
        //Example 5:Type code to check if a given character is unique or not in a given String
//          miami ==> 'a' --> Unique - 'i' --> Not unique
String y= "miami";
char ch='a';
boolean result= y.indexOf(ch)==y.lastIndexOf(ch);
        System.out.println(result);
        }



}
