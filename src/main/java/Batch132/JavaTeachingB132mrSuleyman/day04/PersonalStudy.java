package Batch132.JavaTeachingB132mrSuleyman.day04;

import java.util.Arrays;

//to find the correct number od charachter in a string without counting spaces
public class PersonalStudy {
    public static void main(String[] args) {
        String s= "Java is a programming language";
        char[] c= s.toCharArray();   // [J, a, v, a,  , i, s,  , a,  , p, r, o, g, r, a, m, m, i, n, g,  , l, a, n, g, u, a, g, e]

        int numberOfCharachter = 0;
        for(int i =0; i<c.length;i++){
            if(c[i]!=' '){
                numberOfCharachter++;
            }
        }
        System.out.println(numberOfCharachter);

        String ss= "Java is a programming language";
        ss=ss.replaceAll("[^a-zA-Z]","");
        String ch[]=ss.split("");  //[J, a, v, a, i, s, a, p, r, o, g, r, a, m, m, i, n, g, l, a, n, g, u, a, g, e]
        System.out.println(ch.length);
    }



}
