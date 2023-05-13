package Batch132.JavaTeachingB132mrSuleyman.day12ArraysSara;
//Array question lesson 2022 september       previous Batch
   //split method always return a String array  *****
//for example   String a= "09/20/2022";
//  a.split("/") ==> String arr[09, 20, 2022]
import java.util.Arrays;

public class Arraycalismapreviousbatch01 {
    public static void main(String[] args) {
        // ex put all zero elements at hte end of array
        int arr[]={0,2,3,0,12,0};
        int brr[]=new int[arr.length];
        int indx=0;
 for(int i=0;i<arr.length;i++){
     if(arr[i]==0){
         continue;
     }else{
         brr[indx]=arr[i];
         indx++;
     }
 }
        System.out.println(Arrays.toString(brr));  //[2, 3, 12, 0, 0, 0]
// type code to check if a specific eement exist or not
        int crr[]={-12,23,5};
        int element=23;   //this way more dynamic    if u put a specific date in code than difficult to update the code
        int counter=0;
        for(int w:crr){   //for loop also possible
            if(w==element){
                counter++;
            }
        }
if(counter>0){
    System.out.println("the element exist");
}else{
    System.out.println("not exist");
}
// ex   09/20/2022 is given  print the date like Month:09 Day:20 Year 2022
        String date= "09/20/2022";
    String dateArray[]= date.split("/");  // split method always gives string   to store each string  i need an array container
        System.out.println(Arrays.toString(dateArray));  //[09, 20, 2022]
        System.out.print("Month:"+dateArray[0]);
        System.out.print("Day:"+dateArray[1]);
        System.out.print("Year:"+dateArray[2]);







    }
}
