package Batch132.JavaTeachingB132mrSuleyman.day13arraysmultidimensionalarraysMrSuleyman;

import java.util.Arrays;

public class Arrays02mtsuleyman {
    public static void main(String[] args) {
        /// ex1  type  a code to check if a specific element exist in the arroy or not
        // lets create a char data type array this time
        char ch[]=new char[5];
        ch[0]='A';
        ch[1]='Y';
        ch[2]='C';
        ch[3]='I';
        ch[4]='D';
// 1st way

        int counter=0;
        for(char w: ch){    // java takes the first char and check is eqal to Y or not then not equal go check next char   it is eqal then increace counter then break the loop
           if(w=='Y'){
               counter++;
               break;   //break takes java out of foe each loop
           }
        }
        if(counter>0){
            System.out.println("it exists");
        }else{
            System.out.println("it doesnt exist");
        }
        //2nd way    with binarySeach() method we can understand the index of an elmetes  thats says us it exists
  //2nd way :  use binarySeach() method teels u if the element exist or not in an array
  // in order to use binarySearch() method ,first u have to use sort() method
        Arrays.sort(ch);   // puts all elements in order  [...........Y]   *********************************************************************
       int idx1= Arrays.binarySearch(ch,'Y');  // if 'A' EXIST  then It gives the index of 'A'   if it doest exit gives-1
        System.out.println(idx1);  //4   It gives us the index   then we understand 'Y' ies exist
        if(idx1>=0){
            System.out.println("it exist");
        }else{
            System.out.println("it doesnt exist");
        }
      int idx2= Arrays.binarySearch(ch,'C');  //Gives index of existing element
        int idx3= Arrays.binarySearch(ch,'X');   //-5
        int idx4= Arrays.binarySearch(ch,'E');  // -4



    }
}
