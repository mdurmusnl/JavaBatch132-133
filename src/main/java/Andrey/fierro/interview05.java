package Andrey.fierro;

import java.util.Arrays;
import java.util.Comparator;

public class interview05 {
    public static void main(String[] args) {
   //very common interview question
        //if the code u typed doestn work, then what do u do?


        //q6 type a code to find the longest word in the give sentence
        String str=" I want to go to university to learn more about Java";
        String strArray[]= str.split(" ");
        int longestLength=strArray[0].length();
        for(String w:strArray){
            longestLength =Math.max(longestLength,w.length());

        }
        System.out.println(longestLength);
        for(String w:strArray){
            if(w.length()==longestLength){
                System.out.println(w);
            }
        }

        //2nd way is easier
        Arrays.sort(strArray);
        Arrays.sort(strArray, Comparator.comparing(String::length));
        System.out.println(strArray[strArray.length-1]);


          //type codes to create an int array and print the elements less than 10
        int age[] ={13,6,19,2,7,11};

        //can u please talk about method structure and why we use methods

        //how many methods are there in here  show him a pic
        //what is constructor
        //what is the difference between method and constructor

        //methods have return type contructor are not
        //method does action constructor does creation

        //Q2 when are we able to change the return type of a method in method overriding?

    }
    public static int getGcf(int num1,int num2){  //12  18
        int gfc=1;
        int smallest= Math.min(num1,num2);
        for(int i=1;i<=smallest  ; i++){
            if(num1%i==0&& num2%i==0){
                gfc=i;
            }
        }
        return gfc;
    }
}
