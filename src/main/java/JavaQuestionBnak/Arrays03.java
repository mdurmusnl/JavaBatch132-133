package JavaQuestionBnak;

import java.util.Arrays;
import java.util.Scanner;

// arrays   page 225
public class Arrays03 {
    public static void main(String[] args) {
        /*   ARRAYS  EX11
        Type code to put all zeros to end in an integer array.
Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
         */
        Integer[] arr = new Integer[]{5, 0, 2, 0, 3};
        Integer[] brr = new Integer[5];
        int indx=0;
        int lastindx=arr.length-1;
        for(int w:arr){
            if(w==0){
               brr[lastindx]=w;
               lastindx--;
            }else{
                brr[indx]=w;
                indx++;
            }
        }
        System.out.println(Arrays.toString(brr));  // [5, 2, 3, 0, 0]
/*  ex12
Create an integer array by getting the elements from the user then print the difference
between the smallest and the greatest elements on the console.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = scan.nextInt();
        int crr[] = new int[len];
        System.out.println("enter "+len +" array elements");
        for(int i=0;i<crr.length;i++){
            crr[i]=scan.nextInt();
        }
        Arrays.sort(crr);
        System.out.println(Arrays.toString(crr));
       int biggest=crr[crr.length-1];
       int smallest=crr[0];
        System.out.println(biggest);
        System.out.println(smallest);
/*  EX13
Ask the user to enter 2 Strings. If the characters and the numbers of characters of the
Strings are the same then print "Anagram" on the console. Otherwise, print "Not Anagram"
on the console. Ignore cases. For example; "Mary" and "army" and "RAMY" are Anagrams.
 */
        System.out.println();
        Scanner input = new Scanner(System.in);
     System.out.println("Enter two Strings");
        String s1 = input.nextLine();
        String s2 = input.nextLine();
   String s1rr[]=s1.toLowerCase().split("");
   String s2rr[]=s2.toLowerCase().split("");
   Arrays.sort(s1rr);
   Arrays.sort(s2rr);
        System.out.println(Arrays.toString(s1rr));  //[a, m, r, y]
        System.out.println(Arrays.toString(s2rr));  //[a, m, r, y]
        System.out.println();
   if(s1.length()!=s2.length()){
       System.out.println("not anagram");
   }else if(Arrays.equals(s1rr,s2rr)){
       System.out.println("anagram");
   }else{
       System.out.println("not anagram");
   }


    }
}
