package Batch132.JavaTeachingB132mrSuleyman.day18friday;

import java.util.Arrays;
import java.util.List;

public class Q01 {
    public static void main(String[] args) {


   List<Integer > list= Arrays.asList(4,6,5,-10,8,5,20);
        for(int i=0;i<list.size();i++){
            for(int k=i+1;k<list.size();k++){
                if(list.get(i)+list.get(k)==10){
                    System.out.println(list.get(i)+"and"+list.get(k));
                }
            }
        }
    /*    Find the middle element value in an integer array   //ben en basta yanlis anladim  not middle index element
        Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
                */

        int []arr= {12, 5, 8, 87, 21, 14, 15, 90}; // 8 elements
   Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  //[5, 8, 12, 14, 15, 21, 87, 90]
       int middleIndx= arr.length/2;
       if(arr.length%2!=0){
           System.out.println(" the middle element is "+arr[middleIndx]);
       }else {
           System.out.println("the middle elelemnt is"+ (double)(arr[middleIndx]+arr[middleIndx-1])/2);
       }

      /*  If the list has 15 as element, change all 15s to 51
        Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
        */
        List<Integer> listt= Arrays.asList(15, 12, 11, 15, 34, 43,15);
        if(listt.contains(15)){
            for(int w:listt){
                if(w==15){
                    listt.set(listt.indexOf(w),51);
                }
            }
        }else{
            System.out.println("the list has no element 15");
        }




        /*   ***  how  to conver an ARRAY into a LIST
        int []crr= {12, 5, 8, 87, 21, 14, 15, 90};
   List<Integer> crrList=new ArrayList<>();
    for(int i=0;i<crr.length;i++){
        crrList.add(crr[i]);
    }
        System.out.println(crrList);  //[12, 5, 8, 87, 21, 14, 15, 90]  */


    }
}
