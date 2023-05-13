package JavaQuestionBnak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class calismaListex12 {
    public static void main(String[] args) {
        /*  ex10
        Find the sum of the least and the greatest price given in a String list
Example: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70
         */
        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$8.25");
        myList.add("$54.45");
        List<Double> decimalList = new ArrayList<>();
      int  indx=0;
       for(String w:myList){
          // decimalList.set(indx, Double.valueOf(w.replace("$","")));
           //indx++;
           decimalList.add(Double.valueOf(w.replace("$","")));
       }
        System.out.println(decimalList);  //[12.99, 23.6, 8.25, 54.45]
        Collections.sort(myList);
    double smallest= decimalList.get(0);
    double greates= decimalList.get(myList.size()-1);
        System.out.println(smallest+"and"+greates);  //12.99and54.45
        /* ex11
        Check if all elements are unique in an integer List by using loops
         */
        List<Integer> myyList = new ArrayList<>();
        myyList.add(10);
        myyList.add(31);
        myyList.add(15);
        myyList.add(7);
      //  myyList.add(15);
        myyList.add(23);
      // myyList.add(31);
     //  myyList.add(23);
        System.out.println(myyList);  //[10, 31, 15, 7, 15, 23,31]
   //  List<Integer> copyOfMyyList= new ArrayList<>();
    // copyOfMyyList.addAll(myyList);
      //  System.out.println(copyOfMyyList);  //  [10, 31, 15, 7, 15, 23] copy
        int counter=0;
        //my own way didnt work why
  /*      System.out.println(myyList.indexOf(23));//5
      for(int w:myyList){
          if(myyList.indexOf(w)!=myList.lastIndexOf(w)){
              counter++;
          }
      }
      if(counter>0){
          System.out.println("not unique");
      }else {
          System.out.println("unique");
      }   */
        System.out.println(myyList);
   int flag=0;
      for(int w:myyList){
          for(int k:myyList){
              if(w==k){
     flag++;
              }
              }
          }
      if(flag==myyList.size()){
          System.out.println("unique");
      }else{
          System.out.println("not unique");
      }
/*  ex12
Mountain Array ==> [0, 2, 5, 3, 1] It is constantly increasing to the maximum value,
decreasing constantly after the maximum value
Not Mountain Array ==> [5, 2, 7, 1, 4] It is decreasing then increasing to the maximum value,
decreasing and increasing after the maximum value
Type a code to check if any given array is Mountain Array or not
 */
        /*  my method failed
        int a[] = { 0, 2, 5, 3, 1 };
        List<Integer> list = new ArrayList<>();
   int biggestE=a[0];
        int indxOfBiggestE=0;
   for(int i=0;i<a.length;i++){
       biggestE=Math.max(biggestE,a[i]);
       indxOfBiggestE=i;
   }
        System.out.println(indxOfBiggestE);
        System.out.println(biggestE);   //5
        boolean isFirtPartIncrease=true;
        boolean isSecondPartDecrease= true;
        for(int i=0;i<2;i++){
            if(a[i]>=a[i+1]){
                isFirtPartIncrease=false;
            }else{
                isFirtPartIncrease=true;
            }
        }
        System.out.println(isFirtPartIncrease);
        for(int i=2;i<a.length;i++){
            if(a[i]<=a[i+1]){
                isSecondPartDecrease=false;
            }else{
                isSecondPartDecrease=true;
            }
        }
        System.out.println(isSecondPartDecrease);
  if(isFirtPartIncrease&&isSecondPartDecrease){
      System.out.println("mountain");
  }else{
      System.out.println("not mountain");
  }   */






    }
}
