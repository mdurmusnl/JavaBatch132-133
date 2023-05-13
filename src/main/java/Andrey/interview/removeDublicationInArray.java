package Andrey.interview;

import java.util.Arrays;

public class removeDublicationInArray {
    public static void main(String[] args) {
        int arr[] = {11, 12, 13, 11, 15};
        Arrays.sort(arr); //[11,11,12,13,15]
        int indexOfArr=arr.length;
        int temp[]=new int[indexOfArr];
          int j=0;
          for(int i=0;i<indexOfArr-1;i++){
              if(arr[i]!=arr[i+1]){
                  temp[j]=arr[i];
                  j++;
              }
          }
          temp[j]=arr[indexOfArr-1];   //this tak care of last element to put in the temp array
        j++;
          for(int k=0;k<j;k++){
           System.out.print(temp[k]+" ");  //kind of manually printing
       }


        }



}
