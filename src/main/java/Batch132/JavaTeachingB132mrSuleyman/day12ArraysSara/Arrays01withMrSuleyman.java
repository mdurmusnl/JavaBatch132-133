package Batch132.JavaTeachingB132mrSuleyman.day12ArraysSara;

import java.util.Arrays;
//mr suleyman    01/16/2023
//ARRAYS CANNOT store non primitives, array store references of nonprimitives
public class Arrays01withMrSuleyman {
    public static void main(String[] args) {
        //Arrays store only same data type and the length must be defined at the time of creation
        String sixthGraders[]=new String[5];
        System.out.println(Arrays.toString(sixthGraders));  //[null, null, null, null, null]
                                                            //ismi sithGrader olan arrya listesindeki elemanlari bastirir
      sixthGraders[1]="ali";
      sixthGraders[4]="Peter";
        System.out.println(Arrays.toString(sixthGraders));  //[null, ali, null, null, Peter]
 //how to print a specfic element(s) of an arroy
        System.out.println(sixthGraders[1]);   //ali
        sixthGraders[0]="tom";
        sixthGraders[2]="Jim";
        sixthGraders[3]="Mark";
        System.out.println(sixthGraders[0]+"-"+sixthGraders[4]);  // tom - Peter
// how to find number of elements in an array
        //***  in String   length()  is a method  with action of iterating on the list   but
        //in Arrys  length is just a number
        System.out.println(sixthGraders.length);  //5
// ex1 create an array add 5 elements type a code to print sum of the characters of first and last element
      //dynamic code means which works for any scnerio  mean independent   its a coding standart
        String cities[]=new String[5];
        cities[0]="Miami";
        cities[1]="New York";
        cities[2]="Istanbul";
        cities[3]="Berlin";
        cities[4]="Tokyo";
        int numOfCharInFirst=cities[0].length();   //
                               // bu bir sayi    bu ise bir fonksiyon
      int numOfCharInLast= cities[cities.length-1].length();  //in this way  the code is dynamic    if tje lenth of array changes the code works smoothly
        System.out.println(numOfCharInLast+numOfCharInLast);  //10
//ex2   create a string Array add 5 elements in it, type a code to print the sum of all characters in all elements on the console
  String names[]= new String[5];
  names[0]="Brad pitt";
  names[1]="Cuneyt Arkin";
  names[2]="Ajda Pekkan";
  names[3]="Angelina Jolie";
  names[4]="Silvester Stallone";
      System.out.println(Arrays.toString(names));
  //repeated action
      //for loop
      int sum=0;
      for(int i=0;i<names.length;i++){
        sum+=names[i].length();    //names[0]  ==> Brad Pitt     names[0].length ==>9
      }
      System.out.println(sum);
      System.out.println("for each loop ile total bulma");
//2nd  for each loop   Enhanced loop    if this is possible  then use it  the best loop

      int total=0;
      for(String w:names){  //w  gecici bir element  names icinde geziniyor
         total+=w.length();
      }
      System.out.println(total);
//  "for each loops " can be used for Array  ans COLLECTIONS
//   SOMETIMES " FOR EACH LOOP " ca not be used with Arrays and Collections as well
                //wehn using indexes is must then using for each loop is impossible



    }
}
