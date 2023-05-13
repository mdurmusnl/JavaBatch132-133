package practices02dt;

import java.util.Arrays;
import java.util.Scanner;

public class Q04NumberOfWords {
    public static void main(String[] args) {
//Type code to count the number of words that starts with "s" in the String given by the User.
//String str= "Sam is scared soo much";
        Scanner input= new Scanner(System.in);
        System.out.println("enter the sentecne ");
String str =input.nextLine().toLowerCase();  //java is so simple and sweet
String []strArr=str.split(" ");   //   [java, is, so, simple, and, sweet]   splits into words
        System.out.println(Arrays.toString(strArr));  //[Ali, Brad, Ellie, Susan, Tom, Veli]
int counter =0;
        for(String w:strArr){
 if(w.startsWith("s" )){
counter++;
 }
}
        System.out.println("there is/are"+ counter+"words in the sentence ");
if(counter==0){
    System.out.println("no words");
}



    }
}
