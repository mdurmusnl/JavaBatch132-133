package Andrey.fierro;

import java.util.Arrays;
import java.util.Comparator;

public class Interview04 {
    public static void main(String[] args) {
        //Q1 please type a code to print the initials of a given name in upper case
        String s="Lee brown james" ;//  ==>LBJ
       String first= s.split(" ")[0].substring(0,1).toUpperCase();
       String middle= s.split(" ")[1].substring(0,1).toUpperCase();
       String last = s.split(" ")[2].substring(0,1).toUpperCase();

        System.out.println(first+middle+last);

//Q2
         String pwd = "As1?fdes3";
        //Password should have at least 1 upper case

        boolean thirdRule= pwd.replaceAll("[^A-Z]", "").length()>0;
        System.out.println("thirdRule = " + thirdRule);


        //Q3   type code to swap two integers
        // a=12  b=5    -->  a = 5  b=12
        int a= 12, b=5;
        int temp =0;
        temp =a;
        a = b;
        b= temp;
        System.out.println(a+" "+b);

//q4  Count how many words start with 'a' or 'A' in a given String
        String m = "Apex is an object oriented programming language";
        String ss[]=m.split(" ");
        //System.out.println(Arrays.toString(ss)); //   [Apex, is, an, object, oriented, programming, language]
        int counter=0;
        for(String w:ss){
            if(w.startsWith("a")||w.startsWith("A")){
                counter++;
            }
        }
        System.out.println(counter);  //2

        //Type code to find array elements whose first and last characters are same
        String[] brr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        for(String w:brr ){
            String p=w.substring(0,1);
            String q=w.substring(w.length()-1,w.length());   // last letter
            if(w.startsWith(p)==w.endsWith(q)){
                System.out.print(w+" ");
            }
        }

        //Q4 print the elements before "Fierro" in the given array
        String arr[]=new String[5];
        arr[0]="Tom";
        arr[1]="Andrey";
        arr[2]="Fierro";
        arr[3]="John";
        arr[4]="Peter";
        System.out.println(Arrays.toString(arr));
        for(String w:arr){

            if(w.equals("Fierro")){
                break;
            }
            System.out.println(w);
        }

      //  ex9  type a code to find  if a given element exist in a given array or not
        String[] prr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String l="object";
        int counterP=0;
        for(String w:prr){
            if(w.equalsIgnoreCase(l)){
                counterP++;
            }
        }
        if(counterP>0){
            System.out.println("it exists");
        }else{
            System.out.println(l+"   does not exist");
        }



        //Q5  print the lements different from "Fierro"
        for (String w:arr){
            if(w.equals("Fierro")){
                continue;
            }
            System.out.print(w+" ");
        }
        System.out.println();


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

   //     Q7  create a method to calculate the factorial of a number given by a user
          //For example factorial of 4 is 24 ,  in maths operation --> 4!=4x3x2x1=24
        /*
        public static void getFactorial(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a positive integer");
        int number=input.nextInt();
        int factorial =1;
        while(number>0){
            factorial*=number;
            number--;
        }
        System.out.println(factorial);
        }
         */



    }
}
