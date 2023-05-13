package JavaQuestionBnak;

import java.util.Scanner;

//page 214
public class loop06 {
    public static void main(String[] args) {
       /*   ex 26
       Get a String and a character from user
Count the number of characters between the first occurrence and the last occurrence of the
given character in the String
Do not count the space characters
If the character which user selected is displayed just once in the String return -1
If the character which user selected does not exist in the String return -1
For example; "Java is easy" - 'a' ==> 5
"Java is easy" - 'w' ==> -1
"Java is easy" - 'e' ==> -1

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String...");
        String s = scan.nextLine();
        System.out.println("Enter a character...");
        char ch = scan.next().charAt(0);
        int counter =0;
int firstOccIndx=s.indexOf(ch);
int lastOccIndx= s.lastIndexOf(ch);
if(firstOccIndx==lastOccIndx){
    System.out.println("-1");
}else{
    for(int i=firstOccIndx+1;i<lastOccIndx;i++){
        if(s.charAt(i)!=' '){
            counter++;
        }
    }
    System.out.println(counter);
}
From a given array find all pairs whose sum is a given number.
If the array is {4, 6, 5, -10, 8, 5, 20} and the number is 10 then output will be
4+6=10, 5+5=10, -10+20=10
*/
        Integer arr[] = {4, 6, 5, -10, 8, 5, 20};
        int num = 10;
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length-1;i++){
              if(arr[i]+arr[j]==num){
                  System.out.println(arr[i]+ "+" +arr[j]+ "=" +num);
              }
          }
        }

        /*
Type a code that prints all prime numbers less than a given number. Example: if user enters
20 output will be 2, 3, 5, 7, 11, 13, 17, 19

        Scanner scannn = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int n = scannn.nextInt();


*/
    }
}
