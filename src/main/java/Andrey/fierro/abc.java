package Andrey.fierro;

import Andrey.interview.IllegalAge;
import org.example.Main;

import java.util.Arrays;

public class abc {
    public static void main(String[] args)
    {

//Create a method to print ages. The method will throw exception if the age is negative.

        //Convert the "Congratulations" word to sn**t*l*rgn*C".
/*
        String str = "Congratulations";
        int s=str.length();
        String rev="";
        for(int i=s-1;i>=0;i--){
            char ch=str.charAt(i);
            rev+=ch;
        }
        System.out.println(rev);
       String result= rev.replaceAll("[aeiouAEIOU]","*");
        System.out.println(result);
*/

        String str = "Congratulations";

        String [] arr = str.split("");
        System.out.println(Arrays.toString(arr)); // [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]
        System.out.println(arr[14]);//s
        arr[14]="p";
        System.out.println(arr[14]);//p
        String strNew = "";
        for(int i = arr.length-1; i>=0; i--){

            if(arr[i].equalsIgnoreCase("a") || arr[i].equalsIgnoreCase("e") || arr[i].equalsIgnoreCase("i")
                    || arr[i].equalsIgnoreCase("o") || arr[i].equalsIgnoreCase("u")){

                arr[i] = "*";
            }

            strNew= strNew + arr[i];

        }

        System.out.println(strNew); //sn**t*l*t*rgn*C







 //printAge(500);
    }
    public static void printAge(int age)
    {
      if(age<0||age>100){
          try {
              throw new IllegalAge("no age bigger than 100 or less than 0");
          } catch (IllegalAge e) {
              throw new RuntimeException(e);
          }
      }

    }

}
